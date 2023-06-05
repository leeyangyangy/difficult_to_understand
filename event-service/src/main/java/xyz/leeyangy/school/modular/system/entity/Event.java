package xyz.leeyangy.school.modular.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.leeyangy.school.framework.pojo.base.BaseUserTimeEntity;

import java.util.Date;

/**
 * <p>
 * 自助审批事件表
 * </p>
 *
 * @author liyangyang
 * @since 2023-05-02
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Event extends BaseUserTimeEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 事件主题
     */
    private String title;

    /**
     * 去哪呢
     */
    private String area;

    /**
     * 发起人工号
     */
    private String sponsorId;

    /**
     * 发起人姓名
     */
    private String sponsor;

    /**
     * 事件类型(0实习，1看病，2.探亲，3.培训，4.请假，5.其它)
     */
    private String eventType;

    /**
     * 事件状态 (0正常，1停用)
     */
    private String status;

    /**
     * 返校时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy/MM/dd")
    private Date backTime;

    /**
     * 删除标志(0代表未删除，1代表逻辑删除)
     */
    private Integer delFlag;


}