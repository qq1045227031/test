package com.wu.sell.repository;

import com.wu.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    //根据传入的categoryType的集合，查出所有符合categoryType的ProductCategory
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);//注意方法名字要符合标准次啊能查到
}
