package com.example.home_export;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.home_export.router.HomeRouterTable;
import com.example.home_export.service.IHomeExportService;

public class HomeServiceUtil {
    /**
     * 跳转home主页面
     */
    public static void navigateHomePage() {
        ARouter.getInstance()
                .build(HomeRouterTable.PATH_ACTIVITY_HOME)
                .navigation();
    }

    /**
     * 获取 home 服务
     *
     * @return
     */
    public static IHomeExportService getHomeService() {
        return (IHomeExportService) ARouter.getInstance()
                .build(HomeRouterTable.PATH_SERVICE_HOME)
                .navigation();
    }

}
