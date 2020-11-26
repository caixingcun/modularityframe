package com.example.chat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.BaseActivity;

import static com.example.chat_export.router.ChatRouterTable.ACTIVITY_CHAT;


@Route(path = ACTIVITY_CHAT)
public class ChatActivity extends BaseActivity {

    @Override
    protected int getInjectLayoutId() {
        return R.layout.activity_chat;
    }
}
