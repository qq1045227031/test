package com.wu.sell.repository;

import com.wu.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> { //可能修改
    //查询上架商品
    List<ProductInfo> findByProductStatus(Integer productStatus);

    ProductInfo findOne(String productId);//修改
}
