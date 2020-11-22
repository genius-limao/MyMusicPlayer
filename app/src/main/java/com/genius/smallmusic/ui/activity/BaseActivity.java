package com.genius.smallmusic.ui.activity;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.genius.smallmusic.R;

public class BaseActivity extends Activity {
    private ImageView mIvBack, mIvMe;
    private TextView mTVTitle;

    protected void initNavBar(boolean isShowBack, String title, boolean isShowMe) {
        mIvBack = findViewById(R.id.iv_back);
        mTVTitle = findViewById(R.id.tv_title);
        mIvMe = findViewById(R.id.iv_me);
        mIvBack.setVisibility(isShowBack ? View.VISIBLE : View.GONE);
        mTVTitle.setText(title);
        mIvMe.setVisibility(isShowMe ? View.VISIBLE : View.GONE);

        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
