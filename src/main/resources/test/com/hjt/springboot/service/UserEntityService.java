package com.hjt.springboot.service;

import com.hjt.springboot.model.Criteria;
import com.hjt.springboot.model.UserEntity;
import java.util.List;

public interface UserEntityService {
    int countByExample(Criteria example);

    UserEntity selectByPrimaryKey(Integer userId);

    List<UserEntity> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserEntity record, Criteria example);

    int updateByExample(UserEntity record, Criteria example);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);
}