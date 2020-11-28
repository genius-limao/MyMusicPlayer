package com.genius.smallmusic.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.genius.smallmusic.R;

public class ChangePasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        initView();
    }

    private void initView() {
        initNavBar(true, getString(R.string.change_password), false);
    }

    /**
     * 确认的点击事件
     *
     * @param view
     */
    public void onConfirmClick(View view) {
    }
}