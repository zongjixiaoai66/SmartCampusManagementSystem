package com.dao;

import com.entity.SusheRenruanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheRenruanView;

/**
 * 宿舍人员 Dao 接口
 *
 * @author 
 */
public interface SusheRenruanDao extends BaseMapper<SusheRenruanEntity> {

   List<SusheRenruanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
