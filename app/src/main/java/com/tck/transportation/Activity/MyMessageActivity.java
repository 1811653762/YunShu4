package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.tck.transportation.R;
import com.tck.transportation.View.SimpleTitleView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 登录
 * Created by Zhao on 2017/4/20.
 */

public class MyMessageActivity extends BaseActivity  {


    @BindView(R.id.simpleTitleView)
    SimpleTitleView simpleTitleView;
    @BindView(R.id.act_mymessage_recyclerView)
    RecyclerView actMymessageRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_mymessage);
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


    //请求注册接口
    @Override
    protected void loadData() {

    }




}
