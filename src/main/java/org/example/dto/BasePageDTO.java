package org.example.dto;

import lombok.Data;

import java.util.List;

/**
 * @author shenjies88
 * @since 2023/3/2/16:23
 */
@Data
public class BasePageDTO {

    private long current = 1;

    private long size = 10;

}
