package com.example.modularitylearn;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();

    }

    private void initARouter() {
        if (BuildConfig.LOG_DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
