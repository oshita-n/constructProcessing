package com.whispon.constructprocessing;

import android.view.View;

/**
 * Created by noriakioshita on 2016/09/04.
 */
public class CPHttp {
    public void get(String url) {
        NetworkExecute netWorkExecute = new NetworkExecute(new OnSuccess() {
            @Override
            public void onSuccess(String response) {

            }
        }, new OnFailure() {
            @Override
            public void onFailure(NetworkException e) {

            }
        }, null);
        netWorkExecute.setRestMode("GET");
        netWorkExecute.execute(url);
    }

    public void get(String url, OnSuccess onSuccess, OnFailure onFailure) {
        NetworkExecute networkExecute = new NetworkExecute(onSuccess, onFailure, null);
        networkExecute.setRestMode("GET");
        networkExecute.execute(url);
    }

    public void get(String url, OnSuccess onSuccess, OnFailure onFailure, View progress) {
        NetworkExecute networkExecute = new NetworkExecute(onSuccess, onFailure, progress);
        networkExecute.setRestMode("GET");
        networkExecute.execute(url);
    }

    public void post(String url) {
        NetworkExecute netWorkExecute = new NetworkExecute(new OnSuccess() {
            @Override
            public void onSuccess(String response) {

            }
        }, new OnFailure() {
            @Override
            public void onFailure(NetworkException e) {

            }
        }, null);
        netWorkExecute.setRestMode("POST");
        netWorkExecute.execute(url);
    }

    public void post(String url, OnSuccess onSuccess, OnFailure onFailure) {
        NetworkExecute networkExecute = new NetworkExecute(onSuccess, onFailure, null);
        networkExecute.setRestMode("POST");
        networkExecute.execute(url);
    }

    public void post(String url, OnSuccess onSuccess, OnFailure onFailure, View progress) {
        NetworkExecute networkExecute = new NetworkExecute(onSuccess, onFailure, progress);
        networkExecute.setRestMode("POST");
        networkExecute.execute(url);
    }

    public void put(String url) {
        NetworkExecute netWorkExecute = new NetworkExecute(new OnSuccess() {
            @Override
            public void onSuccess(String response) {

            }
        }, new OnFailure() {
            @Override
            public void onFailure(NetworkException e) {

            }
        }, null);
        netWorkExecute.setRestMode("PUT");
        netWorkExecute.execute(url);
    }

    public void put(String url, OnSuccess onSuccess, OnFailure onFailure) {
        NetworkExecute networkExecute = new NetworkExecute(onSuccess, onFailure, null);
        networkExecute.setRestMode("PUT");
        networkExecute.execute(url);
    }

    public void put(String url, OnSuccess onSuccess, OnFailure onFailure, View progress) {
        NetworkExecute networkExecute = new NetworkExecute(onSuccess, onFailure, progress);
        networkExecute.setRestMode("PUT");
        networkExecute.execute(url);
    }

    public void delete(String url) {
        NetworkExecute netWorkExecute = new NetworkExecute(new OnSuccess() {
            @Override
            public void onSuccess(String response) {

            }
        }, new OnFailure() {
            @Override
            public void onFailure(NetworkException e) {

            }
        }, null);
        netWorkExecute.setRestMode("DELETE");
        netWorkExecute.execute(url);
    }

    public void delete(String url, OnSuccess onSuccess, OnFailure onFailure) {
        NetworkExecute networkExecute = new NetworkExecute(onSuccess, onFailure, null);
        networkExecute.setRestMode("DELETE");
        networkExecute.execute(url);
    }

    public void delete(String url, OnSuccess onSuccess, OnFailure onFailure, View progress) {
        NetworkExecute networkExecute = new NetworkExecute(onSuccess, onFailure, progress);
        networkExecute.setRestMode("DELETE");
        networkExecute.execute(url);
    }
}
