package com.entity.view;

import com.entity.JisuanjizhuanyeruanjianLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 计算机专业相关的软件留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jisuanjizhuanyeruanjian_liuyan")
public class JisuanjizhuanyeruanjianLiuyanView extends JisuanjizhuanyeruanjianLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jisuanjizhuanyeruanjian
			/**
			* 计算机专业相关的软件 的 老师
			*/
			private Integer jisuanjizhuanyeruanjianLaoshiId;
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
				* 软件类型的值
				*/
				private String jisuanjizhuanyeruanjianValue;
			/**
			* 软件介绍
			*/
			private String jisuanjizhuanyeruanjianContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer jisuanjizhuanyeruanjianDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public JisuanjizhuanyeruanjianLiuyanView() {

	}

	public JisuanjizhuanyeruanjianLiuyanView(JisuanjizhuanyeruanjianLiuyanEntity jisuanjizhuanyeruanjianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jisuanjizhuanyeruanjianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






















				//级联表的get和set jisuanjizhuanyeruanjian

					/**
					* 获取：计算机专业相关的软件 的 老师
					*/
					public Integer getJisuanjizhuanyeruanjianLaoshiId() {
						return jisuanjizhuanyeruanjianLaoshiId;
					}
					/**
					* 设置：计算机专业相关的软件 的 老师
					*/
					public void setJisuanjizhuanyeruanjianLaoshiId(Integer jisuanjizhuanyeruanjianLaoshiId) {
						this.jisuanjizhuanyeruanjianLaoshiId = jisuanjizhuanyeruanjianLaoshiId;
					}


					/**
					* 获取： 软件编号
					*/
					public String getJisuanjizhuanyeruanjianUuidNumber() {
						return jisuanjizhuanyeruanjianUuidNumber;
					}
					/**
					* 设置： 软件编号
					*/
					public void setJisuanjizhuanyeruanjianUuidNumber(String jisuanjizhuanyeruanjianUuidNumber) {
						this.jisuanjizhuanyeruanjianUuidNumber = jisuanjizhuanyeruanjianUuidNumber;
					}

					/**
					* 获取： 软件名称
					*/
					public String getJisuanjizhuanyeruanjianName() {
						return jisuanjizhuanyeruanjianName;
					}
					/**
					* 设置： 软件名称
					*/
					public void setJisuanjizhuanyeruanjianName(String jisuanjizhuanyeruanjianName) {
						this.jisuanjizhuanyeruanjianName = jisuanjizhuanyeruanjianName;
					}

					/**
					* 获取： 软件照片
					*/
					public String getJisuanjizhuanyeruanjianPhoto() {
						return jisuanjizhuanyeruanjianPhoto;
					}
					/**
					* 设置： 软件照片
					*/
					public void setJisuanjizhuanyeruanjianPhoto(String jisuanjizhuanyeruanjianPhoto) {
						this.jisuanjizhuanyeruanjianPhoto = jisuanjizhuanyeruanjianPhoto;
					}

					/**
					* 获取： 安装教程
					*/
					public String getJisuanjizhuanyeruanjianVideo() {
						return jisuanjizhuanyeruanjianVideo;
					}
					/**
					* 设置： 安装教程
					*/
					public void setJisuanjizhuanyeruanjianVideo(String jisuanjizhuanyeruanjianVideo) {
						this.jisuanjizhuanyeruanjianVideo = jisuanjizhuanyeruanjianVideo;
					}

					/**
					* 获取： 安装包
					*/
					public String getJisuanjizhuanyeruanjianFile() {
						return jisuanjizhuanyeruanjianFile;
					}
					/**
					* 设置： 安装包
					*/
					public void setJisuanjizhuanyeruanjianFile(String jisuanjizhuanyeruanjianFile) {
						this.jisuanjizhuanyeruanjianFile = jisuanjizhuanyeruanjianFile;
					}

					/**
					* 获取： 软件类型
					*/
					public Integer getJisuanjizhuanyeruanjianTypes() {
						return jisuanjizhuanyeruanjianTypes;
					}
					/**
					* 设置： 软件类型
					*/
					public void setJisuanjizhuanyeruanjianTypes(Integer jisuanjizhuanyeruanjianTypes) {
						this.jisuanjizhuanyeruanjianTypes = jisuanjizhuanyeruanjianTypes;
					}


						/**
						* 获取： 软件类型的值
						*/
						public String getJisuanjizhuanyeruanjianValue() {
							return jisuanjizhuanyeruanjianValue;
						}
						/**
						* 设置： 软件类型的值
						*/
						public void setJisuanjizhuanyeruanjianValue(String jisuanjizhuanyeruanjianValue) {
							this.jisuanjizhuanyeruanjianValue = jisuanjizhuanyeruanjianValue;
						}

					/**
					* 获取： 软件介绍
					*/
					public String getJisuanjizhuanyeruanjianContent() {
						return jisuanjizhuanyeruanjianContent;
					}
					/**
					* 设置： 软件介绍
					*/
					public void setJisuanjizhuanyeruanjianContent(String jisuanjizhuanyeruanjianContent) {
						this.jisuanjizhuanyeruanjianContent = jisuanjizhuanyeruanjianContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getJisuanjizhuanyeruanjianDelete() {
						return jisuanjizhuanyeruanjianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setJisuanjizhuanyeruanjianDelete(Integer jisuanjizhuanyeruanjianDelete) {
						this.jisuanjizhuanyeruanjianDelete = jisuanjizhuanyeruanjianDelete;
					}








































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
