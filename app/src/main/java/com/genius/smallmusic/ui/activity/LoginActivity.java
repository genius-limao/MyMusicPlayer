package com.genius.smallmusic.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.genius.smallmusic.R;
import com.genius.smallmusic.ui.InputView;
import com.genius.smallmusic.utils.LogUtils;
import com.genius.smallmusic.utils.UserUtils;

public class LoginActivity extends BaseActivity {
    private static final String TAG = "LoginActivity";

    private InputView mInputPhone;
    private InputView mInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        initNavBar(false, getString(R.string.login), false);
        mInputPhone = findViewById(R.id.input_phone);
        mInputPassword = findViewById(R.id.input_password);
    }

    /**
     * 点击立即注册跳到注册页面
     *
     * @param view
     */
    public void onRegisterClick(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    /**
     * 登录按钮的点击事件
     *
     * @param view
     */
    public void onCommitClick(View view) {
        String phone = mInputPhone.getInputStr();
        String password = mInputPassword.getInputStr();
        LogUtils.logd(TAG, "onCommitClick phone: " + phone + ", password: " + password);
        //验证用户输入是否合法
        if (!UserUtils.validateLogin(this, phone, password)) {
            return;
        }

        //跳转到应用主页
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}