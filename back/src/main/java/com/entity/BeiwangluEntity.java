package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 备忘录
 *
 * @author 
 * @email
 */
@TableName("beiwanglu")
public class BeiwangluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BeiwangluEntity() {

	}

	public BeiwangluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Beiwanglu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", beiwangluName=" + beiwangluName +
            ", beiwangluTypes=" + beiwangluTypes +
            ", beiwangluContent=" + beiwangluContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
