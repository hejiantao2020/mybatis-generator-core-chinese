/* https://github.com/orange1438 */
package com.athjt.springboot.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author orange1438 code generator
 * date:2020/08/17 20:05
 */
public class User implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -2962247555573055496L;

    /** 
     */ 
    private Integer userId;

    /** 
     * 用户昵称
     */ 
    private String userName;

    /** 
     * 头像url
     */ 
    private String head;

    /** 
     * 性别  默认：0
     */ 
    private Integer sex;

    /** 
     * 上次登录时间
     */ 
    private Date lastLoginDate;

    /** 
     * 电话号码
     */ 
    private String mobile;

    /** 
     * 密码
     */ 
    private String password;

    /** 
     * 该记录创建时间
     */ 
    private Date createTime;

    /** 
     * 更新时间
     */ 
    private Date updateTime;

    /** 
     * 左眼度数
     */ 
    private Integer leftEyeDegree;

    /** 
     * 右眼度数
     */ 
    private Integer rightEyeDegree;

    /** 
     * 视频动态率
     */ 
    private Double videoDynamicRate;

    /** 
     * 账号剩余金币  默认：0
     */ 
    private Integer coin;

    /** 
     * 逻辑删除  默认：0
     */ 
    private Byte deleted;

    /** 
     * 账号剩余钻石  默认：0
     */ 
    private Integer diamond;

    /** 
     */ 
    private String payPwd;

    /** 
     */ 
    private String openId;

    /** 
     */ 
    private String unionId;

    /** 
     * 获取 user.user_id
     * @return user.user_id
     */
    public final Integer getUserId() {
        return userId;
    }

    /** 
     * 设置 user.user_id
     * @param userId user.user_id
     */
    public final void setUserId(Integer userId) {
        this.userId = userId;
    }

    /** 
     * 获取 用户昵称 user.user_name
     * @return 用户昵称
     */
    public final String getUserName() {
        return userName;
    }

    /** 
     * 设置 用户昵称 user.user_name
     * @param userName 用户昵称
     */
    public final void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /** 
     * 获取 头像url user.head
     * @return 头像url
     */
    public final String getHead() {
        return head;
    }

    /** 
     * 设置 头像url user.head
     * @param head 头像url
     */
    public final void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    /** 
     * 获取 性别 user.sex
     * @return 性别
     */
    public final Integer getSex() {
        return sex;
    }

    /** 
     * 设置 性别 user.sex
     * @param sex 性别
     */
    public final void setSex(Integer sex) {
        this.sex = sex;
    }

    /** 
     * 获取 上次登录时间 user.last_login_date
     * @return 上次登录时间
     */
    public final Date getLastLoginDate() {
        return lastLoginDate;
    }

    /** 
     * 设置 上次登录时间 user.last_login_date
     * @param lastLoginDate 上次登录时间
     */
    public final void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /** 
     * 获取 电话号码 user.mobile
     * @return 电话号码
     */
    public final String getMobile() {
        return mobile;
    }

    /** 
     * 设置 电话号码 user.mobile
     * @param mobile 电话号码
     */
    public final void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /** 
     * 获取 密码 user.password
     * @return 密码
     */
    public final String getPassword() {
        return password;
    }

    /** 
     * 设置 密码 user.password
     * @param password 密码
     */
    public final void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 
     * 获取 该记录创建时间 user.create_time
     * @return 该记录创建时间
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 该记录创建时间 user.create_time
     * @param createTime 该记录创建时间
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 更新时间 user.update_time
     * @return 更新时间
     */
    public final Date getUpdateTime() {
        return updateTime;
    }

    /** 
     * 设置 更新时间 user.update_time
     * @param updateTime 更新时间
     */
    public final void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * 获取 左眼度数 user.left_eye_degree
     * @return 左眼度数
     */
    public final Integer getLeftEyeDegree() {
        return leftEyeDegree;
    }

    /** 
     * 设置 左眼度数 user.left_eye_degree
     * @param leftEyeDegree 左眼度数
     */
    public final void setLeftEyeDegree(Integer leftEyeDegree) {
        this.leftEyeDegree = leftEyeDegree;
    }

    /** 
     * 获取 右眼度数 user.right_eye_degree
     * @return 右眼度数
     */
    public final Integer getRightEyeDegree() {
        return rightEyeDegree;
    }

    /** 
     * 设置 右眼度数 user.right_eye_degree
     * @param rightEyeDegree 右眼度数
     */
    public final void setRightEyeDegree(Integer rightEyeDegree) {
        this.rightEyeDegree = rightEyeDegree;
    }

    /** 
     * 获取 视频动态率 user.video_dynamic_rate
     * @return 视频动态率
     */
    public final Double getVideoDynamicRate() {
        return videoDynamicRate;
    }

    /** 
     * 设置 视频动态率 user.video_dynamic_rate
     * @param videoDynamicRate 视频动态率
     */
    public final void setVideoDynamicRate(Double videoDynamicRate) {
        this.videoDynamicRate = videoDynamicRate;
    }

    /** 
     * 获取 账号剩余金币 user.coin
     * @return 账号剩余金币
     */
    public final Integer getCoin() {
        return coin;
    }

    /** 
     * 设置 账号剩余金币 user.coin
     * @param coin 账号剩余金币
     */
    public final void setCoin(Integer coin) {
        this.coin = coin;
    }

    /** 
     * 获取 逻辑删除 user.deleted
     * @return 逻辑删除
     */
    public final Byte getDeleted() {
        return deleted;
    }

    /** 
     * 设置 逻辑删除 user.deleted
     * @param deleted 逻辑删除
     */
    public final void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /** 
     * 获取 账号剩余钻石 user.diamond
     * @return 账号剩余钻石
     */
    public final Integer getDiamond() {
        return diamond;
    }

    /** 
     * 设置 账号剩余钻石 user.diamond
     * @param diamond 账号剩余钻石
     */
    public final void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    /** 
     * 获取 user.pay_pwd
     * @return user.pay_pwd
     */
    public final String getPayPwd() {
        return payPwd;
    }

    /** 
     * 设置 user.pay_pwd
     * @param payPwd user.pay_pwd
     */
    public final void setPayPwd(String payPwd) {
        this.payPwd = payPwd == null ? null : payPwd.trim();
    }

    /** 
     * 获取 user.open_id
     * @return user.open_id
     */
    public final String getOpenId() {
        return openId;
    }

    /** 
     * 设置 user.open_id
     * @param openId user.open_id
     */
    public final void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /** 
     * 获取 user.union_id
     * @return user.union_id
     */
    public final String getUnionId() {
        return unionId;
    }

    /** 
     * 设置 user.union_id
     * @param unionId user.union_id
     */
    public final void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
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
        sb.append(", head=").append(head);
        sb.append(", sex=").append(sex);
        sb.append(", lastLoginDate=").append(lastLoginDate);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", leftEyeDegree=").append(leftEyeDegree);
        sb.append(", rightEyeDegree=").append(rightEyeDegree);
        sb.append(", videoDynamicRate=").append(videoDynamicRate);
        sb.append(", coin=").append(coin);
        sb.append(", deleted=").append(deleted);
        sb.append(", diamond=").append(diamond);
        sb.append(", payPwd=").append(payPwd);
        sb.append(", openId=").append(openId);
        sb.append(", unionId=").append(unionId);
        sb.append("]");
        return sb.toString();
    }
}