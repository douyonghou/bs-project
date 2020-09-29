package org.system.service;

import org.system.pojo.TodayReci;

import java.util.List;

public interface TodayReciService {
    public List<TodayReci> queryAllTodayRecis();
    public List<TodayReci> queryTodayReciTime(String time);



}
