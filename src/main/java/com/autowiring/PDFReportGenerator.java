package com.autowiring;

public class PDFReportGenerator implements ReportGenerator{
	
	public String generateReport( int recordsPerPage) {
			return "Generated PDF Report with " + recordsPerPage + "records";
	}
}