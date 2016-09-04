package com.whispon.example.constructProcessing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NetWorkExecute post = new NetWorkExecute();
        post.execute( "http://hoge" );
    }
}
