package org.system.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.system.pojo.TodayReci;
import org.system.service.TodayReciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;


@Controller
public class TodayReciController {

	@Autowired
	private TodayReciService trs;

	@RequestMapping(value="/queryAllTodayRecis" ,method=RequestMethod.POST)
	public String queryAllTodayRecis(Map<String,List<TodayReci>> map)
	{
		List<TodayReci> todayRecis =  trs.queryAllTodayRecis();
		map.put("todayRecis", todayRecis);
		return "todayReci";

	}


	@RequestMapping(value="reqallTodayReci_new")
	public void reqsbuscore(HttpServletRequest request,HttpServletResponse response)
	{
		response.setContentType("text/html;charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		response.setCharacterEncoding("utf-8");
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String reci_time = request.getParameter("reci_time");
		//  System.out.println(id);
		List<TodayReci> todayRecis = trs.queryTodayReciTime(reci_time);
		System.out.println(todayRecis.toString());

		JSONObject object =new JSONObject();
		object.put("status", true);
		object.put("todayRecis", todayRecis);
		try {
			PrintWriter writer = response.getWriter();
			writer.print(object);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//Android
	@RequestMapping(value="reqallTodayReci")
	public void reqallTodayReci(HttpServletRequest request,HttpServletResponse response)
	{
		response.setContentType("text/html;charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		response.setCharacterEncoding("utf-8");


		List<TodayReci> TodayRecis = trs.queryAllTodayRecis();
		List<String> strList= new ArrayList<String>();
		for(TodayReci s :TodayRecis)
		{
			strList.add(s.toString());
		}
		JSONArray object = JSONArray.fromObject(strList);

		try {
			PrintWriter pw = response.getWriter();
			pw.print(object);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
