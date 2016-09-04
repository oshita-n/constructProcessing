package com.whispon.example.constructProcessing;

import android.os.Handler;
import android.util.Xml;

import java.io.IOException;

/**
 * Created by noriakioshita on 2016/09/03.
 */

public class Config implements OnSuccess, OnError {
    /**
     * 実際の通信処理
     */
    public void mainRun() {

    }

    /**
     * 通信処理が失敗した時の処理
     */
    public void faildRun() {

    }

    /**
     * 処理中にプログレスアイコンを表示する
     * 時間があれば実装
     */
    public void displayProgress() {

    }

    /**
     * onSuccess
     * 成功した時の処理を書く
     * ユーザーが任意に書く
     */

    public void onSuccess(String response) {}

    /**
     * onError
     * 失敗した時の処理を書く
     * ユーザーが任意に書く
     */
    public void onError(IOException e) {}

}
