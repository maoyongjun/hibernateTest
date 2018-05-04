package org.justin.hibernateTest.entity.tdmac;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name = "mfsystestresult")
@IdClass(QueryResultKey.class)	
public class QueryResult {
	
//	@EmbeddedId
//	private QueryResultKey id;
	@Id@Column(insertable=false,updatable=false)
	String	sysserialno	;
	@Id@Column(insertable=false,updatable=false)
	Integer	RunNumber	;
	@Id@Column(insertable=false,updatable=false)
	Integer	FailNumber	;
	@Id@Column(insertable=false,updatable=false)
	String	ProdLine	;
	@Id@Column(insertable=false,updatable=false)
	String	StationName	;
	@Id@Column(insertable=false,updatable=false)
	String	TestStatus	;
	@Id@Column(insertable=false,updatable=false)
	String	FailReason	;
	@Id@Column(insertable=false,updatable=false)
	String	CreateBy	;
	@Id@Column(insertable=false,updatable=false)
	Date	CreateDT	;
	@Id@Column(insertable=false,updatable=false)
	String	LastEditBy	;
	@Id@Column(insertable=false,updatable=false)
	Date	LastEditDT	;
	@Id@Column(insertable=false,updatable=false)
	String	TestSuiteName	;
	@Id@Column(insertable=false,updatable=false)
	String	LocationSerialNumber	;
	@Id@Column(insertable=false,updatable=false)
	String	StationMachineName	;
	@Id@Column(insertable=false,updatable=false)
	Date	TestCompleteTime	;
	@Id@Column(insertable=false,updatable=false)
	String	Field1	;
	@Id@Column(insertable=false,updatable=false)
	String	Field2	;
	@Id@Column(insertable=false,updatable=false)
	String	Field3	;
	@Id@Column(insertable=false,updatable=false)
	String	Field4	;
	@Id@Column(insertable=false,updatable=false)
	String	Field5	;
	@Id@Column(insertable=false,updatable=false)
	String	Field6	;
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
	public Integer getFailNumber() {
		return FailNumber;
	}
	public void setFailNumber(Integer failNumber) {
		FailNumber = failNumber;
	}
	public String getProdLine() {
		return ProdLine;
	}
	public void setProdLine(String prodLine) {
		ProdLine = prodLine;
	}
	public String getStationName() {
		return StationName;
	}
	public void setStationName(String stationName) {
		StationName = stationName;
	}
	public String getTestStatus() {
		return TestStatus;
	}
	public void setTestStatus(String testStatus) {
		TestStatus = testStatus;
	}
	public String getFailReason() {
		return FailReason;
	}
	public void setFailReason(String failReason) {
		FailReason = failReason;
	}
	public String getCreateBy() {
		return CreateBy;
	}
	public void setCreateBy(String createBy) {
		CreateBy = createBy;
	}
	public Date getCreateDT() {
		return CreateDT;
	}
	public void setCreateDT(Date createDT) {
		CreateDT = createDT;
	}
	public String getLastEditBy() {
		return LastEditBy;
	}
	public void setLastEditBy(String lastEditBy) {
		LastEditBy = lastEditBy;
	}
	public Date getLastEditDT() {
		return LastEditDT;
	}
	public void setLastEditDT(Date lastEditDT) {
		LastEditDT = lastEditDT;
	}
	public String getTestSuiteName() {
		return TestSuiteName;
	}
	public void setTestSuiteName(String testSuiteName) {
		TestSuiteName = testSuiteName;
	}
	public String getLocationSerialNumber() {
		return LocationSerialNumber;
	}
	public void setLocationSerialNumber(String locationSerialNumber) {
		LocationSerialNumber = locationSerialNumber;
	}
	public String getStationMachineName() {
		return StationMachineName;
	}
	public void setStationMachineName(String stationMachineName) {
		StationMachineName = stationMachineName;
	}
	public Date getTestCompleteTime() {
		return TestCompleteTime;
	}
	public void setTestCompleteTime(Date testCompleteTime) {
		TestCompleteTime = testCompleteTime;
	}
	public String getField1() {
		return Field1;
	}
	public void setField1(String field1) {
		Field1 = field1;
	}
	public String getField2() {
		return Field2;
	}
	public void setField2(String field2) {
		Field2 = field2;
	}
	public String getField3() {
		return Field3;
	}
	public void setField3(String field3) {
		Field3 = field3;
	}
	public String getField4() {
		return Field4;
	}
	public void setField4(String field4) {
		Field4 = field4;
	}
	public String getField5() {
		return Field5;
	}
	public void setField5(String field5) {
		Field5 = field5;
	}
	public String getField6() {
		return Field6;
	}
	public void setField6(String field6) {
		Field6 = field6;
	}
//	@EmbeddedId
//	public QueryResultKey getId() {
//		return id;
//	}
//	public void setId(QueryResultKey id) {
//		this.id = id;
//	}

	
}
