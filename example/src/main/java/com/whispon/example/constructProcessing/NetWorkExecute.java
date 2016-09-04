package com.whispon.example.constructProcessing;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by noriakioshita on 2016/09/04.
 */
public class NetWorkExecute extends AsyncTask<String, Void, String> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // doInBackground前処理
    }

    @Override
    protected String doInBackground(String... param) {
        HttpURLConnection connect = null;
        URL url = null;
        String sampleUrl = "http://news.yahoo.co.jp/pickup/rss.xml";

        try {
            url = new URL(sampleUrl);
            // 接続用オブジェクトの作成
            connect = (HttpURLConnection)url.openConnection();
            //restTypeでgetやputを分ける
            connect.setRequestMethod("GET");
            // リダイレクトを自動でしない設定
            connect.setInstanceFollowRedirects(false);
            // URL接続からデータを読み取る場合はtrue
            connect.setDoInput(true);
            // URL接続にデータを書き込まない場合はfalse
            connect.setDoOutput(false);
            // 接続
            connect.connect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return param[0];
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        // doInBackground後処理
        Log.d("dddd", result);
    }
}
