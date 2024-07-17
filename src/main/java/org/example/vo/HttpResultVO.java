package org.example.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shenjies88
 * @since 2023/3/2/9:17
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HttpResultVO<T> {

    private int code;

    private boolean success;

    private T data;

    private String errorMsg;

    public static <T> HttpResultVO<T> success(T data) {
        return new HttpResultVO<>(200, true, data, null);
    }

    public static HttpResultVO<Void> success() {
        return new HttpResultVO<>(200, true, null, null);
    }

    public static HttpResultVO error(String errorMsg) {
        return new HttpResultVO<>(500, false, null, errorMsg);
    }

    public static HttpResultVO<Void> error(int code, String errorMsg) {
        return new HttpResultVO<>(code, false, null, errorMsg);
    }
}