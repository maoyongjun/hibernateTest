package org.justin.hibernateTest.entity;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

@Entity
public class SdshippkitemResult2 implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String orderno1;
	private String shiporderno1 ;
	private String sysserialno1;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderno1() {
		return orderno1;
	}
	public void setOrderno1(String orderno1) {
		this.orderno1 = orderno1;
	}
	public String getShiporderno1() {
		return shiporderno1;
	}
	public void setShiporderno1(String shiporderno1) {
		this.shiporderno1 = shiporderno1;
	}
	public String getSysserialno1() {
		return sysserialno1;
	}
	public void setSysserialno1(String sysserialno1) {
		this.sysserialno1 = sysserialno1;
	}
	
}
