/* https://github.com/orange1438 */
package com.hjt.springboot.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author orange1438 code generator
 * date:2020/08/08 16:14
 */
public class UserEntity implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -5740478359821481742L;

    /** 
     * 用户ID
     */ 
    private Integer userId;

    /** 
     * 用户登录名
     */ 
    private String userName;

    /** 
     * 用户真实姓名
     */ 
    private String userDealName;

    /** 
     * 登录密码
     */ 
    private String password;

    /** 
     * 用户联系方式
     */ 
    private String userPhone;

    /** 
     * 用户住址
     */ 
    private String userAddress;

    /** 
     * 是否删除(0-未删除;1-已删除)  默认：0
     */ 
    private Integer deleted;

    /** 
     * 创建时间
     */ 
    private Date createTime;

    /** 
     * 修改时间
     */ 
    private Date updateTime;

    /** 
     * 创建人
     */ 
    private String createUser;

    /** 
     * 修改人
     */ 
    private String updateUser;

    /** 
     * 获取 用户ID sys_user.user_id
     * @return 用户ID
     */
    public final Integer getUserId() {
        return userId;
    }

    /** 
     * 设置 用户ID sys_user.user_id
     * @param userId 用户ID
     */
    public final void setUserId(Integer userId) {
        this.userId = userId;
    }

    /** 
     * 获取 用户登录名 sys_user.user_name
     * @return 用户登录名
     */
    public final String getUserName() {
        return userName;
    }

    /** 
     * 设置 用户登录名 sys_user.user_name
     * @param userName 用户登录名
     */
    public final void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /** 
     * 获取 用户真实姓名 sys_user.user_deal_name
     * @return 用户真实姓名
     */
    public final String getUserDealName() {
        return userDealName;
    }

    /** 
     * 设置 用户真实姓名 sys_user.user_deal_name
     * @param userDealName 用户真实姓名
     */
    public final void setUserDealName(String userDealName) {
        this.userDealName = userDealName == null ? null : userDealName.trim();
    }

    /** 
     * 获取 登录密码 sys_user.password
     * @return 登录密码
     */
    public final String getPassword() {
        return password;
    }

    /** 
     * 设置 登录密码 sys_user.password
     * @param password 登录密码
     */
    public final void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 
     * 获取 用户联系方式 sys_user.user_phone
     * @return 用户联系方式
     */
    public final String getUserPhone() {
        return userPhone;
    }

    /** 
     * 设置 用户联系方式 sys_user.user_phone
     * @param userPhone 用户联系方式
     */
    public final void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /** 
     * 获取 用户住址 sys_user.user_address
     * @return 用户住址
     */
    public final String getUserAddress() {
        return userAddress;
    }

    /** 
     * 设置 用户住址 sys_user.user_address
     * @param userAddress 用户住址
     */
    public final void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /** 
     * 获取 是否删除(0-未删除;1-已删除) sys_user.deleted
     * @return 是否删除(0-未删除;1-已删除)
     */
    public final Integer getDeleted() {
        return deleted;
    }

    /** 
     * 设置 是否删除(0-未删除;1-已删除) sys_user.deleted
     * @param deleted 是否删除(0-未删除;1-已删除)
     */
    public final void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /** 
     * 获取 创建时间 sys_user.create_time
     * @return 创建时间
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 创建时间 sys_user.create_time
     * @param createTime 创建时间
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 修改时间 sys_user.update_time
     * @return 修改时间
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 修改时间 sys_user.update_time
     * @param updateTime 修改时间
     */
    public final void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * 获取 创建人 sys_user.create_user
     * @return 创建人
     */
    public final String getCreateUser() {
        return createUser;
    }

    /** 
     * 设置 创建人 sys_user.create_user
     * @param createUser 创建人
     */
    public final void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /** 
     * 获取 修改人 sys_user.update_user
     * @return 修改人
     */
    public final String getUpdateUser() {
        return updateUser;
    }

    /** 
     * 设置 修改人 sys_user.update_user
     * @param updateUser 修改人
     */
    public final void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userDealName=").append(userDealName);
        sb.append(", password=").append(password);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", deleted=").append(deleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append("]");
        return sb.toString();
    }
}