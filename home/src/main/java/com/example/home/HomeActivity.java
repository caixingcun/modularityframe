package com.example.home;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.BaseActivity;

@Route(path = "/home/HomeActivity")
public class HomeActivity extends BaseActivity {

    @Override
    protected int getInjectLayoutId() {
        return R.layout.activity_home;
    }
}
