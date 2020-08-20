/* https://github.com/orange1438 */
package com.athjt.springboot.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * 主播表 teacher
 * @author orange1438 code generator
 * date:2020/08/17 20:05
 */
public class Teacher implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -8188652414762083108L;

    /** 
     */ 
    private Integer id;

    /** 
     * 头像
     */ 
    private String avatarUrl;

    /** 
     * 性别  默认：0
     */ 
    private Integer sex;

    /** 
     * 手机号
     */ 
    private String mobile;

    /** 
     * 密码
     */ 
    private String password;

    /** 
     * 个人介绍
     */ 
    private String intro;

    /** 
     * 最后一次登录时间
     */ 
    private Date lastLoginTime;

    /** 
     * 创建时间
     */ 
    private Date createTime;

    /** 
     * 修改时间
     */ 
    private Date updateTime;

    /** 
     */ 
    private Integer age;

    /** 
     * 昵称
     */ 
    private String nickName;

    /** 
     * 真实姓名
     */ 
    private String realName;

    /** 
     */ 
    private Integer coin;

    /** 
     */ 
    private Integer diamond;

    /** 
     * 逻辑删除0-未删除;1-已删除  默认：0
     */ 
    private Integer deleted;

    /** 
     * 获取 teacher.id
     * @return teacher.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 teacher.id
     * @param id teacher.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 头像 teacher.avatar_url
     * @return 头像
     */
    public final String getAvatarUrl() {
        return avatarUrl;
    }

    /** 
     * 设置 头像 teacher.avatar_url
     * @param avatarUrl 头像
     */
    public final void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /** 
     * 获取 性别 teacher.sex
     * @return 性别
     */
    public final Integer getSex() {
        return sex;
    }

    /** 
     * 设置 性别 teacher.sex
     * @param sex 性别
     */
    public final void setSex(Integer sex) {
        this.sex = sex;
    }

    /** 
     * 获取 手机号 teacher.mobile
     * @return 手机号
     */
    public final String getMobile() {
        return mobile;
    }

    /** 
     * 设置 手机号 teacher.mobile
     * @param mobile 手机号
     */
    public final void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /** 
     * 获取 密码 teacher.password
     * @return 密码
     */
    public final String getPassword() {
        return password;
    }

    /** 
     * 设置 密码 teacher.password
     * @param password 密码
     */
    public final void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 
     * 获取 个人介绍 teacher.intro
     * @return 个人介绍
     */
    public final String getIntro() {
        return intro;
    }

    /** 
     * 设置 个人介绍 teacher.intro
     * @param intro 个人介绍
     */
    public final void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /** 
     * 获取 最后一次登录时间 teacher.last_login_time
     * @return 最后一次登录时间
     */
    public final Date getLastLoginTime() {
        return lastLoginTime;
    }

    /** 
     * 设置 最后一次登录时间 teacher.last_login_time
     * @param lastLoginTime 最后一次登录时间
     */
    public final void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /** 
     * 获取 创建时间 teacher.create_time
     * @return 创建时间
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 创建时间 teacher.create_time
     * @param createTime 创建时间
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 修改时间 teacher.update_time
     * @return 修改时间
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 修改时间 teacher.update_time
     * @param updateTime 修改时间
     */
    public final void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * 获取 teacher.age
     * @return teacher.age
     */
    public final Integer getAge() {
        return age;
    }

    /** 
     * 设置 teacher.age
     * @param age teacher.age
     */
    public final void setAge(Integer age) {
        this.age = age;
    }

    /** 
     * 获取 昵称 teacher.nick_name
     * @return 昵称
     */
    public final String getNickName() {
        return nickName;
    }

    /** 
     * 设置 昵称 teacher.nick_name
     * @param nickName 昵称
     */
    public final void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /** 
     * 获取 真实姓名 teacher.real_name
     * @return 真实姓名
     */
    public final String getRealName() {
        return realName;
    }

    /** 
     * 设置 真实姓名 teacher.real_name
     * @param realName 真实姓名
     */
    public final void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /** 
     * 获取 teacher.coin
     * @return teacher.coin
     */
    public final Integer getCoin() {
        return coin;
    }

    /** 
     * 设置 teacher.coin
     * @param coin teacher.coin
     */
    public final void setCoin(Integer coin) {
        this.coin = coin;
    }

    /** 
     * 获取 teacher.diamond
     * @return teacher.diamond
     */
    public final Integer getDiamond() {
        return diamond;
    }

    /** 
     * 设置 teacher.diamond
     * @param diamond teacher.diamond
     */
    public final void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    /** 
     * 获取 逻辑删除0-未删除;1-已删除 teacher.deleted
     * @return 逻辑删除0-未删除;1-已删除
     */
    public final Integer getDeleted() {
        return deleted;
    }

    /** 
     * 设置 逻辑删除0-未删除;1-已删除 teacher.deleted
     * @param deleted 逻辑删除0-未删除;1-已删除
     */
    public final void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", sex=").append(sex);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", intro=").append(intro);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", age=").append(age);
        sb.append(", nickName=").append(nickName);
        sb.append(", realName=").append(realName);
        sb.append(", coin=").append(coin);
        sb.append(", diamond=").append(diamond);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}