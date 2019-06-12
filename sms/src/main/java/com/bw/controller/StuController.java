package com.bw.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.service.StuService;

/**
 * 作者:何耀阳
 * 时间:2019年6月9日
 */
@Controller
public class StuController {
	@Autowired
	private StuService ss;
	
	@RequestMapping("list.do")
	public String stuList(Model model) {
		List<Map<String, Object>> list = ss.stuList();
		model.addAttribute("list",list);
		return "list";
	}
}
