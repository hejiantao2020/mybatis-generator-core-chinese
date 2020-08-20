package orange1438.service.impl;

import com.athjt.springboot.mappers.AdminMapper;
import com.athjt.springboot.model.Admin;
import com.athjt.springboot.model.Criteria;
import com.athjt.springboot.service.AdminService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.adminMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Admin selectByPrimaryKey(Integer adminId) {
        return this.adminMapper.selectByPrimaryKey(adminId);
    }

    public List<Admin> selectByExample(Criteria example) {
        return this.adminMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer adminId) {
        return this.adminMapper.deleteByPrimaryKey(adminId);
    }

    public int updateByPrimaryKeySelective(Admin record) {
        return this.adminMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Admin record) {
        return this.adminMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.adminMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Admin record, Criteria example) {
        return this.adminMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Admin record, Criteria example) {
        return this.adminMapper.updateByExample(record, example);
    }

    public int insert(Admin record) {
        return this.adminMapper.insert(record);
    }

    public int insertSelective(Admin record) {
        return this.adminMapper.insertSelective(record);
    }
}