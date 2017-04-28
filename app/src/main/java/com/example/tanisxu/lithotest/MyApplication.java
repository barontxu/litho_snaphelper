package com.example.tanisxu.lithotest;

import android.app.Application;

import com.facebook.soloader.SoLoader;

/**
 * Created by Zizhe Xu <zzhxu@mobvoi.com> on 4/24/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, false);
    }
}
