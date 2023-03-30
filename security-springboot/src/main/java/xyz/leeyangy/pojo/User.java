package xyz.leeyangy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author liyangyang
 * @Date: 2023/02/23 18:35
 * @Package xyz.leeyangy.pojo
 * @Version 1.0
 * @Description: 用户表
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class User implements Serializable {
    private static final long serialVersionUID = -40356785423868312L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 呢称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号状态 (0正常，1停用)
     */
    private char status;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phonenumber;

    /**
     * 用户性别(0男，1女，2未知)
     */
    private char sex;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户类型(0管理员，1普通用户)
     */
    @TableField(value = "user_type")
    private String userType;

    /**
     * 创建人用户id
     */
    @TableField(value = "create_by")
    private Long createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 变更人
     */
    @TableField(value = "update_by")
    private Long updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 删除标志(0代表未删除，1代表已删除)
     */
    @TableField(value = "del_flag")
    private Integer delFlag;
}
