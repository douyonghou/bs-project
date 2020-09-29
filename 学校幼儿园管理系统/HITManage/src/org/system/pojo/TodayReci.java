package org.system.pojo;

public class TodayReci {
	private String reci_time;
	private String reci_name;



	public TodayReci(String todayReciTime, String todayReciName) {
		super();
		reci_time = todayReciTime;
		reci_name = todayReciName;

	}
	public String gettodayReciTime() {
		return reci_time;
	}
	public void settodayReciTime(String todayReciTime) {
		reci_time = todayReciTime;
	}
	public String gettodayReciName() {
		return reci_name;
	}
	public void settodayReci_name(String todayReciName) {
		reci_name = todayReciName;
	}

	@Override
	public String toString() {
		return "TodayReci{" +
				"reci_time='" + reci_time + '\'' +
				", reci_name='" + reci_name + '\'' +
				'}';
	}
}
