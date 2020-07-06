package com.tlog.mongo.controller.config;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tlog.mongo.model.ReportTypeAConfig;
import com.tlog.mongo.model.ReportTypeBConfig;
import com.tlog.mongo.model.dao.ReportTypeAMongoRepository;
import com.tlog.mongo.model.dao.ReportTypeBMongoRepository;

@RestController
public class ReportConfigController {

	
	@Autowired
	ReportTypeAMongoRepository reportTypeA;
	
	@Autowired
	ReportTypeBMongoRepository reportTypeB;
	 
	
	@RequestMapping(value = "/reportTypeA", method = RequestMethod.GET, produces = "application/json")
	public List<ReportTypeAConfig> helloA() {
		
		List<ReportTypeAConfig> findAll = reportTypeA.findByReportType("a");
		return findAll;
	}
	
	@RequestMapping(value = "/reportTypeB", method = RequestMethod.GET, produces = "application/json")
	public List<ReportTypeBConfig> helloB() {
		
		List<ReportTypeBConfig> findAll = reportTypeB.findByReportType("b");
		return findAll;
	}
	@RequestMapping(value = "/save/reportTypeB", method = RequestMethod.POST, produces = "application/json")
	public void getAnything(@RequestBody String body) {
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			System.out.println("before insert: "+mapper.readValue(body, ReportTypeBConfig.class));
			
			 ReportTypeBConfig insert = reportTypeB.insert(mapper.readValue(body, ReportTypeBConfig.class));
			 
			 System.out.println("after insert: "+ insert);
			} catch (Exception e) {
				
			e.printStackTrace();
		}
		
	}

	

}

