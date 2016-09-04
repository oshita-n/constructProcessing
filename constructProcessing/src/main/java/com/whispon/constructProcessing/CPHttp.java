package com.whispon.constructProcessing;

import android.view.View;

/**
 * Created by noriakioshita on 2016/09/04.
 */
public class CPHttp {

    public void get(String url) {
        NetworkExecute netWorkExecute = new NetworkExecute(new OnResult() {
            @Override
            public void onSuccess(String response) {}
            @Override
            public void onFailure(NetworkException e) {}
        }, null);
        netWorkExecute.execute(url);
    }

    public void get(String url, OnResult onResult) {
        NetworkExecute networkExecute = new NetworkExecute(onResult, null);
        networkExecute.execute(url);

    }

    public void get(String url, OnResult onResult, View progress) {
        NetworkExecute networkExecute = new NetworkExecute(onResult,progress);
        networkExecute.execute(url);
    }

    public void put() {

    }

    public void post() {

    }

    public void delete() {

    }
}
