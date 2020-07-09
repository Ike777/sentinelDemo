package com.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.module.users.generate.TUser;
import com.module.users.generate.TUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserDemoService {
    @Autowired
    private TUserDao userDao;

    public TUser demoInsert(String name,Long tenantId){
        TUser user = new TUser();
        user.setUaserName(name);
        user.setTenantId(tenantId);
        userDao.insert(user);
        return user;

    }

    public List<TUser> queryList(Long tenantId){
        QueryWrapper<TUser> wp = new QueryWrapper<>();
        wp.orderByAsc("tenant_id");
        return userDao.selectList(wp);
    }
}
