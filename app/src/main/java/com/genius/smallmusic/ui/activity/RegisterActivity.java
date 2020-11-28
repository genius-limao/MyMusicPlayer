package com.genius.smallmusic.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.blankj.utilcode.util.ToastUtils;
import com.genius.smallmusic.R;
import com.genius.smallmusic.ui.InputView;

public class RegisterActivity extends BaseActivity {
    private InputView inputPhone;
    private InputView inputPassword;
    private InputView verifyPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        initNavBar(true, getString(R.string.register), false);
        inputPhone = findViewById(R.id.input_phone);
        inputPassword = findViewById(R.id.input_password);
        verifyPassword = findViewById(R.id.verify_password);
    }

    public void onRegisterClick(View view) {
        ToastUtils.showShort("注册");
    }
}