package com.zxc.service;

import com.zxc.entity.MyUser;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-11-16
 * Time: 6:13 PM
 *
 * @author blkfhusky
 */
public interface UserService {

    /**
     * 根据id获取user信息
     *
     * @param id userId
     * @return user信息
     */
    MyUser getUser(Long id);

    /**
     * 初始化user
     *
     * @return 初始成功数
     */
    Integer init();
}
