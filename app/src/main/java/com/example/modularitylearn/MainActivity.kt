package com.example.modularitylearn

import com.alibaba.android.arouter.facade.annotation.Route
import com.example.category_export.CategoryServiceUtil
import com.example.chat_export.ChatServiceUtil
import com.example.commonlib.BaseActivity
import com.example.home_export.HomeServiceUtil
import com.example.mine_export.MineServiceUtil
import kotlinx.android.synthetic.main.activity_main.*

@Route(path = "/app/MineActivity")
class MainActivity : BaseActivity() {
    override fun getInjectLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        super.initView()

        tv_mine.setOnClickListener {
            MineServiceUtil.navigateChatPage()
        }
        tv_home.setOnClickListener {
            HomeServiceUtil.navigateHomePage()
        }
        tv_category.setOnClickListener {
            CategoryServiceUtil.navigateCategoryPage()
        }
        tv_chat.setOnClickListener {
            ChatServiceUtil.navigateChat()
        }
    }
}
