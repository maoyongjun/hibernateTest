package org.justin.hibernateTest.entity.systemuser;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年5月1日 上午8:37:13
*/
@Entity
@Table(name = "SystemSubNamer")

public class SystemSubName implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String lastEditer;

	private Date lastEditDt;
	
	private String subUserName;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private SystemUser user;

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

	public SystemUser getUser() {
		return user;
	}

	public void setUser(SystemUser user) {
		this.user = user;
	}

	public String getSubUserName() {
		return subUserName;
	}

	public void setSubUserName(String subUserName) {
		this.subUserName = subUserName;
	}


	
	
}
