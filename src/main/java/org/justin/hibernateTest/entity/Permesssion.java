package org.justin.hibernateTest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午5:35:16
*/
@Entity
@Table(name="test5")
public class Permesssion {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	
	private String permesssionName;
	
	 @ManyToMany(mappedBy="permesssions") 
//	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
//	@JoinTable(name = "CustomerPermession", joinColumns = {
//			@JoinColumn(name = "permesssionId"//, referencedColumnName = "permesssionId"
//					) 
//			}, inverseJoinColumns = {
//					@JoinColumn(name = "customerId"//, referencedColumnName = "customerId"
//							) })
	private Set<Customer> customers ;
	
	public long getId() {
		return id;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public void setId(long id) {
		this.id = id;
	}
	public String getPermesssionName() {
		return permesssionName;
	}
	public void setPermesssionName(String permesssionName) {
		this.permesssionName = permesssionName;
	}
	

	
	public Set<Customer> getCustomers() {
		return customers;
	}
	
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
}
