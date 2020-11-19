package com.example.commonlib;

import android.nfc.Tag;
import android.util.Log;

public class LogUtils {
    private static String TAG = "tag";

    public static void setTAG(String TAG) {
        LogUtils.TAG = TAG;
    }

    public static void debug(String content) {
        Log.d(TAG, content);
    }
}
