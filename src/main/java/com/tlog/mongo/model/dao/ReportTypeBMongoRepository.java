package com.tlog.mongo.model.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tlog.mongo.model.ReportTypeBConfig;

@Repository
public interface ReportTypeBMongoRepository extends MongoRepository<ReportTypeBConfig, String>{

	public List<ReportTypeBConfig> findByReportType(String reportType);
}
