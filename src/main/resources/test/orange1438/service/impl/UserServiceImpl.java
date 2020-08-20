package orange1438.service.impl;

import com.athjt.springboot.mappers.UserMapper;
import com.athjt.springboot.model.Criteria;
import com.athjt.springboot.model.User;
import com.athjt.springboot.service.UserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public User selectByPrimaryKey(Integer userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    public List<User> selectByExample(Criteria example) {
        return this.userMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer userId) {
        return this.userMapper.deleteByPrimaryKey(userId);
    }

    public int updateByPrimaryKeySelective(User record) {
        return this.userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return this.userMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(User record, Criteria example) {
        return this.userMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(User record, Criteria example) {
        return this.userMapper.updateByExample(record, example);
    }

    public int insert(User record) {
        return this.userMapper.insert(record);
    }

    public int insertSelective(User record) {
        return this.userMapper.insertSelective(record);
    }
}