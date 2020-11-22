package com.genius.smallmusic.utils;

import android.content.Context;
import android.text.TextUtils;

import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.genius.smallmusic.R;

public class UserUtils {
    private static final String TAG = "UserUtils";

    /**
     * 校验手机号和密码
     *
     * @param context
     * @param phone    手机号
     * @param password 密码
     * @return 返回校验结果 true：成功  false：失败
     */
    public static boolean validateLogin(Context context, String phone, String password) {
        if (context == null) {
            LogUtils.logd(TAG, "validateLogin context is null!");
            return false;
        }
        //简单的匹配手机号 RegexUtils.isMobileSimple(phone);
        //精确的匹配手机号 RegexUtils.isMobileExact(phone);
        if (!RegexUtils.isMobileExact(phone)) {
            ToastUtils.showShort(R.string.invalid_phone_number);
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            ToastUtils.showShort(R.string.input_password);
            return false;
        }
        return true;
    }
}
