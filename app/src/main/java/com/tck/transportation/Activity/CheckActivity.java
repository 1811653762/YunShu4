package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tck.transportation.R;
import com.tck.transportation.View.SimpleTitleView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 审核中
 * Created by Zhao on 2017/4/20.
 */

public class CheckActivity extends BaseActivity {


    @BindView(R.id.simpleTitleView)
    SimpleTitleView simpleTitleView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_check);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {
        simpleTitleView.setTitle("审核中");
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void loadData() {

    }
}
