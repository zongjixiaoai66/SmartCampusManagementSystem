package com.dao;

import com.entity.JisuanjizhuanyeruanjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JisuanjizhuanyeruanjianView;

/**
 * 计算机专业相关的软件 Dao 接口
 *
 * @author 
 */
public interface JisuanjizhuanyeruanjianDao extends BaseMapper<JisuanjizhuanyeruanjianEntity> {

   List<JisuanjizhuanyeruanjianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
