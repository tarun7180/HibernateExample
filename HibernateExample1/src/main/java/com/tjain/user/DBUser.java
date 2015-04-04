package com.tjain.user;

import java.io.Serializable;
import java.util.Date;

public class DBUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1114828351496124447L;
	private int userId;
	private String userName;
	private String createdBy;
	private Date createdDate;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date date) {
		this.createdDate = date;
	}

}
