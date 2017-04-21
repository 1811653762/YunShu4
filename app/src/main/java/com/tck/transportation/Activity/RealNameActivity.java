package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.tck.transportation.R;
import com.tck.transportation.View.SimpleTitleView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 实名认证
 * Created by Zhao on 2017/4/20.
 */

public class RealNameActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.simpleTitleView)
    SimpleTitleView simpleTitleView;
    @BindView(R.id.act_real_name)
    EditText actRealName;
    @BindView(R.id.act_real_cardcount)
    EditText actRealCardcount;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_realname);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {
        simpleTitleView.setTitle("实名认证");
//        simpleTitleView.setLeftButton(null, R.drawable.ic_header_left, new SimpleTitleView.OnLeftButtonClickListener() {
//
//            @Override
//            public void onLeftBtnClick(View button) {
//                // TODO Auto-generated method stub
//                    finish();
//            }
//        }, null);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {
//        actMycardBtn.setOnClickListener(this);
    }

    @Override
    protected void loadData() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_mycard_btn://绑定银行卡按钮
                break;
        }
    }
}
