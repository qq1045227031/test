package com.wu.sell.exception;

import com.wu.sell.enums.ResultEnum;

public class SellException extends RuntimeException{
    private Integer code;//错误码
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
