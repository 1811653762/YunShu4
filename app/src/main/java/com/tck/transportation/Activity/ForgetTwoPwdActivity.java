package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.tck.transportation.R;
import com.tck.transportation.Utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 忘记密码
 * Created by Zhao on 2017/4/20.
 */

public class ForgetTwoPwdActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.act_forgetTwo_icon)
    ImageView actForgetTwoIcon;
    @BindView(R.id.act_forgetTwo_pwd)
    EditText actForgetTwoPwd;
    @BindView(R.id.act_forgetTwo_pwdtwo)
    EditText actForgetTwoPwdtwo;
    @BindView(R.id.act_forgetTwo_btn)
    Button actForgetTwoBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_forgetwopwd);
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
        actForgetTwoBtn.setOnClickListener(this);
    }


    //请求接口
    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_forgetTwo_btn://注册
                if (isForget()) {

                }
        }

    }


    public boolean isForget() {
        if (commonUtil.getString(actForgetTwoPwd).length() != 11) {
            ToastUtils.show("请输入密码");
            return false;
        }
        if (commonUtil.getString(actForgetTwoPwdtwo).equals(" ")) {
            ToastUtils.show("请再次输入密码");
            return false;
        }
        if (!commonUtil.getString(actForgetTwoPwdtwo).equals(commonUtil.getString(actForgetTwoPwdtwo))) {
            ToastUtils.show("请确认两次密码输入一致");
            return false;
        }

        return true;
    }
}
