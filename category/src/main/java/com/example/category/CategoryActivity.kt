package com.example.category


import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.commonlib.BaseActivity
import com.example.commonlib.HomeExportService
import com.example.commonlib.LogUtils
import kotlinx.android.synthetic.main.activity_category.*

@Route(path = "/category/CategoryActivity")
class CategoryActivity : BaseActivity() {
    @Autowired(name = "/home/HomeService")
    @JvmField
    var mHomeService: HomeExportService? = null

    override fun getInjectLayoutId(): Int {
        return R.layout.activity_category
    }

    override fun initView() {
        super.initView()
        tv.setOnClickListener {
            val homeFunction = mHomeService?.homeFunction("我调用了homeModule")
            tv.text = homeFunction
        }
    }
}
