package com.junc.demo.dao;

import com.junc.demo.entity.UserAccountInformation;
import com.junc.demo.entity.UserAccountInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountInformationMapper {
    long countByExample(UserAccountInformationExample example);

    int deleteByExample(UserAccountInformationExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserAccountInformation record);

    int insertSelective(UserAccountInformation record);

    List<UserAccountInformation> selectByExample(UserAccountInformationExample example);

    UserAccountInformation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAccountInformation record, @Param("example") UserAccountInformationExample example);

    int updateByExample(@Param("record") UserAccountInformation record, @Param("example") UserAccountInformationExample example);

    int updateByPrimaryKeySelective(UserAccountInformation record);

    int updateByPrimaryKey(UserAccountInformation record);
}