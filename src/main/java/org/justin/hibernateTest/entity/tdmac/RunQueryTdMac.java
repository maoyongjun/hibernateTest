package org.justin.hibernateTest.entity.tdmac;


public class RunQueryTdMac {
	public static void main(String[] args) {
		TdMacUtil util = new TdMacUtil();
		String str ="ETH<70106F48BETH,70106F48BFAB,5820B10BEAF2,5820B10BEAF3>;BMC(BMC{BMC<70106F48BFA8>";
		TdMacEntity entity = new TdMacEntity();
		System.out.println(util.addTdsFromFiled2(entity,str).toString());
		System.out.println(util.addBmcFromFiled2(entity,str).toString());
		
		
	}
	
}
