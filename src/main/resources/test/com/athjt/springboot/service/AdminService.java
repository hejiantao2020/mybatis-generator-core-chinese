package com.athjt.springboot.service;

import com.athjt.springboot.model.Admin;
import com.athjt.springboot.model.Criteria;
import java.util.List;

public interface AdminService {
    int countByExample(Criteria example);

    Admin selectByPrimaryKey(Integer adminId);

    List<Admin> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(Admin record, Criteria example);

    int updateByExample(Admin record, Criteria example);

    int insert(Admin record);

    int insertSelective(Admin record);
}