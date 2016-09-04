package com.whispon.constructProcessing;

import android.view.View;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by noriakioshita on 2016/09/04.
 */
public class CPHttp {

    public void get(String url) {
        NetWorkExecute netWorkExecute = new NetWorkExecute(new OnResult() {
            @Override
            public void onSuccess(String response) {

            }

            @Override
            public void onError(NetWorkException e) {

            }
        }, null);
        netWorkExecute.execute(url);
    }

    public void get(String url, OnResult onResult) {
        NetWorkExecute netWorkExecute = new NetWorkExecute(onResult, null);
        netWorkExecute.execute(url);

    }

    public void get(String url, OnResult onResult, View progress) {
        NetWorkExecute netWorkExecute = new NetWorkExecute(onResult,progress);
        netWorkExecute.execute(url);
    }

    public void put() {

    }

    public void post() {

    }

    public void delete() {

    }

    public void onSuccess(String response) {}

    public void onError(NetWorkException e) {}
}
