package com.zxc.service.impl;

import com.zxc.entity.MyUser;
import com.zxc.mapper.MyUserMapper;
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
    private MyUserMapper userMapper;


    @Override
    public MyUser getUser(Long id) {
        logger.info("--- user id is {}", id);
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer init() {
//        User user;
        int i = 0;
        do {
            MyUser user = new MyUser();
            user.setId((long) ++i);
            user.setName("name" + i);
            user.setSex(Math.random() > 0.5);
            user.setAge((int) (Math.random() * 70));
            user.setHomeAddr("home_addr" + i);
            user.setCompanyAddr("company_addr" + i);
            userMapper.insert(user);
            if (i % 1000 == 0) {
                logger.info("已经导入{}行记录", i);
            }
        } while (i < 100000);
        return i;
    }
}
