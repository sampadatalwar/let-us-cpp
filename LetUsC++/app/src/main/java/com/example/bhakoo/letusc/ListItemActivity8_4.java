package com.example.bhakoo.letusc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ListItemActivity8_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item_activity8_4);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("file:///android_asset/8.4 Inheritance.html");
    }
}
