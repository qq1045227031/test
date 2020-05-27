package com.wu.sell.repository;

import com.wu.sell.dataobject.ProductCategory;
import org.junit.Assert;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)//spring容器？
@SpringBootTest
class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void  finOneTest(){
        List<ProductCategory> productCategory = repository.findAll();
        for (ProductCategory pc :productCategory){
            System.out.println(pc);
        }
    }
    @Test
    @Transactional //测试的时候是完全回滚，不会返回数据
    public void  saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",3);
        productCategory.setCreateTime(new Date());
        productCategory.setUpdateTime(new Date());
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);//这是判定不为null ture为不是空
//        Assert.assertNotEquals(null,result);//第一个参数是不期望的，第二个参数是判断的值，true为不是空,false则为空
    }
    @Test
    public void  findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> productCategories=repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,productCategories.size());

    }

}