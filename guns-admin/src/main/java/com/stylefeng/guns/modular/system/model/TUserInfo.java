package com.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lc
 * @since 2018-08-15
 */
@TableName("t_user_info")
public class TUserInfo extends Model<TUserInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Long uid;
    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 用户的qq （账号）
     */
    @TableField("user_qq")
    private String userQq;
    /**
     * 用户的密码
     */
    @TableField("user_password")
    private String userPassword;
    /**
     * 用户的积分
     */
    private Long integral;

    /**
     * 推荐用户
     */
    @TableField("recommend_user")
    private Long recommendUser;

    public Long getRecommendUser() {
        return recommendUser;
    }

    public void setRecommendUser(Long recommendUser) {
        this.recommendUser = recommendUser;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getIntegral() {
        return integral;
    }

    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

    @Override
    public String toString() {
        return "TUserInfo{" +
                "uid=" + uid +
                ", userName='" + userName + '\'' +
                ", userQq='" + userQq + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", integral=" + integral +
                ", recommendUser=" + recommendUser +
                '}';
    }
}
