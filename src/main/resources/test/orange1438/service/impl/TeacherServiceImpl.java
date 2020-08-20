package orange1438.service.impl;

import com.athjt.springboot.mappers.TeacherMapper;
import com.athjt.springboot.model.Criteria;
import com.athjt.springboot.model.Teacher;
import com.athjt.springboot.service.TeacherService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    private static final Logger logger = LoggerFactory.getLogger(TeacherServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.teacherMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Teacher selectByPrimaryKey(Integer id) {
        return this.teacherMapper.selectByPrimaryKey(id);
    }

    public List<Teacher> selectByExample(Criteria example) {
        return this.teacherMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.teacherMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Teacher record) {
        return this.teacherMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Teacher record) {
        return this.teacherMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.teacherMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Teacher record, Criteria example) {
        return this.teacherMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Teacher record, Criteria example) {
        return this.teacherMapper.updateByExample(record, example);
    }

    public int insert(Teacher record) {
        return this.teacherMapper.insert(record);
    }

    public int insertSelective(Teacher record) {
        return this.teacherMapper.insertSelective(record);
    }
}