package com.tlog.mongo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="reportconfig")
public class ReportTypeBConfig {
	
	@Id
	String reportId;
	String reportType; 
	Date begindate;
	Date endDate;
	List<Integer> planIds;
	
	ReportTypeEnum type;
	
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public Date getBegindate() {
		return begindate;
	}
	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<Integer> getPlanIds() {
		return planIds;
	}
	public void setPlanIds(List<Integer> planIds) {
		this.planIds = planIds;
	}
	
	
	@Override
	public String toString() {
		return "ReportTypeBConfig [reportId=" + reportId + ", reportType=" + reportType + ", begindate=" + begindate
				+ ", endDate=" + endDate + ", planIds=" + planIds + ", type=" + type + "]";
	}
	public ReportTypeEnum getType() {
		return type;
	}
	public void setType(ReportTypeEnum type) {
		this.type = type;
	}
	
	
	
}
