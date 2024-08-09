package com.entity.vo;

import com.entity.BeiwangluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 备忘录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("beiwanglu")
public class BeiwangluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 备忘录名称
     */

    @TableField(value = "beiwanglu_name")
    private String beiwangluName;


    /**
     * 备忘录类型
     */

    @TableField(value = "beiwanglu_types")
    private Integer beiwangluTypes;


    /**
     * 备忘录详情
     */

    @TableField(value = "beiwanglu_content")
    private String beiwangluContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：备忘录名称
	 */
    public String getBeiwangluName() {
        return beiwangluName;
    }


    /**
	 * 获取：备忘录名称
	 */

    public void setBeiwangluName(String beiwangluName) {
        this.beiwangluName = beiwangluName;
    }
    /**
	 * 设置：备忘录类型
	 */
    public Integer getBeiwangluTypes() {
        return beiwangluTypes;
    }


    /**
	 * 获取：备忘录类型
	 */

    public void setBeiwangluTypes(Integer beiwangluTypes) {
        this.beiwangluTypes = beiwangluTypes;
    }
    /**
	 * 设置：备忘录详情
	 */
    public String getBeiwangluContent() {
        return beiwangluContent;
    }


    /**
	 * 获取：备忘录详情
	 */

    public void setBeiwangluContent(String beiwangluContent) {
        this.beiwangluContent = beiwangluContent;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
