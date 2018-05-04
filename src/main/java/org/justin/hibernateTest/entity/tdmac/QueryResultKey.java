package org.justin.hibernateTest.entity.tdmac;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Embeddable

public class QueryResultKey implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="SYSSERIALNO")
	String	sysserialno	;
	@Column(name="RUNNUMBER")
	Integer	RunNumber	;
//	@Column(name="FAILNUMBER")
//	Integer	FailNumber	;
//	@Column(name="STATIONNAME")
//	String	StationName	;
//	@Column(name="TESTSTATUS")
//	String	TestStatus	;
//	@Column(name="FAILREASON")
//	String	FailReason	;
	@Column(name="LASTEDITDT")
	Date	LastEditDT	;
//	@Column(name="FIELD1")
//	String	Field1	;
//	@Column(name="FIELD2")
//	String	Field2	;
//	@Column(name="FIELD3")
//	String	Field3	;
//	@Column(name="FIELD4")
//	String	Field4	;
//	@Column(name="FIELD5")
//	String	Field5	;
//	@Column(name="FIELD6")
//	String	Field6	;
	public QueryResultKey(){}
	public String getSysserialno() {
		return sysserialno;
	}
	public void setSysserialno(String sysserialno) {
		this.sysserialno = sysserialno;
	}
	public Integer getRunNumber() {
		return RunNumber;
	}
	public void setRunNumber(Integer runNumber) {
		RunNumber = runNumber;
	}
	public Date getLastEditDT() {
		return LastEditDT;
	}
	public void setLastEditDT(Date lastEditDT) {
		LastEditDT = lastEditDT;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
