package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tck.transportation.R;

import butterknife.ButterKnife;

/**
 * 评星规则
 * Created by Zhao on 2017/4/20.
 */

public class CommentActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }


    //请求登录接口
    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_login_btn:

        }

    }


}
