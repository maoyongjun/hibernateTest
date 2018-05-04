package org.justin.hibernateTest.entity.systemuser;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
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
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年5月1日 上午7:46:15
*/
@Entity
@Table(name = "TestSystemUser")
@JsonIgnoreProperties(value = { "subNameList","permissions" })
public class SystemUser implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String username;
	
	private String password;
	
	private String department;
	
	private String lastEditer;
	
	private Date   lastEditDt;
	
	private Long subCount;
	
	@Transient
	private String subnames;

	@OneToMany(mappedBy="user",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    private Set<SystemSubName> subNameList = new HashSet<SystemSubName>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="userId",nullable=true)
	private Set<Role> roles = new HashSet<Role>();
	
	public SystemUser(){
		
	} 
	
	public SystemUser(String userName,Role role ){
		this.username=userName;
		subnames="";
		this.roles.add(role);
		for(Role sub:roles){
			subnames+=sub.getRoleName()+",";
		}
		
	} 
	
	public Set<Role> getRoles() {
		System.out.println(roles.toString());
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@ManyToMany(cascade=CascadeType.ALL) 
    @JoinTable(  
                name="TestSystemUserPermission",  
                joinColumns=  
                    @JoinColumn(name="userId", referencedColumnName="id"),//当前表里的id  
                inverseJoinColumns=  
                    @JoinColumn(name="permissionId", referencedColumnName="id")//与此相对应的表里的id  
                )  
	private Set<Permission> permissions = new HashSet<Permission>(); 
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		for(Role sub:roles){
			subnames+=sub.getRoleName()+",";
		}
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public Set<SystemSubName> getSubNameList() {
		return subNameList;
	}

	public void setSubNameList(Set<SystemSubName> subNameList) {
		this.subNameList = subNameList;
	}

	public Long getSubCount() {
		return subCount;
	}

	public void setSubCount(Long subCount) {
		this.subCount = subCount;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	public String getSubnames() {
		return subnames;
	}

	public void setSubnames(String subnames) {
		this.subnames = subnames;
	}
	
	
}
