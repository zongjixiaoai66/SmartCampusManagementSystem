package com.entity.view;

import com.entity.JisuanjizhuanyeruanjianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 计算机专业相关的软件
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jisuanjizhuanyeruanjian")
public class JisuanjizhuanyeruanjianView extends JisuanjizhuanyeruanjianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 软件类型的值
		*/
		private String jisuanjizhuanyeruanjianValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



		//级联表 laoshi
			/**
			* 老师姓名
			*/
			private String laoshiName;
			/**
			* 老师手机号
			*/
			private String laoshiPhone;
			/**
			* 老师头像
			*/
			private String laoshiPhoto;
			/**
			* 电子邮箱
			*/
			private String laoshiEmail;

	public JisuanjizhuanyeruanjianView() {

	}

	public JisuanjizhuanyeruanjianView(JisuanjizhuanyeruanjianEntity jisuanjizhuanyeruanjianEntity) {
		try {
			BeanUtils.copyProperties(this, jisuanjizhuanyeruanjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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


























				//级联表的get和set laoshi

					/**
					* 获取： 老师姓名
					*/
					public String getLaoshiName() {
						return laoshiName;
					}
					/**
					* 设置： 老师姓名
					*/
					public void setLaoshiName(String laoshiName) {
						this.laoshiName = laoshiName;
					}

					/**
					* 获取： 老师手机号
					*/
					public String getLaoshiPhone() {
						return laoshiPhone;
					}
					/**
					* 设置： 老师手机号
					*/
					public void setLaoshiPhone(String laoshiPhone) {
						this.laoshiPhone = laoshiPhone;
					}

					/**
					* 获取： 老师头像
					*/
					public String getLaoshiPhoto() {
						return laoshiPhoto;
					}
					/**
					* 设置： 老师头像
					*/
					public void setLaoshiPhoto(String laoshiPhoto) {
						this.laoshiPhoto = laoshiPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getLaoshiEmail() {
						return laoshiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setLaoshiEmail(String laoshiEmail) {
						this.laoshiEmail = laoshiEmail;
					}
















}
