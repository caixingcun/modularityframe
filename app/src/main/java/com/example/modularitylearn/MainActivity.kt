package com.example.modularitylearn

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

@Route(path = "/app/MineActivity")
class MainActivity : AppCompatActivity() {

    @Autowired
    var key1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ARouter.getInstance().inject(this)

        tv_mine.setOnClickListener {
            ARouter.getInstance()
                    .build("/mine/MineActivity")
                    .navigation()
        }
        tv_home.setOnClickListener {
            ARouter.getInstance()
                    .build("/home/HomeActivity")
                    .navigation()
        }
        tv_category.setOnClickListener {
            ARouter.getInstance()
                    .build("/category/CategoryActivity")
                    .navigation()
        }
        tv_chat.setOnClickListener {
            ARouter.getInstance()
                    .build("/chat/ChatActivity")
                    .navigation()
        }

    }
}
