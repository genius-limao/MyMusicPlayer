package com.genius.smallmusic.utils;

import android.util.Log;

public class LogUtils {
    private static final boolean SHOW_DEBUG_LOG = true;

    public static void logd(String Tag, String msg) {
        if (SHOW_DEBUG_LOG) Log.d(Tag, msg);
    }

    public static void loge(String Tag, String msg) {
        Log.e(Tag, "small music error: " + msg);
    }

    public static void logi(String Tag, String msg) {
        Log.i(Tag, msg);
    }

    public static void logw(String Tag, String msg) {
        Log.w(Tag, msg);
    }

    public static void logv(String Tag, String msg) {
        Log.v(Tag, msg);
    }

}
