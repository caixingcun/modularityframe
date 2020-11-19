package com.example.category;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.BaseActivity;

@Route(path = "/category/CategoryActivity")
public class CategoryActivity extends BaseActivity {
    @Override
    protected int getInjectLayoutId() {
        return R.layout.activity_category;
    }
}
