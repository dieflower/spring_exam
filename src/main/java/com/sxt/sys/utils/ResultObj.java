package com.sxt.sys.utils;

/**
 * 响应操作结果的对象
 * 
 * @author LJH
 * 
 */
public class ResultObj {

	private Integer code = 1;// 如果code<0 说明操作失败
	private String msg;

	public ResultObj() {
		// TODO Auto-generated constructor stub
	}
	public ResultObj(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
