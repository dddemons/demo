package com.junc.demo.service;


import com.junc.demo.dao.UserAccountInformationMapper;
import com.junc.demo.entity.UserAccountInformation;
import com.junc.demo.entity.UserAccountInformationExample;
import com.junc.demo.entity.UserAccountInformationExample.*;
import com.junc.demo.pojo.UserAccountInformationVo;
import com.junc.demo.util.Md5Utils;
import com.junc.demo.util.WebConstant;
import org.springframework.beans.factory.annotation.Autowired;
import sun.security.provider.MD5;

import java.util.ArrayList;
import java.util.List;

/**
 * AccountService.class
 *
 * @author junc
 * @date 2018年5月31日10:27:23
 * 登录,注册
 */
public class AccountService {

    @Autowired
    private UserAccountInformationMapper userAccountInformationMapper;

    public UserAccountInformationVo login(UserAccountInformationVo userAccountInformationVo) {

        UserAccountInformationExample userAccountInformationExample = new UserAccountInformationExample();
        Criteria criteriaOne = userAccountInformationExample.createCriteria();
        Criteria criteriaTwo = userAccountInformationExample.createCriteria();
        Criteria criteriaThree = userAccountInformationExample.createCriteria();
        /**
         * 账号状态不可以是封禁,冻结状态
         * 可以是账号,手机号,邮箱登录
         */

        criteriaOne.andStatusNotEqualTo(WebConstant.ACCOUNT_STATUS_PROHIBITION).
                andStatusEqualTo(WebConstant.ACCOUNT_STATUS_FROZEN).
                andAccountEqualTo(userAccountInformationVo.getAccount());
        criteriaTwo.andStatusNotEqualTo(WebConstant.ACCOUNT_STATUS_PROHIBITION).
                andStatusEqualTo(WebConstant.ACCOUNT_STATUS_FROZEN).
                andPhoneEqualTo(userAccountInformationVo.getPhone());
        userAccountInformationExample.or(criteriaTwo);
        criteriaThree.andStatusNotEqualTo(WebConstant.ACCOUNT_STATUS_PROHIBITION).
                andStatusEqualTo(WebConstant.ACCOUNT_STATUS_FROZEN).
                andEmailEqualTo(userAccountInformationVo.getEmail());
        userAccountInformationExample.or(criteriaThree);


        /**
         * @parm junc
         * @data 2018年5月31日22:42:56
         * (前端getPassword+验证码进行MD5加密)通过base64加密传到controller
         * Controller进行base64解密并放入实体A
         * Service通过账号,手机号,邮箱找到对应数据并放入数组
         * (str = List.getPassWord+验证码)进行md5加密
         * 对比实体A中的密码和str是否一致
         */
        List<UserAccountInformation> accountList = userAccountInformationMapper.selectByExample(userAccountInformationExample);

        if (null != accountList && WebConstant.LISTSIZEONE.equals(accountList.size())) {

            UserAccountInformation userAccountInformation = accountList.get(0);

            String userPasswordMd5 = Md5Utils.MD5(userAccountInformation.getPassword());

            if(userAccountInformationVo.getPassword().equalsIgnoreCase(userPasswordMd5)){


            }

        }






        return userAccountInformationVo;
    }


}
