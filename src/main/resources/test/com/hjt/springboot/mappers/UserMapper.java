/* https://github.com/orange1438 */
package com.hjt.springboot.mappers;

import com.hjt.springboot.model.UserEntity;
import com.hjt.springboot.model.UserEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 本文件由 https://github.com/orange1438/mybatis-generator-core-chinese-annotation1.3.5-chinese-annotation 自动生成
 * @author orange1438 code generator
 * date:2020/08/08 16:14
 */
public interface UserMapper {
    /** 
     * 查询数量
     * @param example 条件对象
     * @return 返回数据的数量
     */
    long countByExample(UserEntityCriteria example);

    /** 
     * 根据条件删除
     * @param example 条件对象
     * @return 返回删除成功的数量
     */
    int deleteByExample(UserEntityCriteria example);

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
    int insert(UserEntity record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(UserEntity record);

    /** 
     * 根据条件查询（二进制大对象）
     * @param example 条件对象
     * @return 返回查询的结果
     */
    List<UserEntity> selectByExample(UserEntityCriteria example);

    /** 
     * 根据ID查询
     * @param userId 主键ID
     * @return 返回查询的结果
     */
    UserEntity selectByPrimaryKey(Integer userId);

    /** 
     * 根据条件修改对应字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityCriteria example);

    /** 
     * 根据条件修改所有字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     * @return 返回更新成功的数量
     */
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityCriteria example);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(UserEntity record);
}