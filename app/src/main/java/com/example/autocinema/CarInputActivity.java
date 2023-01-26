package com.example.autocinema;

import android.os.Bundle;

import com.google.android.apps.auto.sdk.CarActivity;

public class CarInputActivity extends CarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_input);
    }
}
