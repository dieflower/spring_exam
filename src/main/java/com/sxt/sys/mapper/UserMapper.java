package com.sxt.sys.mapper;

import com.sxt.sys.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cr
 * @since 2019-04-23
 */
@Component("UserMapper")
public interface UserMapper extends BaseMapper<User> {

}
