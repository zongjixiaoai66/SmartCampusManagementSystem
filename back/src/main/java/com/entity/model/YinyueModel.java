package com.entity.model;

import com.entity.YinyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 音乐
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YinyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 音乐编号
     */
    private String yinyueUuidNumber;


    /**
     * 音乐名称
     */
    private String yinyueName;


    /**
     * 音乐照片
     */
    private String yinyuePhoto;


    /**
     * 音乐
     */
    private String yinyueMusci;


    /**
     * 音乐类型
     */
    private Integer yinyueTypes;


    /**
     * 热度
     */
    private Integer yinyueClicknum;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 音乐详情
     */
    private String yinyueContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer yinyueDelete;


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
	 * 获取：音乐编号
	 */
    public String getYinyueUuidNumber() {
        return yinyueUuidNumber;
    }


    /**
	 * 设置：音乐编号
	 */
    public void setYinyueUuidNumber(String yinyueUuidNumber) {
        this.yinyueUuidNumber = yinyueUuidNumber;
    }
    /**
	 * 获取：音乐名称
	 */
    public String getYinyueName() {
        return yinyueName;
    }


    /**
	 * 设置：音乐名称
	 */
    public void setYinyueName(String yinyueName) {
        this.yinyueName = yinyueName;
    }
    /**
	 * 获取：音乐照片
	 */
    public String getYinyuePhoto() {
        return yinyuePhoto;
    }


    /**
	 * 设置：音乐照片
	 */
    public void setYinyuePhoto(String yinyuePhoto) {
        this.yinyuePhoto = yinyuePhoto;
    }
    /**
	 * 获取：音乐
	 */
    public String getYinyueMusci() {
        return yinyueMusci;
    }


    /**
	 * 设置：音乐
	 */
    public void setYinyueMusci(String yinyueMusci) {
        this.yinyueMusci = yinyueMusci;
    }
    /**
	 * 获取：音乐类型
	 */
    public Integer getYinyueTypes() {
        return yinyueTypes;
    }


    /**
	 * 设置：音乐类型
	 */
    public void setYinyueTypes(Integer yinyueTypes) {
        this.yinyueTypes = yinyueTypes;
    }
    /**
	 * 获取：热度
	 */
    public Integer getYinyueClicknum() {
        return yinyueClicknum;
    }


    /**
	 * 设置：热度
	 */
    public void setYinyueClicknum(Integer yinyueClicknum) {
        this.yinyueClicknum = yinyueClicknum;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：音乐详情
	 */
    public String getYinyueContent() {
        return yinyueContent;
    }


    /**
	 * 设置：音乐详情
	 */
    public void setYinyueContent(String yinyueContent) {
        this.yinyueContent = yinyueContent;
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
    public Integer getYinyueDelete() {
        return yinyueDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setYinyueDelete(Integer yinyueDelete) {
        this.yinyueDelete = yinyueDelete;
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
