package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tck.transportation.Utils.CommonUtil;
import com.tck.transportation.Utils.ToastUtils;
import com.zhy.autolayout.AutoLayoutActivity;

/**
 * Created by Zhao on 2017/4/20.
 */

public abstract class BaseActivity   extends AutoLayoutActivity {
    public   CommonUtil  commonUtil;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataAll();
        initData();
    }

    private void initDataAll() {
        ToastUtils.init(BaseActivity.this);
        commonUtil=new CommonUtil();
    }

    public  void  initData()
    {
        initView();
        initListener();
        initTitle();
        loadData();
    }

    protected abstract void initTitle();
    protected abstract void initView();
    protected abstract void initListener();
    protected abstract void loadData();
}
