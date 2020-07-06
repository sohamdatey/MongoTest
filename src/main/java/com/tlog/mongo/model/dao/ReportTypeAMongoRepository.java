package com.tlog.mongo.model.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tlog.mongo.model.ReportTypeAConfig;

@Repository
public interface ReportTypeAMongoRepository extends MongoRepository<ReportTypeAConfig, String>{

	public List<ReportTypeAConfig> findByReportType(String reportType);
}
