package org.justin.hibernateTest.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
* @author:myz
* @version 1.0 
* 创建时间：2018年4月29日 下午12:48:56
*/
@Entity
@Table(name="test1")
public class EntityTable1 {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String name;
	@ManyToOne
	private EntityTable2 entityTable2;
	
	@OneToMany
	private List<EntityTable3> entityTable3;
	
	

	public EntityTable2 getEntityTable2() {
		return entityTable2;
	}
	public void setEntityTable2(EntityTable2 entityTable2) {
		this.entityTable2 = entityTable2;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<EntityTable3> getEntityTable3() {
		return entityTable3;
	}
	public void setEntityTable3(List<EntityTable3> entityTable3) {
		this.entityTable3 = entityTable3;
	}
	
	
}
