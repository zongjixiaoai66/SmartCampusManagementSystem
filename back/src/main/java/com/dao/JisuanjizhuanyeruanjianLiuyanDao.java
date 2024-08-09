package com.dao;

import com.entity.JisuanjizhuanyeruanjianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JisuanjizhuanyeruanjianLiuyanView;

/**
 * 计算机专业相关的软件留言 Dao 接口
 *
 * @author 
 */
public interface JisuanjizhuanyeruanjianLiuyanDao extends BaseMapper<JisuanjizhuanyeruanjianLiuyanEntity> {

   List<JisuanjizhuanyeruanjianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
