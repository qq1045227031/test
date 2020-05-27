package com.wu.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
//结果 所有类目有产品信息和状态等
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)  返回为空不返回,已在配置文件配置了
public class ResultVO<T> {
    //错误码
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
