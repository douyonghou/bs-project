package com.example.zhang.hitsystem;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import adapter.ScoreAdapter_kc;
import adapter.TodayReciAdapter;
import bean.Score;
import bean.Subject;
import bean.TodayReci;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TodayRecipes extends AppCompatActivity {

    String classid;
    String classname;
    String usrid;
    TextView textView;
    private List<TodayReci> scoreList;
    Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_recipes);


        scoreList = new ArrayList<>();
        initStudents();

        mHandler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case 0:
                        Log.d("listlimian", "onCreate: "+scoreList.get(0).toString());
                        RecyclerView recyclerView = findViewById(R.id.student_score_recyclerview_kc);
                        LinearLayoutManager layoutManager = new LinearLayoutManager(TodayRecipes.this);
                        recyclerView.setLayoutManager(layoutManager);
                        TodayReciAdapter adapter = new TodayReciAdapter(scoreList);
                        recyclerView.setAdapter(adapter);
                        break;
                    default:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(TodayRecipes.this);
                        dialog.setTitle("错误");
                        dialog.setMessage("网络开小差啦！再试一下吧～");
                        dialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.show();
                }
            }
        };
    }
    public void initStudents(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
                    System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
                    String today = df.format(new Date());

                    String url = new String("http://"+getString(R.string.ipdress)+"reqallTodayReci_new?reci_time="+today);
                    Log.d("", "urlurl: "+url);
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder().url(url).build();
                    Response response = client.newCall(request).execute();
                    String responsedata = response.body().string();
                    Log.d("initstudnets", "run: "+responsedata);

                    JSONObject jsonObjectre = new JSONObject(responsedata);
                    JSONArray jsonArray = new JSONArray(jsonObjectre.get("todayRecis").toString());
                    TodayReci stu;
                    String todayReciName;
                    String score;
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject jsonObject = new JSONObject(jsonArray.get(i).toString());
                        todayReciName = jsonObject.getString("todayReciName");

                        stu = new TodayReci(todayReciName, today);
                        scoreList.add(stu);
                    }
                    mHandler.sendEmptyMessage(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
