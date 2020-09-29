package org.system.dao;

import org.apache.ibatis.annotations.Param;
import org.system.pojo.TodayReci;

import java.util.List;

public interface TodayReciDao {
       public List<TodayReci> queryAllTodayRecis();
       public List<TodayReci> queryTodayReciTime(String time);
       public List<TodayReci> queryTodayReciName(String name);

       /**
        *
        * @param TodayReciName
        * @return TodayReci
        */
       public List<TodayReci> queryTodayReciByStudnetIdAndTodayReciName(@Param("TodayReciTime") String TodayReciTime, @Param("TodayReciName") String TodayReciName);
       public TodayReci queryTodayReciByTodayReciName(String TodayReciName);
}
