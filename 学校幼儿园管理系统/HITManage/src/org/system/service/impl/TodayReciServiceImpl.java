package org.system.service.impl;



import org.system.dao.TodayReciDao;
import org.system.pojo.TodayReci;
import org.system.service.TodayReciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodayReciServiceImpl implements TodayReciService {

	@Autowired
	private TodayReciDao td;
	@Override
	public List<TodayReci> queryAllTodayRecis() {
		return td.queryAllTodayRecis();
	}

	@Override
	public List<TodayReci> queryTodayReciTime(String time) {
		return td.queryTodayReciTime(time);
	}


}
