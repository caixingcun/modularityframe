package com.example.home;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.BaseActivity;

import static com.example.home_export.router.HomeRouterTable.PATH_ACTIVITY_HOME;

@Route(path = PATH_ACTIVITY_HOME)
public class HomeActivity extends BaseActivity {

    @Override
    protected int getInjectLayoutId() {
        return R.layout.activity_home;
    }
}
