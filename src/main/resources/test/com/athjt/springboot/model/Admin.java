/* https://github.com/orange1438 */
package com.athjt.springboot.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * 管理员信息表 vr_admin
 * @author orange1438 code generator
 * date:2020/08/17 20:05
 */
public class Admin implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -3882947990425989558L;

    /** 
     * 登录账户名 8位数字类型
     */ 
    private Integer adminId;

    /** 
     * 登录帐号
     */ 
    private String loginId;

    /** 
     * 电话
     */ 
    private String phone;

    /** 
     * 密码
     */ 
    private String password;

    /** 
     * 1代表超级管理员，2代表普通管理员，3俱乐部群主，4邀请人，5特殊管理员(可以更换绑定IP)  默认：2
     */ 
    private Integer level;

    /** 
     * 创建时间
     */ 
    private Date createTime;

    /** 
     * 是否有效(0无效1有效)
     */ 
    private Integer disable;

    /** 
     * 获取 登录账户名 8位数字类型 vr_admin.admin_id
     * @return 登录账户名 8位数字类型
     */
    public final Integer getAdminId() {
        return adminId;
    }

    /** 
     * 设置 登录账户名 8位数字类型 vr_admin.admin_id
     * @param adminId 登录账户名 8位数字类型
     */
    public final void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /** 
     * 获取 登录帐号 vr_admin.login_id
     * @return 登录帐号
     */
    public final String getLoginId() {
        return loginId;
    }

    /** 
     * 设置 登录帐号 vr_admin.login_id
     * @param loginId 登录帐号
     */
    public final void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    /** 
     * 获取 电话 vr_admin.phone
     * @return 电话
     */
    public final String getPhone() {
        return phone;
    }

    /** 
     * 设置 电话 vr_admin.phone
     * @param phone 电话
     */
    public final void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /** 
     * 获取 密码 vr_admin.password
     * @return 密码
     */
    public final String getPassword() {
        return password;
    }

    /** 
     * 设置 密码 vr_admin.password
     * @param password 密码
     */
    public final void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 
     * 获取 1代表超级管理员，2代表普通管理员，3俱乐部群主，4邀请人，5特殊管理员(可以更换绑定IP) vr_admin.level
     * @return 1代表超级管理员，2代表普通管理员，3俱乐部群主，4邀请人，5特殊管理员(可以更换绑定IP)
     */
    public final Integer getLevel() {
        return level;
    }

    /** 
     * 设置 1代表超级管理员，2代表普通管理员，3俱乐部群主，4邀请人，5特殊管理员(可以更换绑定IP) vr_admin.level
     * @param level 1代表超级管理员，2代表普通管理员，3俱乐部群主，4邀请人，5特殊管理员(可以更换绑定IP)
     */
    public final void setLevel(Integer level) {
        this.level = level;
    }

    /** 
     * 获取 创建时间 vr_admin.create_time
     * @return 创建时间
     */
    public final Date getCreateTime() {
        return createTime;
    }

    /** 
     * 设置 创建时间 vr_admin.create_time
     * @param createTime 创建时间
     */
    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 获取 是否有效(0无效1有效) vr_admin.disable
     * @return 是否有效(0无效1有效)
     */
    public final Integer getDisable() {
        return disable;
    }

    /** 
     * 设置 是否有效(0无效1有效) vr_admin.disable
     * @param disable 是否有效(0无效1有效)
     */
    public final void setDisable(Integer disable) {
        this.disable = disable;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", adminId=").append(adminId);
        sb.append(", loginId=").append(loginId);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", level=").append(level);
        sb.append(", createTime=").append(createTime);
        sb.append(", disable=").append(disable);
        sb.append("]");
        return sb.toString();
    }
}