package com.entity.model;

import com.entity.JisuanjizhuanyeruanjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 计算机专业相关的软件
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JisuanjizhuanyeruanjianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 老师
     */
    private Integer laoshiId;


    /**
     * 软件编号
     */
    private String jisuanjizhuanyeruanjianUuidNumber;


    /**
     * 软件名称
     */
    private String jisuanjizhuanyeruanjianName;


    /**
     * 软件照片
     */
    private String jisuanjizhuanyeruanjianPhoto;


    /**
     * 安装教程
     */
    private String jisuanjizhuanyeruanjianVideo;


    /**
     * 安装包
     */
    private String jisuanjizhuanyeruanjianFile;


    /**
     * 软件类型
     */
    private Integer jisuanjizhuanyeruanjianTypes;


    /**
     * 软件介绍
     */
    private String jisuanjizhuanyeruanjianContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer jisuanjizhuanyeruanjianDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：老师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：软件编号
	 */
    public String getJisuanjizhuanyeruanjianUuidNumber() {
        return jisuanjizhuanyeruanjianUuidNumber;
    }


    /**
	 * 设置：软件编号
	 */
    public void setJisuanjizhuanyeruanjianUuidNumber(String jisuanjizhuanyeruanjianUuidNumber) {
        this.jisuanjizhuanyeruanjianUuidNumber = jisuanjizhuanyeruanjianUuidNumber;
    }
    /**
	 * 获取：软件名称
	 */
    public String getJisuanjizhuanyeruanjianName() {
        return jisuanjizhuanyeruanjianName;
    }


    /**
	 * 设置：软件名称
	 */
    public void setJisuanjizhuanyeruanjianName(String jisuanjizhuanyeruanjianName) {
        this.jisuanjizhuanyeruanjianName = jisuanjizhuanyeruanjianName;
    }
    /**
	 * 获取：软件照片
	 */
    public String getJisuanjizhuanyeruanjianPhoto() {
        return jisuanjizhuanyeruanjianPhoto;
    }


    /**
	 * 设置：软件照片
	 */
    public void setJisuanjizhuanyeruanjianPhoto(String jisuanjizhuanyeruanjianPhoto) {
        this.jisuanjizhuanyeruanjianPhoto = jisuanjizhuanyeruanjianPhoto;
    }
    /**
	 * 获取：安装教程
	 */
    public String getJisuanjizhuanyeruanjianVideo() {
        return jisuanjizhuanyeruanjianVideo;
    }


    /**
	 * 设置：安装教程
	 */
    public void setJisuanjizhuanyeruanjianVideo(String jisuanjizhuanyeruanjianVideo) {
        this.jisuanjizhuanyeruanjianVideo = jisuanjizhuanyeruanjianVideo;
    }
    /**
	 * 获取：安装包
	 */
    public String getJisuanjizhuanyeruanjianFile() {
        return jisuanjizhuanyeruanjianFile;
    }


    /**
	 * 设置：安装包
	 */
    public void setJisuanjizhuanyeruanjianFile(String jisuanjizhuanyeruanjianFile) {
        this.jisuanjizhuanyeruanjianFile = jisuanjizhuanyeruanjianFile;
    }
    /**
	 * 获取：软件类型
	 */
    public Integer getJisuanjizhuanyeruanjianTypes() {
        return jisuanjizhuanyeruanjianTypes;
    }


    /**
	 * 设置：软件类型
	 */
    public void setJisuanjizhuanyeruanjianTypes(Integer jisuanjizhuanyeruanjianTypes) {
        this.jisuanjizhuanyeruanjianTypes = jisuanjizhuanyeruanjianTypes;
    }
    /**
	 * 获取：软件介绍
	 */
    public String getJisuanjizhuanyeruanjianContent() {
        return jisuanjizhuanyeruanjianContent;
    }


    /**
	 * 设置：软件介绍
	 */
    public void setJisuanjizhuanyeruanjianContent(String jisuanjizhuanyeruanjianContent) {
        this.jisuanjizhuanyeruanjianContent = jisuanjizhuanyeruanjianContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJisuanjizhuanyeruanjianDelete() {
        return jisuanjizhuanyeruanjianDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setJisuanjizhuanyeruanjianDelete(Integer jisuanjizhuanyeruanjianDelete) {
        this.jisuanjizhuanyeruanjianDelete = jisuanjizhuanyeruanjianDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
