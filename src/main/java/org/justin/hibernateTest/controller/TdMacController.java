package org.justin.hibernateTest.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.justin.hibernateTest.dao.QueryResultDao;
import org.justin.hibernateTest.entity.tdmac.QueryResult;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TdMacController {
	@Resource
	QueryResultDao queryResultDao;
	
	@GetMapping("/td/query")
	@ResponseBody
	public  List<QueryResult> getQueryResult(String sn){
		 List<QueryResult> result = queryResultDao.findResultBySysserialno(sn);
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
