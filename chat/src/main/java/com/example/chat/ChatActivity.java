package com.example.chat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.BaseActivity;

@Route(path = "/chat/ChatActivity")
public class ChatActivity extends BaseActivity {

    @Override
    protected int getInjectLayoutId() {
        return R.layout.activity_chat;
    }
}
