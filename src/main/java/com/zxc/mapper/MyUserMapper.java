package com.zxc.mapper;

import com.zxc.entity.MyUser;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

public interface MyUserMapper extends Mapper<MyUser>, IdsMapper<MyUser> {
}