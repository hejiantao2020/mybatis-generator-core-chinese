package com.athjt.springboot.service;

import com.athjt.springboot.model.Criteria;
import com.athjt.springboot.model.Teacher;
import java.util.List;

public interface TeacherService {
    int countByExample(Criteria example);

    Teacher selectByPrimaryKey(Integer id);

    List<Teacher> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(Teacher record, Criteria example);

    int updateByExample(Teacher record, Criteria example);

    int insert(Teacher record);

    int insertSelective(Teacher record);
}