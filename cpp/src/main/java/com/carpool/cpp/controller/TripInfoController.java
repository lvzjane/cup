package com.carpool.cpp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carpool.cpp.model.TripInfo;
import com.carpool.cpp.service.TripInfoServiceImpl;

@Controller
@RequestMapping("/trip")
public class TripInfoController {

	@Resource(name="TripInfoServiceImpl")
	private TripInfoServiceImpl tripInfoServiceImpl;
	
	@ResponseBody
	@RequestMapping("/get")
	public TripInfo getTripInfo() {
		TripInfo tripInfo = tripInfoServiceImpl.getTripInfo();
		return tripInfo;
	}
}
