package com.whispon.example.constructProcessing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.whispon.constructProcessing.*;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar progressBar;
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        CPHttp cpHttp = new CPHttp();
        cpHttp.get("http://whispon.com", new OnResult() {
            @Override
            public void onSuccess(String response) {
                Log.d("success", "onSuccess");
            }
            @Override
            public void onFailure(NetworkException exception) {
                Toast.makeText(MainActivity.this, exception.toString(), Toast.LENGTH_SHORT).show();
            }
        }, progressBar);
    }
}
