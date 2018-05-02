package org.justin.hibernateTest.entity.systemuser;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author:myz
 * @version 1.0 创建时间：2018年5月1日 上午8:02:51
 */
@Entity
@Table(name = "TestSystemPermission")
public class Permission implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String lastEditer;

	private Date lastEditDt;
	
	private String permissionName;
	
	private String permissionDesciption;
	
	@ManyToMany(mappedBy="permissions")
	private Set<SystemUser> users=new HashSet<SystemUser>();

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

	public Set<SystemUser> getUsers() {
		return users;
	}

	public void setUsers(Set<SystemUser> users) {
		this.users = users;
	}
	
	
}
