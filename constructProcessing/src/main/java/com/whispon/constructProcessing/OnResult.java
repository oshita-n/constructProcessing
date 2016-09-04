package com.whispon.constructProcessing;

/**
 * Created by noriakioshita on 2016/09/03.
 */
public interface OnResult {
    public void onSuccess(String response);
    public void onFailure(NetworkException e);
}


