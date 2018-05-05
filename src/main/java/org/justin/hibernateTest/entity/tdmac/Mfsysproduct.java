package org.justin.hibernateTest.entity.tdmac;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mfsysproduct")
public class Mfsysproduct {
	
	@Id
	String	sysserialno;
	Integer	seqno;
	String	factoryid;
	String	workorderno;
	String	skuno;
	String	custpartno;
	String	eeecode;
	String	upccode;
	String	enetid;
	String	productfamily;
	String	productlevel;
	String	productcolor;
	String	productlangulage;
	String	categoryname;
	String	prioritycode;
	String	shipcountry;
	String	productdesc;
	String	orderno;
	String	compcode;
	Integer	shipped;
	Date	shipdate;
	String	location;
	String	whid;
	String	areaid;
	String	field1;
	String	field2;
	String	field3;
	String	field4;
	String	field5;
	String	field6;
	Integer	packageno;
	String	systemstage;
	Double	unitcost;
	Integer	lineseqno;
	Integer	needswap;
	Integer	swapped;
	String	sysserialnoshort;
	String	workordernoorg;
	String	othercategoryname;
	String	lasteditby;
	Date	lasteditdt;
	Integer	disassembled;
	Integer	closed;
	String	skuversion;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="sysserialno",nullable=true)
	Set<Mfsyscserial> sns = new HashSet<Mfsyscserial>();
	public String getSysserialno() {
		return sysserialno;
	}
	public void setSysserialno(String sysserialno) {
		this.sysserialno = sysserialno;
	}
	public Integer getSeqno() {
		return seqno;
	}
	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}
	public String getFactoryid() {
		return factoryid;
	}
	public void setFactoryid(String factoryid) {
		this.factoryid = factoryid;
	}
	public String getWorkorderno() {
		return workorderno;
	}
	public void setWorkorderno(String workorderno) {
		this.workorderno = workorderno;
	}
	public String getSkuno() {
		return skuno;
	}
	public void setSkuno(String skuno) {
		this.skuno = skuno;
	}
	public String getCustpartno() {
		return custpartno;
	}
	public void setCustpartno(String custpartno) {
		this.custpartno = custpartno;
	}
	public String getEeecode() {
		return eeecode;
	}
	public void setEeecode(String eeecode) {
		this.eeecode = eeecode;
	}
	public String getUpccode() {
		return upccode;
	}
	public void setUpccode(String upccode) {
		this.upccode = upccode;
	}
	public String getEnetid() {
		return enetid;
	}
	public void setEnetid(String enetid) {
		this.enetid = enetid;
	}
	public String getProductfamily() {
		return productfamily;
	}
	public void setProductfamily(String productfamily) {
		this.productfamily = productfamily;
	}
	public String getProductlevel() {
		return productlevel;
	}
	public void setProductlevel(String productlevel) {
		this.productlevel = productlevel;
	}
	public String getProductcolor() {
		return productcolor;
	}
	public void setProductcolor(String productcolor) {
		this.productcolor = productcolor;
	}
	public String getProductlangulage() {
		return productlangulage;
	}
	public void setProductlangulage(String productlangulage) {
		this.productlangulage = productlangulage;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getPrioritycode() {
		return prioritycode;
	}
	public void setPrioritycode(String prioritycode) {
		this.prioritycode = prioritycode;
	}
	public String getShipcountry() {
		return shipcountry;
	}
	public void setShipcountry(String shipcountry) {
		this.shipcountry = shipcountry;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getCompcode() {
		return compcode;
	}
	public void setCompcode(String compcode) {
		this.compcode = compcode;
	}
	public Integer getShipped() {
		return shipped;
	}
	public void setShipped(Integer shipped) {
		this.shipped = shipped;
	}
	public Date getShipdate() {
		return shipdate;
	}
	public void setShipdate(Date shipdate) {
		this.shipdate = shipdate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWhid() {
		return whid;
	}
	public void setWhid(String whid) {
		this.whid = whid;
	}
	public String getAreaid() {
		return areaid;
	}
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}
	public String getField4() {
		return field4;
	}
	public void setField4(String field4) {
		this.field4 = field4;
	}
	public String getField5() {
		return field5;
	}
	public void setField5(String field5) {
		this.field5 = field5;
	}
	public String getField6() {
		return field6;
	}
	public void setField6(String field6) {
		this.field6 = field6;
	}
	public Integer getPackageno() {
		return packageno;
	}
	public void setPackageno(Integer packageno) {
		this.packageno = packageno;
	}
	public String getSystemstage() {
		return systemstage;
	}
	public void setSystemstage(String systemstage) {
		this.systemstage = systemstage;
	}
	public Double getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(Double unitcost) {
		this.unitcost = unitcost;
	}
	public Integer getLineseqno() {
		return lineseqno;
	}
	public void setLineseqno(Integer lineseqno) {
		this.lineseqno = lineseqno;
	}
	public Integer getNeedswap() {
		return needswap;
	}
	public void setNeedswap(Integer needswap) {
		this.needswap = needswap;
	}
	public Integer getSwapped() {
		return swapped;
	}
	public void setSwapped(Integer swapped) {
		this.swapped = swapped;
	}
	public String getSysserialnoshort() {
		return sysserialnoshort;
	}
	public void setSysserialnoshort(String sysserialnoshort) {
		this.sysserialnoshort = sysserialnoshort;
	}
	public String getWorkordernoorg() {
		return workordernoorg;
	}
	public void setWorkordernoorg(String workordernoorg) {
		this.workordernoorg = workordernoorg;
	}
	public String getOthercategoryname() {
		return othercategoryname;
	}
	public void setOthercategoryname(String othercategoryname) {
		this.othercategoryname = othercategoryname;
	}
	public String getLasteditby() {
		return lasteditby;
	}
	public void setLasteditby(String lasteditby) {
		this.lasteditby = lasteditby;
	}
	public Date getLasteditdt() {
		return lasteditdt;
	}
	public void setLasteditdt(Date lasteditdt) {
		this.lasteditdt = lasteditdt;
	}
	public Integer getDisassembled() {
		return disassembled;
	}
	public void setDisassembled(Integer disassembled) {
		this.disassembled = disassembled;
	}
	public Integer getClosed() {
		return closed;
	}
	public void setClosed(Integer closed) {
		this.closed = closed;
	}
	public String getSkuversion() {
		return skuversion;
	}
	public void setSkuversion(String skuversion) {
		this.skuversion = skuversion;
	}
	@Override
	public String toString() {
		return "MfsysproductModel [sysserialno=" + sysserialno + ", seqno=" + seqno + ", factoryid=" + factoryid
				+ ", workorderno=" + workorderno + ", skuno=" + skuno + ", custpartno=" + custpartno + ", eeecode="
				+ eeecode + ", upccode=" + upccode + ", enetid=" + enetid + ", productfamily=" + productfamily
				+ ", productlevel=" + productlevel + ", productcolor=" + productcolor + ", productlangulage="
				+ productlangulage + ", categoryname=" + categoryname + ", prioritycode=" + prioritycode
				+ ", shipcountry=" + shipcountry + ", productdesc=" + productdesc + ", orderno=" + orderno
				+ ", compcode=" + compcode + ", shipped=" + shipped + ", shipdate=" + shipdate + ", location="
				+ location + ", whid=" + whid + ", areaid=" + areaid + ", field1=" + field1 + ", field2=" + field2
				+ ", field3=" + field3 + ", field4=" + field4 + ", field5=" + field5 + ", field6=" + field6
				+ ", packageno=" + packageno + ", systemstage=" + systemstage + ", unitcost=" + unitcost
				+ ", lineseqno=" + lineseqno + ", needswap=" + needswap + ", swapped=" + swapped + ", sysserialnoshort="
				+ sysserialnoshort + ", workordernoorg=" + workordernoorg + ", othercategoryname=" + othercategoryname
				+ ", lasteditby=" + lasteditby + ", lasteditdt=" + lasteditdt + ", disassembled=" + disassembled
				+ ", closed=" + closed + ", skuversion=" + skuversion + "]";
	}
	public Set<Mfsyscserial> getSns() {
		return sns;
	}
	public void setSns(Set<Mfsyscserial> sns) {
		this.sns = sns;
	}
	

}
