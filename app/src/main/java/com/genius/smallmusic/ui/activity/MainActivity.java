package com.genius.smallmusic.ui.activity;

import android.os.Bundle;

import com.genius.smallmusic.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        initNavBar(false, getString(R.string.app_name), true);
    }
}