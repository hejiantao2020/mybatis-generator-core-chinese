package com.athjt.springboot.service;

import com.athjt.springboot.model.Criteria;
import com.athjt.springboot.model.User;
import java.util.List;

public interface UserService {
    int countByExample(Criteria example);

    User selectByPrimaryKey(Integer userId);

    List<User> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(User record, Criteria example);

    int updateByExample(User record, Criteria example);

    int insert(User record);

    int insertSelective(User record);
}