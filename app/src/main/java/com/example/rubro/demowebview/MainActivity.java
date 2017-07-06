package com.example.rubro.demowebview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //escondo la barra de navegacion de android

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //ESTE CODIGO SE EJECUTARÁ EN 2 SEGUNDOS
                final Intent mainIntent;
                mainIntent = new Intent(MainActivity.this, VisorWeb.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();

            }
        }, 2000);
    }
}
