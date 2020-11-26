package com.example.chat_export;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.chat_export.router.ChatRouterTable;

public class ChatServiceUtil {
    public static void navigateChat(){
        ARouter.getInstance()
                .build(ChatRouterTable.ACTIVITY_CHAT)
                .navigation();
    }
}
