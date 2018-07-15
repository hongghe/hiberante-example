package com.hongghe.hiberanteexample.domain;

import com.hongghe.hiberanteexample.constants.ApiConstant;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;

@Data
public class ApiResult implements Serializable {

    private static final Long serializableVersionId = -1L;

    private Integer code = ApiConstant.ERROR.getCode();
    private String message = ApiConstant.ERROR.getMessage();
    private Object data = new HashMap<>();
}
