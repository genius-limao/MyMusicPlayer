package com.genius.smallmusic;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    private void init() {
        Utils.init(this);
    }
}
