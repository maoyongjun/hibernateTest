package org.justin.hibernateTest.entity.systemuser;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年5月1日 上午8:03:26
*/
@Entity
@Table(name = "SystemUserPermission")
public class UserPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String lastEditer;

	private Date lastEditDt;
	
	private Long userId;
	
	private Long permissionId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastEditer() {
		return lastEditer;
	}

	public void setLastEditer(String lastEditer) {
		this.lastEditer = lastEditer;
	}

	public Date getLastEditDt() {
		return lastEditDt;
	}

	public void setLastEditDt(Date lastEditDt) {
		this.lastEditDt = lastEditDt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}
	
	
	
}


