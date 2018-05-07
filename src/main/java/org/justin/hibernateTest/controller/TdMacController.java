package org.justin.hibernateTest.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.justin.hibernateTest.dao.MfsyscserialDao;
import org.justin.hibernateTest.dao.MfsysproductDao;
import org.justin.hibernateTest.dao.QueryResult2Dao;
import org.justin.hibernateTest.dao.QueryResultDao;
import org.justin.hibernateTest.entity.tdmac.Mfsyscserial;
import org.justin.hibernateTest.entity.tdmac.MfsyscserialKey;
import org.justin.hibernateTest.entity.tdmac.Mfsysproduct;
import org.justin.hibernateTest.entity.tdmac.QueryResult;
import org.justin.hibernateTest.entity.tdmac.QueryResult2;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TdMacController {
	@Resource
	QueryResultDao queryResultDao;
	
	@Resource
	QueryResult2Dao queryResult2Dao;
	
	@Resource
	MfsysproductDao mfsysproductDao;
	
	@Resource
	MfsyscserialDao mfsyscserialDao;
	
	@GetMapping("/td/query")
	@ResponseBody
	public  List<QueryResult> getQueryResult(String sn) throws ParseException{
		System.out.println(mfsysproductDao.findOne("1A21Q8E00-600-G-7456-0003-X1"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date lasteditdt = sdf.parse("2016-12-18 08:06:00.000");
		MfsyscserialKey cskey = new MfsyscserialKey("~7CE0000009","~1500070A",lasteditdt);
		Mfsyscserial cs = mfsyscserialDao.findOne(cskey);
		System.out.println(cs);
		System.out.println(sdf.format(cs.getLasteditdt()));
		 List<QueryResult> result = queryResultDao.findResultBySysserialno(sn);
		return result;
		
	}
//	@GetMapping("/td/queryMfsysproducts")
//	@ResponseBody
//	public List<Mfsysproduct> getQueryMfsysprocutBySns(String sns){
//		return mfsysproductDao.findModelBySysserialno(sns);
//	}
	
	@GetMapping("/td/queryMfsysproduct")
	@ResponseBody
	public Mfsysproduct getQueryMfsyscs(String sn){
		Mfsysproduct f = new Mfsysproduct();
		f.setSysserialno(sn);
		Example<Mfsysproduct> e = Example.of(f);
		f = mfsysproductDao.findOne(e);
		Mfsyscserial csn = new Mfsyscserial();
		csn.setSysserialno(sn);
		csn.setCategoryname("L010");
		Example<Mfsyscserial> e1 = Example.of(csn);
		List<Mfsyscserial> csns = mfsyscserialDao.findAll(e1);
		f.setSns(new HashSet<>(csns));
		return f;
	}
	
	@GetMapping("/td/query2")
	@ResponseBody
	public  List<QueryResult2> getQueryResult2(String sn){
		List<QueryResult2> result = queryResult2Dao.findResultBySysserialno(sn);
		return result;
		
	}

	@GetMapping("/td/queryAll")
	@ResponseBody
	public List<QueryResult>  getQueryAllResult(){
		return  queryResultDao.findAll();
		
	}
	
	@GetMapping("/td/save")
	@ResponseBody
	public QueryResult getSaveResult(){
		QueryResult result = new QueryResult();
		result.setSysserialno("abcd");
		result.setRunNumber(1);
		result.setFailNumber(1);
		result.setStationName("stationName");
		result.setTestStatus("testResult");
		result.setFailReason("reason");
		result.setLastEditDT(new Date());
		result.setField1("filed1");
		result.setField2("abcd=1");
		result.setField3("field3");
		result.setField4("field4");
		result.setField5("field5");
		result.setField6("field6");
		result.setCreateBy("abc");
		result.setCreateDT(new Date());
		return queryResultDao.save(result);
		
	}
}
