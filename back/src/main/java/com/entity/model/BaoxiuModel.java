package com.entity.model;

import com.entity.BaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宿舍报修
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BaoxiuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宿舍
     */
    private Integer susheId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 报修时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 报修名称
     */
    private String baoxiuName;


    /**
     * 报修图片
     */
    private String baoxiuPhoto;


    /**
     * 报修内容
     */
    private String baoxiuContent;


    /**
     * 报修状态
     */
    private Integer baoxiuTypes;


    /**
     * 创建时间
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
	 * 获取：宿舍
	 */
    public Integer getSusheId() {
        return susheId;
    }


    /**
	 * 设置：宿舍
	 */
    public void setSusheId(Integer susheId) {
        this.susheId = susheId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报修时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：报修时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：报修名称
	 */
    public String getBaoxiuName() {
        return baoxiuName;
    }


    /**
	 * 设置：报修名称
	 */
    public void setBaoxiuName(String baoxiuName) {
        this.baoxiuName = baoxiuName;
    }
    /**
	 * 获取：报修图片
	 */
    public String getBaoxiuPhoto() {
        return baoxiuPhoto;
    }


    /**
	 * 设置：报修图片
	 */
    public void setBaoxiuPhoto(String baoxiuPhoto) {
        this.baoxiuPhoto = baoxiuPhoto;
    }
    /**
	 * 获取：报修内容
	 */
    public String getBaoxiuContent() {
        return baoxiuContent;
    }


    /**
	 * 设置：报修内容
	 */
    public void setBaoxiuContent(String baoxiuContent) {
        this.baoxiuContent = baoxiuContent;
    }
    /**
	 * 获取：报修状态
	 */
    public Integer getBaoxiuTypes() {
        return baoxiuTypes;
    }


    /**
	 * 设置：报修状态
	 */
    public void setBaoxiuTypes(Integer baoxiuTypes) {
        this.baoxiuTypes = baoxiuTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
