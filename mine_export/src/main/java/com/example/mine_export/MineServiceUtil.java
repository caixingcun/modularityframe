package com.example.mine_export;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.mine_export.router.MineRouterTable;

public class MineServiceUtil {
    public static void navigateChatPage(){
        ARouter.getInstance()
                .build(MineRouterTable.ACTIVITY_MINE)
                .navigation();
    }
}
