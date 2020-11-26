package com.example.category_export;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.category_export.router.CategoryRouterTable;

public class CategoryServiceUtil {
    /**
     * 跳转分类页
     */
    public static void navigateCategoryPage(){
        ARouter.getInstance()
                .build(CategoryRouterTable.ACTIVITY_CATEGORY)
                .navigation();
    }
}
