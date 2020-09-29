package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetSinData {


    public String captureHtml(String stockID) throws Exception {
        String strURL = "http://localhost:8080/"+ stockID;
        URL url = new URL(strURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        InputStreamReader input = new InputStreamReader(httpConn.getInputStream());
        BufferedReader bufReader = new BufferedReader(input);
        String line = "";
        StringBuilder contentBuf = new StringBuilder();

        line = bufReader.readLine();
        System.out.println(line);
        return line;

    }



    public static void main(String[] args) throws Exception {
        GetSinData getSinData=new GetSinData();
        getSinData.captureHtml("login?id=1163710215&password=123456");

    }
}
