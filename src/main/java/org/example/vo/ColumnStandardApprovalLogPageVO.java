package org.example.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author by heming
 * @since 2024/6/11 14:38
 */
@Data
public class ColumnStandardApprovalLogPageVO {

    private Long id;

    private String cnName;

    private String enName;

    private Integer approvalType;


    private String createUser;

    private Integer auditStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
