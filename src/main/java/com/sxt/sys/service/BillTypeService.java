package com.sxt.sys.service;

import com.sxt.sys.domain.BillType;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cr
 * @since 2019-04-23
 */
public interface BillTypeService extends IService<BillType> {

    List<BillType> queryAll();
}
