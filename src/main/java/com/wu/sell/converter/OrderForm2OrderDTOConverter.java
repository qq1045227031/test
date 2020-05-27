package com.wu.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wu.sell.dataobject.OrderDetail;
import com.wu.sell.dto.OrderDTO;
import com.wu.sell.enums.ResultEnum;
import com.wu.sell.exception.SellException;
import com.wu.sell.form.OrderForm;

import java.util.ArrayList;
import java.util.List;
//将前台传入的订单OrderForm 变成实体类OrderDTO
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        //由于前台传入的订单详情是json类型，过来也是String所以转化成详情类
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());//orderForm.getItems()是要转化的传入的json  List<OrderDetail>是实体类型 其他都是格式
        } catch (Exception e) {
//            log.error("【对象转换】错误, string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
