package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusheGuiqinEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 宿舍归寝 服务类
 */
public interface SusheGuiqinService extends IService<SusheGuiqinEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}