package com.genius.smallmusic.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.genius.smallmusic.R;
import com.genius.smallmusic.utils.UserUtils;

public class MeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        initView();
    }

    private void initView() {
        initNavBar(true, getString(R.string.personal_center), false);
    }

    /**
     * 退出登录的点击事件
     *
     * @param view
     */
    public void onLogoutClick(View view) {
        UserUtils.logout(this);
    }

    /**
     * 修改密码的点击事件
     *
     * @param view
     */
    public void onChangeClick(View view) {
        UserUtils.changePassword(this);
    }
}