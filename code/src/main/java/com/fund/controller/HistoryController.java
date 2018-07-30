package com.fund.controller;

import javax.annotation.Resource;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fund.service.HistoryService;

@Controller
@RequestMapping("/history")
public class HistoryController {
	private static final Logger logger = LoggerFactory.getLogger(HistoryController.class);
	@Resource
	private HistoryService historyService;

	@RequestMapping(value = "/getHistory", method = RequestMethod.POST)
	@ResponseBody//此注解不能省略 否则ajax无法接受返回值
	public String getHistory(@QueryParam("fundCode")String fundCode) {
		logger.info("-------------------------测试日志");
		return fundCode;
	}
}
