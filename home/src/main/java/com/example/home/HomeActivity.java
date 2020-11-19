package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.commonlib.BaseActivity;

@Route(path = "/home/HomeActivity")
public class HomeActivity extends BaseActivity {

    @Override
    protected int getInjectLayoutId() {
        return R.layout.activity_home;
    }
}
