package com.example.category

import com.alibaba.android.arouter.facade.annotation.Route
import com.example.commonlib.BaseActivity
import com.example.home_export.HomeServiceUtil
import com.example.home_export.service.IHomeExportService
import kotlinx.android.synthetic.main.activity_category.*

@Route(path = com.example.category_export.router.CategoryRouterTable.ACTIVITY_CATEGORY)
class CategoryActivity : BaseActivity() {

    var mHomeService: IHomeExportService? = HomeServiceUtil.getHomeService()

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
