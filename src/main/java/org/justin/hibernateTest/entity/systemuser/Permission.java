package org.justin.hibernateTest.entity.systemuser;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author:myz
 * @version 1.0 创建时间：2018年5月1日 上午8:02:51
 */
@Entity
@Table(name = "SystemPermission")
public class Permission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String lastEditer;

	private Date lastEditDt;
	
	private String permissionName;
	
	private String permissionDesciption;

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

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionDesciption() {
		return permissionDesciption;
	}

	public void setPermissionDesciption(String permissionDesciption) {
		this.permissionDesciption = permissionDesciption;
	}
	
	
}