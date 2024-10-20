package com.entity.vo;

import com.entity.XiachexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 下车信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
public class XiachexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 下车站点
	 */
	
	private String xiachezhandian;
		
	/**
	 * 下车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiacheshijian;
		
	/**
	 * 下车备注
	 */
	
	private String xiachebeizhu;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
	/**
	 * 设置：下车站点
	 */
	 
	public void setXiachezhandian(String xiachezhandian) {
		this.xiachezhandian = xiachezhandian;
	}
	
	/**
	 * 获取：下车站点
	 */
	public String getXiachezhandian() {
		return xiachezhandian;
	}
				
	
	/**
	 * 设置：下车时间
	 */
	 
	public void setXiacheshijian(Date xiacheshijian) {
		this.xiacheshijian = xiacheshijian;
	}
	
	/**
	 * 获取：下车时间
	 */
	public Date getXiacheshijian() {
		return xiacheshijian;
	}
				
	
	/**
	 * 设置：下车备注
	 */
	 
	public void setXiachebeizhu(String xiachebeizhu) {
		this.xiachebeizhu = xiachebeizhu;
	}
	
	/**
	 * 获取：下车备注
	 */
	public String getXiachebeizhu() {
		return xiachebeizhu;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
			
}
