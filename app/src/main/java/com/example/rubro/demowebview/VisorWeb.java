package com.example.rubro.demowebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VisorWeb extends AppCompatActivity {

    WebView webView; //declaro mi webview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        getSupportActionBar().hide();//escondo la barra de navegacion de android

        webView = (WebView)findViewById(R.id.webview); //creo la instancia del elemento

        //habilitamos javascript y el zoom
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setDisplayZoomControls(false);
        String URL = "http://www.facebook.com";
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(URL);


    }
}
