package com.whispon.example.constructProcessing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.whispon.constructProcessing.*;

import com.whispon.constructProcessing.NetWorkExecute;
import com.whispon.example.constructProcessing.R;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CPHttp cpHttp = new CPHttp();
        ProgressBar progressBar;
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        cpHttp.get("http://www.gundam.info", new OnResult() {
            @Override
            public void onSuccess(String response) {
                Log.d("aaa", "onSuccess");
            }

            @Override
            public void onError(NetWorkException exception) {
                Toast.makeText(MainActivity.this, exception.toString(), Toast.LENGTH_SHORT).show();
            }
        }, progressBar);
    }
}
