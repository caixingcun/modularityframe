package com.example.mine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.BaseActivity;

@Route(path = "/mine/MineActivity")
public class MineActivity extends BaseActivity {


    @Override
    protected int getInjectLayoutId() {
        return R.layout.activity_mine;
    }
}
