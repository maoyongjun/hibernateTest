package org.justin.hibernateTest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午6:23:44
*/
@Entity
@Table(name="test6")
public class CustomerPermession {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	private long permesssionId;
	
	private long customerId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPermesssionId() {
		return permesssionId;
	}

	public void setPermesssionId(long permesssionId) {
		this.permesssionId = permesssionId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	
}
