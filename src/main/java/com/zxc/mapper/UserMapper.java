package com.zxc.mapper;

import com.zxc.entity.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

    User get(Long id);
}