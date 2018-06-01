package com.junc.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.junc.demo.dao.CopyMapper;
import com.junc.demo.entity.Copy;
import com.junc.demo.entity.CopyExample;
import com.junc.demo.entity.CopyExample.Criteria;
import com.junc.demo.pojo.CopyVo;

import com.junc.demo.util.WebConstant;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CopyService {
    @Autowired
    private CopyMapper copyMapper;

    public CopyVo list(CopyVo thisPojo){

        CopyExample copyExample = new CopyExample();
        Criteria criteria = copyExample.createCriteria();
        criteria.andStatusNotEqualTo(WebConstant.DELETE_STATUS);

        if(StringUtils.isNotBlank(thisPojo.getId())){
            criteria.andIdEqualTo(thisPojo.getId());
        }

        PageHelper.startPage(thisPojo.getPageNo(), thisPojo.getPageSize());


        List<Copy> dateList = copyMapper.selectByExample(copyExample);

        PageInfo<Copy> pagehelper = new PageInfo<>(dateList);

        thisPojo.setData(pagehelper);
        thisPojo.setResultCode(WebConstant.SERVICE_SUCCESS);
        thisPojo.setCountTotal(dateList.size());

        return thisPojo;

    }


    public  CopyVo save(CopyVo thisPojo){
        Copy thisEntity = null;
        Date nowDate = new Date();
        int serviceStatus = -1;
        if (null!=thisPojo.getId()&&!"".equals(thisPojo.getId())){
            thisEntity = copyMapper.selectByPrimaryKey(thisPojo.getId());
            BeanUtils.copyProperties(thisPojo,thisEntity);
            thisEntity.setLastUpdateTime(nowDate);
            thisEntity.setLastUpdateUuid(thisPojo.getUserId()==null?null:thisPojo.getUserId());
            serviceStatus = copyMapper.updateByPrimaryKey(thisEntity);
        }else{
            thisEntity = new Copy();
            BeanUtils.copyProperties(thisPojo,thisEntity);
            thisEntity.setCreateTime(nowDate);
            thisEntity.setId(UUID.randomUUID().toString());
            thisEntity.setStatus(WebConstant.INSERT_STATUS);
            thisEntity.setCreateUuid(thisPojo.getUserId()==null?null:thisPojo.getUserId());
            serviceStatus = copyMapper.insertSelective(thisEntity);
        }
        if(serviceStatus>=0){
            BeanUtils.copyProperties(thisEntity,thisPojo);
            thisPojo.operationSuccess();
            thisPojo.setPrompt("执行成功");
        }else{
            BeanUtils.copyProperties(thisEntity,thisPojo);
            thisPojo.operationFail();
            thisPojo.setPrompt("service错误");
        }
        return thisPojo;
    }
    public CopyVo getById(CopyVo thisPojo){
        if(null!=thisPojo.getId()&&!"".equals(thisPojo.getId())){
            Copy thisEntyty = copyMapper.selectByPrimaryKey(thisPojo.getId());
            if(null!=thisEntyty&&!"".equals(thisEntyty)){
                BeanUtils.copyProperties(thisEntyty,thisPojo);
                thisPojo.operationSuccess();
                thisPojo.setPrompt("执行成功");
            }
        }else{
            thisPojo.operationFail();
            thisPojo.setPrompt("thisPojo的Id不能是null");
        }
        return thisPojo;
    }

    public CopyVo deleteById(CopyVo thisPojo){
        if(null!=thisPojo.getId()&&!"".equals(thisPojo.getId())){
            Copy thisEntity = copyMapper.selectByPrimaryKey(thisPojo.getId());
            if (null!=thisEntity&&!"".equals(thisEntity)){
                thisPojo.setStatus(WebConstant.DELETE_STATUS);
                int isNotSuccess = copyMapper.updateByPrimaryKey(thisEntity);
                if(isNotSuccess>=0){
                    thisPojo.operationSuccess();
                    thisPojo.setPrompt("执行成功");
                }
            }else{
                thisPojo.operationFail();
                thisPojo.setPrompt("thisEntity是null");
            }
        }else{
            thisPojo.operationFail();
            thisPojo.setPrompt("thisPojo的Id不能是null");
        }
        return thisPojo;
    }

}
