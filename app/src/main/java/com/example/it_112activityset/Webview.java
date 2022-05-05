package com.example.it_112activityset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webview extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide Title Bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_webview);

        webview = (WebView) findViewById(R.id.wonder_wiki);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://en.m.wikipedia.org/wiki/Wonders_of_the_World");

    }

    @Override
    public void onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack();
        }
        else{
        super.onBackPressed();
        }
    }
}