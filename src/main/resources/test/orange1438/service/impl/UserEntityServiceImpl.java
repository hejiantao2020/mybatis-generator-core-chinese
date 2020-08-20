package orange1438.service.impl;

import com.hjt.springboot.mappers.UserMapper;
import com.hjt.springboot.model.Criteria;
import com.hjt.springboot.model.UserEntity;
import com.hjt.springboot.service.UserEntityService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserEntityServiceImpl implements UserEntityService {
    @Autowired
    private UserMapper userMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserEntityServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserEntity selectByPrimaryKey(Integer userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    public List<UserEntity> selectByExample(Criteria example) {
        return this.userMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer userId) {
        return this.userMapper.deleteByPrimaryKey(userId);
    }

    public int updateByPrimaryKeySelective(UserEntity record) {
        return this.userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserEntity record) {
        return this.userMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserEntity record, Criteria example) {
        return this.userMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserEntity record, Criteria example) {
        return this.userMapper.updateByExample(record, example);
    }

    public int insert(UserEntity record) {
        return this.userMapper.insert(record);
    }

    public int insertSelective(UserEntity record) {
        return this.userMapper.insertSelective(record);
    }
}