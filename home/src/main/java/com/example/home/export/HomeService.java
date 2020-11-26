package com.example.home.export;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.LogUtils;
import com.example.home_export.service.IHomeExportService;

import static com.example.home_export.router.HomeRouterTable.*;

@Route(path = PATH_SERVICE_HOME,name = "测试服务")
public class HomeService implements IHomeExportService {
    @Override
    public String homeFunction(String s) {
        return "来自homeModule的问候";
    }

    @Override
    public void init(Context context) {
        LogUtils.debug("homeService init");
    }
}
