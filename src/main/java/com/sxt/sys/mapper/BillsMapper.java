package com.sxt.sys.mapper;

import com.sxt.sys.domain.Bills;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.BillsVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cr
 * @since 2019-04-23
 */
@Component("BillsMapper")
public interface BillsMapper extends BaseMapper<Bills> {

    List<Bills> queryAllBills(BillsVo billsVo);
}