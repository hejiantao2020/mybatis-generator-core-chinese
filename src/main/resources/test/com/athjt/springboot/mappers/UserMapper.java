/* https://github.com/orange1438 */
package com.athjt.springboot.mappers;

import com.athjt.springboot.model.User;
import com.athjt.springboot.model.UserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 本文件由 https://github.com/orange1438/mybatis-generator-core-chinese-annotation1.3.5-chinese-annotation 自动生成
 * @author orange1438 code generator
 * date:2020/08/17 20:05
 */
public interface UserMapper {
    /** 
     * 查询数量
     * @param example 条件对象
     * @return 返回数据的数量
     */
    long countByExample(UserCriteria example);

    /** 
     * 根据条件删除
     * @param example 条件对象
     * @return 返回删除成功的数量
     */
    int deleteByExample(UserCriteria example);

    /** 
     * 根据ID删除
     * @param userId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Integer userId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(User record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(User record);

    /** 
     * 根据条件查询（二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<User> selectByExample(UserCriteria example);

    /** 
     * 根据ID查询
     * @param userId 主键ID
     * @return 返回查询的结果
     */
    User selectByPrimaryKey(Integer userId);

    /** 
     * 根据条件修改对应字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example);

    /** 
     * 根据条件修改所有字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(User record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(User record);
}