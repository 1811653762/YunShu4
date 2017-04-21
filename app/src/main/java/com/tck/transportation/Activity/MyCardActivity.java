package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tck.transportation.R;
import com.tck.transportation.Utils.ToastUtils;
import com.tck.transportation.View.SimpleTitleView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 我的银行卡
 * Created by Zhao on 2017/4/20.
 */

public class MyCardActivity extends BaseActivity   implements View.OnClickListener {
    @BindView(R.id.simpleTitleView)
    SimpleTitleView simpleTitleView;
    @BindView(R.id.act_mycard_ed)
    EditText actMycardEd;
    @BindView(R.id.act_mycard_btn)
    Button actMycardBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_mycard);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {
        simpleTitleView.setTitle("我的银行卡");
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
        actMycardBtn.setOnClickListener(this);
    }

    @Override
    protected void loadData() {

    }

    public boolean isCard() {
        if (commonUtil.getString(actMycardEd).length() != 18) {
            ToastUtils.show("请输入正确的手机号码");
            return false;
        }
        return true;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.act_mycard_btn://绑定银行卡按钮
                if(isCard())
                {

                }
                break;
        }
    }
}
