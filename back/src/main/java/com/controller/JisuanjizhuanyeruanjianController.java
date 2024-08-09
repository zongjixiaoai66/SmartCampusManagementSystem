
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 计算机专业相关的软件
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jisuanjizhuanyeruanjian")
public class JisuanjizhuanyeruanjianController {
    private static final Logger logger = LoggerFactory.getLogger(JisuanjizhuanyeruanjianController.class);

    @Autowired
    private JisuanjizhuanyeruanjianService jisuanjizhuanyeruanjianService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private LaoshiService laoshiService;

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("老师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("jisuanjizhuanyeruanjianDeleteStart",1);params.put("jisuanjizhuanyeruanjianDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = jisuanjizhuanyeruanjianService.queryPage(params);

        //字典表数据转换
        List<JisuanjizhuanyeruanjianView> list =(List<JisuanjizhuanyeruanjianView>)page.getList();
        for(JisuanjizhuanyeruanjianView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjian = jisuanjizhuanyeruanjianService.selectById(id);
        if(jisuanjizhuanyeruanjian !=null){
            //entity转view
            JisuanjizhuanyeruanjianView view = new JisuanjizhuanyeruanjianView();
            BeanUtils.copyProperties( jisuanjizhuanyeruanjian , view );//把实体数据重构到view中

                //级联表
                LaoshiEntity laoshi = laoshiService.selectById(jisuanjizhuanyeruanjian.getLaoshiId());
                if(laoshi != null){
                    BeanUtils.copyProperties( laoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setLaoshiId(laoshi.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjian, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jisuanjizhuanyeruanjian:{}",this.getClass().getName(),jisuanjizhuanyeruanjian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("老师".equals(role))
            jisuanjizhuanyeruanjian.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JisuanjizhuanyeruanjianEntity> queryWrapper = new EntityWrapper<JisuanjizhuanyeruanjianEntity>()
            .eq("laoshi_id", jisuanjizhuanyeruanjian.getLaoshiId())
            .eq("jisuanjizhuanyeruanjian_uuid_number", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianUuidNumber())
            .eq("jisuanjizhuanyeruanjian_name", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianName())
            .eq("jisuanjizhuanyeruanjian_video", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianVideo())
            .eq("jisuanjizhuanyeruanjian_types", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianTypes())
            .eq("shangxia_types", jisuanjizhuanyeruanjian.getShangxiaTypes())
            .eq("jisuanjizhuanyeruanjian_delete", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjianEntity = jisuanjizhuanyeruanjianService.selectOne(queryWrapper);
        if(jisuanjizhuanyeruanjianEntity==null){
            jisuanjizhuanyeruanjian.setShangxiaTypes(1);
            jisuanjizhuanyeruanjian.setJisuanjizhuanyeruanjianDelete(1);
            jisuanjizhuanyeruanjian.setCreateTime(new Date());
            jisuanjizhuanyeruanjianService.insert(jisuanjizhuanyeruanjian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjian, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jisuanjizhuanyeruanjian:{}",this.getClass().getName(),jisuanjizhuanyeruanjian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("老师".equals(role))
//            jisuanjizhuanyeruanjian.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<JisuanjizhuanyeruanjianEntity> queryWrapper = new EntityWrapper<JisuanjizhuanyeruanjianEntity>()
            .notIn("id",jisuanjizhuanyeruanjian.getId())
            .andNew()
            .eq("laoshi_id", jisuanjizhuanyeruanjian.getLaoshiId())
            .eq("jisuanjizhuanyeruanjian_uuid_number", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianUuidNumber())
            .eq("jisuanjizhuanyeruanjian_name", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianName())
            .eq("jisuanjizhuanyeruanjian_video", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianVideo())
            .eq("jisuanjizhuanyeruanjian_types", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianTypes())
            .eq("shangxia_types", jisuanjizhuanyeruanjian.getShangxiaTypes())
            .eq("jisuanjizhuanyeruanjian_delete", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjianEntity = jisuanjizhuanyeruanjianService.selectOne(queryWrapper);
        if("".equals(jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianPhoto()) || "null".equals(jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianPhoto())){
                jisuanjizhuanyeruanjian.setJisuanjizhuanyeruanjianPhoto(null);
        }
        if("".equals(jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianVideo()) || "null".equals(jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianVideo())){
                jisuanjizhuanyeruanjian.setJisuanjizhuanyeruanjianVideo(null);
        }
        if("".equals(jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianFile()) || "null".equals(jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianFile())){
                jisuanjizhuanyeruanjian.setJisuanjizhuanyeruanjianFile(null);
        }
        if(jisuanjizhuanyeruanjianEntity==null){
            jisuanjizhuanyeruanjianService.updateById(jisuanjizhuanyeruanjian);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<JisuanjizhuanyeruanjianEntity> list = new ArrayList<>();
        for(Integer id:ids){
            JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjianEntity = new JisuanjizhuanyeruanjianEntity();
            jisuanjizhuanyeruanjianEntity.setId(id);
            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianDelete(2);
            list.add(jisuanjizhuanyeruanjianEntity);
        }
        if(list != null && list.size() >0){
            jisuanjizhuanyeruanjianService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<JisuanjizhuanyeruanjianEntity> jisuanjizhuanyeruanjianList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjianEntity = new JisuanjizhuanyeruanjianEntity();
//                            jisuanjizhuanyeruanjianEntity.setLaoshiId(Integer.valueOf(data.get(0)));   //老师 要改的
//                            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianUuidNumber(data.get(0));                    //软件编号 要改的
//                            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianName(data.get(0));                    //软件名称 要改的
//                            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianPhoto("");//详情和图片
//                            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianVideo(data.get(0));                    //安装教程 要改的
//                            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianFile(data.get(0));                    //安装包 要改的
//                            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianTypes(Integer.valueOf(data.get(0)));   //软件类型 要改的
//                            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianContent("");//详情和图片
//                            jisuanjizhuanyeruanjianEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            jisuanjizhuanyeruanjianEntity.setJisuanjizhuanyeruanjianDelete(1);//逻辑删除字段
//                            jisuanjizhuanyeruanjianEntity.setCreateTime(date);//时间
                            jisuanjizhuanyeruanjianList.add(jisuanjizhuanyeruanjianEntity);


                            //把要查询是否重复的字段放入map中
                                //软件编号
                                if(seachFields.containsKey("jisuanjizhuanyeruanjianUuidNumber")){
                                    List<String> jisuanjizhuanyeruanjianUuidNumber = seachFields.get("jisuanjizhuanyeruanjianUuidNumber");
                                    jisuanjizhuanyeruanjianUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> jisuanjizhuanyeruanjianUuidNumber = new ArrayList<>();
                                    jisuanjizhuanyeruanjianUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("jisuanjizhuanyeruanjianUuidNumber",jisuanjizhuanyeruanjianUuidNumber);
                                }
                        }

                        //查询是否重复
                         //软件编号
                        List<JisuanjizhuanyeruanjianEntity> jisuanjizhuanyeruanjianEntities_jisuanjizhuanyeruanjianUuidNumber = jisuanjizhuanyeruanjianService.selectList(new EntityWrapper<JisuanjizhuanyeruanjianEntity>().in("jisuanjizhuanyeruanjian_uuid_number", seachFields.get("jisuanjizhuanyeruanjianUuidNumber")).eq("jisuanjizhuanyeruanjian_delete", 1));
                        if(jisuanjizhuanyeruanjianEntities_jisuanjizhuanyeruanjianUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JisuanjizhuanyeruanjianEntity s:jisuanjizhuanyeruanjianEntities_jisuanjizhuanyeruanjianUuidNumber){
                                repeatFields.add(s.getJisuanjizhuanyeruanjianUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [软件编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        jisuanjizhuanyeruanjianService.insertBatch(jisuanjizhuanyeruanjianList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = jisuanjizhuanyeruanjianService.queryPage(params);

        //字典表数据转换
        List<JisuanjizhuanyeruanjianView> list =(List<JisuanjizhuanyeruanjianView>)page.getList();
        for(JisuanjizhuanyeruanjianView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjian = jisuanjizhuanyeruanjianService.selectById(id);
            if(jisuanjizhuanyeruanjian !=null){


                //entity转view
                JisuanjizhuanyeruanjianView view = new JisuanjizhuanyeruanjianView();
                BeanUtils.copyProperties( jisuanjizhuanyeruanjian , view );//把实体数据重构到view中

                //级联表
                    LaoshiEntity laoshi = laoshiService.selectById(jisuanjizhuanyeruanjian.getLaoshiId());
                if(laoshi != null){
                    BeanUtils.copyProperties( laoshi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setLaoshiId(laoshi.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjian, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jisuanjizhuanyeruanjian:{}",this.getClass().getName(),jisuanjizhuanyeruanjian.toString());
        Wrapper<JisuanjizhuanyeruanjianEntity> queryWrapper = new EntityWrapper<JisuanjizhuanyeruanjianEntity>()
            .eq("laoshi_id", jisuanjizhuanyeruanjian.getLaoshiId())
            .eq("jisuanjizhuanyeruanjian_uuid_number", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianUuidNumber())
            .eq("jisuanjizhuanyeruanjian_name", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianName())
            .eq("jisuanjizhuanyeruanjian_video", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianVideo())
            .eq("jisuanjizhuanyeruanjian_types", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianTypes())
            .eq("shangxia_types", jisuanjizhuanyeruanjian.getShangxiaTypes())
            .eq("jisuanjizhuanyeruanjian_delete", jisuanjizhuanyeruanjian.getJisuanjizhuanyeruanjianDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjianEntity = jisuanjizhuanyeruanjianService.selectOne(queryWrapper);
        if(jisuanjizhuanyeruanjianEntity==null){
            jisuanjizhuanyeruanjian.setJisuanjizhuanyeruanjianDelete(1);
            jisuanjizhuanyeruanjian.setCreateTime(new Date());
        jisuanjizhuanyeruanjianService.insert(jisuanjizhuanyeruanjian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
