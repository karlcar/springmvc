package com.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * <p>Title: User</p>
 * <p>Description: 鐢ㄦ埛po绫�</p>
 * <p>Company: www.itcast.com</p> 
 * @author	浼犳櫤.鐕曢潚
 * @date	2015-3-17涓婂崍10:00:07
 * @version 1.0
 */
public class User implements Serializable {
	private int id;
	private String username;// 鐢ㄦ埛濮撳悕
	private String sex;// 鎬у埆
	private Date birthday;// 鐢熸棩
	private String address;// 鍦板潃

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address + "]";
	}
	
	
}
