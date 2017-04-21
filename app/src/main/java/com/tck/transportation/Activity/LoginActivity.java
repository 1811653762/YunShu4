package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.tck.transportation.R;
import com.tck.transportation.Utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 登录
 * Created by Zhao on 2017/4/20.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.act_login_icon)
    ImageView actLoginIcon;
    @BindView(R.id.act_login_name)
    EditText actLoginName;
    @BindView(R.id.act_login_pwd)
    EditText actLoginPwd;
    @BindView(R.id.act_login_btn)
    Button actLoginBtn;
    @BindView(R.id.act_login_register)
    TextView actLoginRegister;

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
        actLoginRegister.setOnClickListener(this);
        actLoginBtn.setOnClickListener(this);
    }


    //请求登录接口
    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_login_btn:
                if (isLogin()) {

                }
        }

    }


    public boolean isLogin() {
        if (commonUtil.getString(actLoginName).length() != 11) {
            ToastUtils.show("请输入正确的手机号码");
            return false;
        }
        if (commonUtil.getString(actLoginPwd).equals(" ")) {
            ToastUtils.show("请输入密码");
            return false;
        }
        return true;
    }
}
