package com.sharding.module.order.service.impl;

import com.sharding.module.order.entity.TOrder;
import com.sharding.module.order.mapper.TOrderMapper;
import com.sharding.module.order.service.ITOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shenw
 * @since 2020-07-09
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements ITOrderService {

}
