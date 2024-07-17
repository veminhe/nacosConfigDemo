package org.example.dto;

import lombok.Data;

/**
 * @author by shenjies88
 * @since 2024/6/11 14:38
 */
@Data
public class ColumnStandardApprovalLogPageDTO extends BasePageDTO {

    private String name;

    private Integer auditStatus;

    private Integer approvalType;

}
