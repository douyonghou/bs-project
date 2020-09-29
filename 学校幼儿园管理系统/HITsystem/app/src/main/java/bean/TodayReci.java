package bean;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class TodayReci {

    private String reci_time;
    private String reci_name;

    public TodayReci(String reci_time, String reci_name) {
        this.reci_time = reci_time;
        this.reci_name = reci_name;
    }

    public TodayReci() {
    }

    public String getReci_time() {
        return reci_time;
    }

    public void setReci_time(String reci_time) {
        this.reci_time = reci_time;
    }

    public void setReci_name(String reci_name) {
        this.reci_name = reci_name;
    }

    public String getReci_name() {
        return reci_name;
    }

    @Override
    public String toString() {
        return "TodayReci{" +
                "reci_time='" + reci_time + '\'' +
                ", reci_name='" + reci_name + '\'' +
                '}';
    }
}
