package com.wqzhan.service.impl;

import com.wqzhan.entity.User;
import com.wqzhan.mapper.UserMapper;
import com.wqzhan.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wqzhan
 * @since 2020-08-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

