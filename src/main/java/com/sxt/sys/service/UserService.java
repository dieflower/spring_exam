package com.sxt.sys.service;

import com.sxt.sys.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cr
 * @since 2019-04-23
 */
public interface UserService extends IService<User> {

    User queryByLoginnameAndPassword(String loginname, String password);
}
