package com.wu.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@DynamicUpdate  //Dynamic动态的 时间动态修改，防止查数据再改数据的时候时间不变
@Data   //自动创建get set
public class ProductCategory {

    /** 类目id. */
    @Id
    @GeneratedValue/*(strategy = GenerationType.IDENTITY)//自增 strategy策略*/
    //GenerationType生成类型 identity 标识
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }
    public ProductCategory(String categoryName,Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
