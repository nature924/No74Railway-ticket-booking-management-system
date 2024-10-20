package com.entity.vo;

import com.entity.BupiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 补票信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
public class BupiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 补票时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bupiaoshijian;
		
	/**
	 * 车次号
	 */
	
	private String checihao;
		
	/**
	 * 车票价格
	 */
	
	private String chepiaojiage;
		
	/**
	 * 上车点
	 */
	
	private String shangchedian;
		
	/**
	 * 下车点
	 */
	
	private String xiachedian;
		
	/**
	 * 补票备注
	 */
	
	private String bupiaobeizhu;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：补票时间
	 */
	 
	public void setBupiaoshijian(Date bupiaoshijian) {
		this.bupiaoshijian = bupiaoshijian;
	}
	
	/**
	 * 获取：补票时间
	 */
	public Date getBupiaoshijian() {
		return bupiaoshijian;
	}
				
	
	/**
	 * 设置：车次号
	 */
	 
	public void setChecihao(String checihao) {
		this.checihao = checihao;
	}
	
	/**
	 * 获取：车次号
	 */
	public String getChecihao() {
		return checihao;
	}
				
	
	/**
	 * 设置：车票价格
	 */
	 
	public void setChepiaojiage(String chepiaojiage) {
		this.chepiaojiage = chepiaojiage;
	}
	
	/**
	 * 获取：车票价格
	 */
	public String getChepiaojiage() {
		return chepiaojiage;
	}
				
	
	/**
	 * 设置：上车点
	 */
	 
	public void setShangchedian(String shangchedian) {
		this.shangchedian = shangchedian;
	}
	
	/**
	 * 获取：上车点
	 */
	public String getShangchedian() {
		return shangchedian;
	}
				
	
	/**
	 * 设置：下车点
	 */
	 
	public void setXiachedian(String xiachedian) {
		this.xiachedian = xiachedian;
	}
	
	/**
	 * 获取：下车点
	 */
	public String getXiachedian() {
		return xiachedian;
	}
				
	
	/**
	 * 设置：补票备注
	 */
	 
	public void setBupiaobeizhu(String bupiaobeizhu) {
		this.bupiaobeizhu = bupiaobeizhu;
	}
	
	/**
	 * 获取：补票备注
	 */
	public String getBupiaobeizhu() {
		return bupiaobeizhu;
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
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
