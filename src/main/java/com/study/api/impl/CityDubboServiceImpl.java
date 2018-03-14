
package com.study.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.api.CityDubboService;
import com.study.entity.City;

/**
 * @author LIU
 *
 */

// version可调整适应
@Service(version = "1.0.1")
public class CityDubboServiceImpl implements CityDubboService {

	private Logger logger = LoggerFactory.getLogger(CityDubboServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.study.api.CityDubboService#findCityByName(java.lang.String)
	 */
	public City findCityByName(String cityName) {
		// TODO DB 等处理
		logger.debug("[invoke] ---cityName---:{}", cityName);

		System.out.println("[SERVER] RPC invoke cityName--------->" + cityName);

		return new City(1L, 2L, "LUOYANG", "HENAN SHENG");
	}

}
