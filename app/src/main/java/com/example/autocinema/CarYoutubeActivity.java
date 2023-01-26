package com.example.autocinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import com.google.android.apps.auto.sdk.CarActivity;

public class CarYoutubeActivity extends CarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_youtube);
        // getCarUiController().getStatusBarController().setTitle("Hello AA");

        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.youtube.com/");

        Button button = (Button) findViewById(R.id.keyboard);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(CarYoutubeActivity.this, CarInputService.class);
                CarYoutubeActivity.this.startService(myIntent);
            }
        });
    }
}