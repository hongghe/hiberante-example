package com.hongghe.hiberanteexample.constants;

/**
 * The api return code and message.
 *
 * @author hongghe 07/2018
 */
public enum ApiConstant {
    ERROR(-1, "fail"),
    SUCC(1, "success");

    private Integer code;
    private String message;

    ApiConstant(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return message;
    }
}
