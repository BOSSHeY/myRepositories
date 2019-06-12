package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.mapper.StuMapperDao;

/**
 * 作者:何耀阳
 * 时间:2019年6月9日
 */
@Service
public class StuService {
	@Autowired
	private StuMapperDao sd;

	public List<Map<String, Object>> stuList() {
		return sd.stuList();
	}
}
