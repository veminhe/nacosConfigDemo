package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 字段标准的审批记录
 * </p>
 *
 * @author heming
 * @since 2024-06-24
 */
@Getter
@Setter
@TableName("data_gov_column_standard_approval_log")
public class DataGovColumnStandardApprovalLog extends MyBaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long columnStandardId;

    private Long standardCurrentVersionId;

    private Long standardRollbackVersionId;

    private Integer approvalType;

    private Integer auditStatus;

    private String auditResult;

    private String applicationReason;
}
