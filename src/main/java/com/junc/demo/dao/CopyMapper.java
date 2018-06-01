package com.junc.demo.dao;

import com.junc.demo.entity.Copy;
import com.junc.demo.entity.CopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CopyMapper {
    long countByExample(CopyExample example);

    int deleteByExample(CopyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Copy record);

    int insertSelective(Copy record);

    List<Copy> selectByExample(CopyExample example);

    Copy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Copy record, @Param("example") CopyExample example);

    int updateByExample(@Param("record") Copy record, @Param("example") CopyExample example);

    int updateByPrimaryKeySelective(Copy record);

    int updateByPrimaryKey(Copy record);
}