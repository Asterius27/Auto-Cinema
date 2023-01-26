package com.example.autocinema;

import com.google.android.apps.auto.sdk.CarActivity;
import com.google.android.apps.auto.sdk.CarActivityService;

public class CarYoutubeService extends CarActivityService {
    @Override
    public Class<? extends CarActivity> getCarActivity() {
        return CarYoutubeActivity.class;
    }
}