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
import javax.persistence.Table;

/**
 * @author:myz
 * @version 1.0 创建时间：2018年4月29日 下午6:13:14
 */
@Entity
@Table(name = "test4")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String customerName;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "CustomerPermession", joinColumns = {
			@JoinColumn(name = "customerId"//, referencedColumnName = "customerId"
					) }, inverseJoinColumns = {
					@JoinColumn(name = "permesssionId"//, referencedColumnName = "permesssionId"
							) })
	private Set<Permesssion> permesssions;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Set<Permesssion> getPermesssions() {
		return permesssions;
	}

	public void setPermesssions(Set<Permesssion> permesssions) {
		this.permesssions = permesssions;
	}
	

}
