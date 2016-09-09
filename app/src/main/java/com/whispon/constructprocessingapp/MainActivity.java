package com.whispon.constructprocessingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.whispon.constructprocessing.CPHttp;
import com.whispon.constructprocessing.NetworkException;
import com.whispon.constructprocessing.OnResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);
        CPHttp cpHttp = new CPHttp();
        cpHttp.get("http://whispon.com", new OnResult() {
            @Override
            public void onSuccess(String response) {
                Log.d("success",response);
            }

            @Override
            public void onFailure(NetworkException e) {
                Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_LONG).show();
            }
        },progressBar);
    }
}
