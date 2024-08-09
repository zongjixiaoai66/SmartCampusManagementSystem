package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.YinyueLiuyanEntity;
import com.entity.view.YinyueLiuyanView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 音乐留言 Dao 接口
 *
 * @author 
 */
public interface YinyueLiuyanDao extends BaseMapper<YinyueLiuyanEntity> {

   List<YinyueLiuyanView> selectListView(Pagination page, @Param("params") Map<String, Object> params);

}
