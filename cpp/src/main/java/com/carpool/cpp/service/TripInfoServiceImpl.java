package com.carpool.cpp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carpool.cpp.model.TripInfo;

@Service("TripInfoServiceImpl")
@Transactional
public class TripInfoServiceImpl {

	public TripInfo getTripInfo() {
		TripInfo t = new TripInfo();
		t.setStartPoint("北京");
		t.setEndPoint("固始");
		t.setDepartureTime("20019-10-01");
		t.setComments("人找车");
		return t;
	}
}
