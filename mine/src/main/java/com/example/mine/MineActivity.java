package com.example.mine;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.BaseActivity;

import static com.example.mine_export.router.MineRouterTable.ACTIVITY_MINE;

@Route(path = ACTIVITY_MINE)
public class MineActivity extends BaseActivity {


    @Override
    protected int getInjectLayoutId() {
        return R.layout.activity_mine;
    }
}
