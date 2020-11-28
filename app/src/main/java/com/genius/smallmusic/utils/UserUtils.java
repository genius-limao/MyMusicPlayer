package com.genius.smallmusic.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.genius.smallmusic.R;
import com.genius.smallmusic.ui.activity.ChangePasswordActivity;
import com.genius.smallmusic.ui.activity.LoginActivity;

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

    /**
     * 退出登录跳转到登录页面
     *
     * @param context
     */
    public static void logout(Context context) {
        if (!(context instanceof Activity)) {
            LogUtils.logd(TAG, "logout context is null!");
            return;
        }
        Intent intent = new Intent(context, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        //定义跳转动画，必须在startActivity之后调用
        ((Activity) context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);
    }

    /**
     * 点击修改密码进入修改密码页面
     *
     * @param context
     */
    public static void changePassword(Context context) {
        if (!(context instanceof Activity)) {
            LogUtils.logd(TAG, "logout context is null!");
            return;
        }
        Intent intent = new Intent(context, ChangePasswordActivity.class);
        context.startActivity(intent);
    }
}
