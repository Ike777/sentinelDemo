package com.sharding.module.order.controller;


import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.sharding.module.order.entity.TOrder;
import com.sharding.module.order.service.impl.TOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shenw
 * @since 2020-07-09
 */
@RestController
@RequestMapping("/order")
public class TOrderController {

    @Autowired
    private TOrderServiceImpl tOrderService;

    @PostMapping(value = "/insert")
    public ResponseEntity<TOrder> submit(@RequestBody TOrder order) {
        return ResponseEntity.ok(tOrderService.insert(order));
    }

    public static void main(String[] args){
        TOrder order = new TOrder();
        order.setCreatedDate( LocalDateTime.now());
        order.setOrderItemId(1);
        order.setOrderNo("OR001");
        order.setTenantId(1L);
        order.setUpdatedDate(LocalDateTime.now());
        order.setUserId(20L);
        System.out.println(JSON.toJSON(order));
    }
}

