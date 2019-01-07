package com.zxc.service.impl;

import com.zxc.entity.User;
import com.zxc.mapper.UserMapper;
import com.zxc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-11-16
 * Time: 6:13 PM
 *
 * @author blkfhusky
 */
@Service(value = "billService")
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser(Long id) {
        logger.info("--- user id is {}", id);
        return userMapper.get(id);
    }
}
