package com.whispon.example.constructProcessing;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by noriakioshita on 2016/09/04.
 */
public class CPHttp {
    HttpURLConnection connect = null;
    String restTyoe;
    URL url = null;
    NetWorkExecute netWorkExecute = new NetWorkExecute();

    public void get(URL url) {
        // 接続用オブジェクトの作成
        //connect = (HttpURLConnection)url.openConnection();
        //connect.setRequestMethod("GET");
        // リダイレクトを自動でしない設定
        connect.setInstanceFollowRedirects(false);
        // URL接続からデータを読み取る場合はtrue
        connect.setDoInput(true);
        // URL接続にデータを書き込まない場合はfalse
        connect.setDoOutput(false);


    }

    public void put() {

    }

    public void post() {

    }

    public void delete() {

    }
}
