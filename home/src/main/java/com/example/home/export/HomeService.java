package com.example.home.export;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.HomeExportService;
import com.example.commonlib.LogUtils;

@Route(path = "/home/HomeService",name = "测试服务")
public class HomeService implements HomeExportService {
    @Override
    public String homeFunction(String s) {
        return "来自homeModule的问候";
    }

    @Override
    public void init(Context context) {
        LogUtils.debug("homeService init");
    }
}
