package com.wu.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
//单个产品的信息,用于过滤多余信息
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private Integer productId;//可能修改

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
