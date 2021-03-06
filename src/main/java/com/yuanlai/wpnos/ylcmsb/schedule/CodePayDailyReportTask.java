package com.yuanlai.wpnos.ylcmsb.schedule;

import com.yuanlai.wpnos.ylcmsb.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * @author Lee
 *
 */
public class CodePayDailyReportTask {
	
	private static Logger log = LoggerFactory.getLogger(CodePayDailyReportTask.class);

	@Autowired
	private ReportService reportService;

	public void run() {
		log.debug("T+1日生成交易报表   Task Start");

		try {
			reportService.dailyReportTask();
		} catch (Exception e) {
			log.error("T+1日生成交易报表 Exception:  " + e.getMessage());
			e.printStackTrace();
		}
		log.debug("T+1日生成交易报表   Task End");

	}

}
