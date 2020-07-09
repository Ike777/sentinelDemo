package com.module.users.generate;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TUserDao extends BaseMapper<TUser> {
    int deleteByPrimaryKey(Long userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(@Param("userId") Long userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

}
