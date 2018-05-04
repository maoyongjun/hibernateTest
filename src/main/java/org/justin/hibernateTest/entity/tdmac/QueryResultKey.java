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
	@Column(name="sysserialno")
	String	sysserialno	;
	@Column(name="RunNumber")
	Integer	RunNumber	;
	@Column(name="FailNumber")
	Integer	FailNumber	;
	@Column(name="ProdLine")
	String	ProdLine	;
	@Column(name="StationName")
	String	StationName	;
	@Column(name="TestStatus")
	String	TestStatus	;
	@Column(name="FailReason")
	String	FailReason	;
	@Column(name="CreateBy")
	String	CreateBy	;
	@Column(name="CreateDT")
	Date	CreateDT	;
	@Column(name="LastEditBy")
	String	LastEditBy	;
	@Column(name="LastEditDT")
	Date	LastEditDT	;
	@Column(name="TestSuiteName")
	String	TestSuiteName	;
	@Column(name="LocationSerialNumber")
	String	LocationSerialNumber	;
	@Column(name="StationMachineName")
	String	StationMachineName	;
	@Column(name="TestCompleteTime")
	Date	TestCompleteTime	;
	@Column(name="Field1")
	String	Field1	;
	@Column(name="Field2")
	String	Field2	;
	@Column(name="Field3")
	String	Field3	;
	@Column(name="Field4")
	String	Field4	;
	@Column(name="Field5")
	String	Field5	;
	@Column(name="Field6")
	String	Field6	;
	public QueryResultKey(){}
	public QueryResultKey(String sysserialno, Integer runNumber, Integer failNumber, String prodLine,
			String stationName, String testStatus, String failReason, String createBy, Date createDT, String lastEditBy,
			Date lastEditDT, String testSuiteName, String locationSerialNumber, String stationMachineName,
			Date testCompleteTime, String field1, String field2, String field3, String field4, String field5,
			String field6) {
		super();
		this.sysserialno = sysserialno;
		RunNumber = runNumber;
		FailNumber = failNumber;
		ProdLine = prodLine;
		StationName = stationName;
		TestStatus = testStatus;
		FailReason = failReason;
		CreateBy = createBy;
		CreateDT = createDT;
		LastEditBy = lastEditBy;
		LastEditDT = lastEditDT;
		TestSuiteName = testSuiteName;
		LocationSerialNumber = locationSerialNumber;
		StationMachineName = stationMachineName;
		TestCompleteTime = testCompleteTime;
		Field1 = field1;
		Field2 = field2;
		Field3 = field3;
		Field4 = field4;
		Field5 = field5;
		Field6 = field6;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CreateBy == null) ? 0 : CreateBy.hashCode());
		result = prime * result + ((CreateDT == null) ? 0 : CreateDT.hashCode());
		result = prime * result + ((FailNumber == null) ? 0 : FailNumber.hashCode());
		result = prime * result + ((FailReason == null) ? 0 : FailReason.hashCode());
		result = prime * result + ((Field1 == null) ? 0 : Field1.hashCode());
		result = prime * result + ((Field2 == null) ? 0 : Field2.hashCode());
		result = prime * result + ((Field3 == null) ? 0 : Field3.hashCode());
		result = prime * result + ((Field4 == null) ? 0 : Field4.hashCode());
		result = prime * result + ((Field5 == null) ? 0 : Field5.hashCode());
		result = prime * result + ((Field6 == null) ? 0 : Field6.hashCode());
		result = prime * result + ((LastEditBy == null) ? 0 : LastEditBy.hashCode());
		result = prime * result + ((LastEditDT == null) ? 0 : LastEditDT.hashCode());
		result = prime * result + ((LocationSerialNumber == null) ? 0 : LocationSerialNumber.hashCode());
		result = prime * result + ((ProdLine == null) ? 0 : ProdLine.hashCode());
		result = prime * result + ((RunNumber == null) ? 0 : RunNumber.hashCode());
		result = prime * result + ((StationMachineName == null) ? 0 : StationMachineName.hashCode());
		result = prime * result + ((StationName == null) ? 0 : StationName.hashCode());
		result = prime * result + ((TestCompleteTime == null) ? 0 : TestCompleteTime.hashCode());
		result = prime * result + ((TestStatus == null) ? 0 : TestStatus.hashCode());
		result = prime * result + ((TestSuiteName == null) ? 0 : TestSuiteName.hashCode());
		result = prime * result + ((sysserialno == null) ? 0 : sysserialno.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueryResultKey other = (QueryResultKey) obj;
		if (CreateBy == null) {
			if (other.CreateBy != null)
				return false;
		} else if (!CreateBy.equals(other.CreateBy))
			return false;
		if (CreateDT == null) {
			if (other.CreateDT != null)
				return false;
		} else if (!CreateDT.equals(other.CreateDT))
			return false;
		if (FailNumber == null) {
			if (other.FailNumber != null)
				return false;
		} else if (!FailNumber.equals(other.FailNumber))
			return false;
		if (FailReason == null) {
			if (other.FailReason != null)
				return false;
		} else if (!FailReason.equals(other.FailReason))
			return false;
		if (Field1 == null) {
			if (other.Field1 != null)
				return false;
		} else if (!Field1.equals(other.Field1))
			return false;
		if (Field2 == null) {
			if (other.Field2 != null)
				return false;
		} else if (!Field2.equals(other.Field2))
			return false;
		if (Field3 == null) {
			if (other.Field3 != null)
				return false;
		} else if (!Field3.equals(other.Field3))
			return false;
		if (Field4 == null) {
			if (other.Field4 != null)
				return false;
		} else if (!Field4.equals(other.Field4))
			return false;
		if (Field5 == null) {
			if (other.Field5 != null)
				return false;
		} else if (!Field5.equals(other.Field5))
			return false;
		if (Field6 == null) {
			if (other.Field6 != null)
				return false;
		} else if (!Field6.equals(other.Field6))
			return false;
		if (LastEditBy == null) {
			if (other.LastEditBy != null)
				return false;
		} else if (!LastEditBy.equals(other.LastEditBy))
			return false;
		if (LastEditDT == null) {
			if (other.LastEditDT != null)
				return false;
		} else if (!LastEditDT.equals(other.LastEditDT))
			return false;
		if (LocationSerialNumber == null) {
			if (other.LocationSerialNumber != null)
				return false;
		} else if (!LocationSerialNumber.equals(other.LocationSerialNumber))
			return false;
		if (ProdLine == null) {
			if (other.ProdLine != null)
				return false;
		} else if (!ProdLine.equals(other.ProdLine))
			return false;
		if (RunNumber == null) {
			if (other.RunNumber != null)
				return false;
		} else if (!RunNumber.equals(other.RunNumber))
			return false;
		if (StationMachineName == null) {
			if (other.StationMachineName != null)
				return false;
		} else if (!StationMachineName.equals(other.StationMachineName))
			return false;
		if (StationName == null) {
			if (other.StationName != null)
				return false;
		} else if (!StationName.equals(other.StationName))
			return false;
		if (TestCompleteTime == null) {
			if (other.TestCompleteTime != null)
				return false;
		} else if (!TestCompleteTime.equals(other.TestCompleteTime))
			return false;
		if (TestStatus == null) {
			if (other.TestStatus != null)
				return false;
		} else if (!TestStatus.equals(other.TestStatus))
			return false;
		if (TestSuiteName == null) {
			if (other.TestSuiteName != null)
				return false;
		} else if (!TestSuiteName.equals(other.TestSuiteName))
			return false;
		if (sysserialno == null) {
			if (other.sysserialno != null)
				return false;
		} else if (!sysserialno.equals(other.sysserialno))
			return false;
		return true;
	}

}
