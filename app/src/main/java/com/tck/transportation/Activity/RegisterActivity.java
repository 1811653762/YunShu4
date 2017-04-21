package com.tck.transportation.Activity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tck.transportation.R;
import com.tck.transportation.Utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 登录
 * Created by Zhao on 2017/4/20.
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.act_register_name)
    EditText actRegisterName;
    @BindView(R.id.act_register_vt)
    EditText actRegisterVt;
    @BindView(R.id.act_register_vtbtn)
    Button actRegisterVtbtn;
    @BindView(R.id.act_register_pwd)
    EditText actRegisterPwd;
    @BindView(R.id.act_register_pwdTwo)
    EditText actRegisterPwdTwo;
    @BindView(R.id.act_register_btn)
    Button actRegisterBtn;


    TimeCount  timeCount;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_register);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {

    }

    @Override
    protected void initView() {
        timeCount=new TimeCount(60000, 1000);
    }

    @Override
    protected void initListener() {
        actRegisterBtn.setOnClickListener(this);
        actRegisterVtbtn.setOnClickListener(this);
    }


    //请求注册接口
    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_register_btn://注册
                if (isRegister()) {
                      timeCount.start();
                }
            case R.id.act_register_vt://验证码
                if (isVt()) {

                }
        }

    }


    public boolean isRegister() {
        if (commonUtil.getString(actRegisterName).length() != 11) {
            ToastUtils.show("请输入正确的手机号码");
            return false;
        }
        if (commonUtil.getString(actRegisterVt).equals(" ")) {
            ToastUtils.show("请输入验证码");
            return false;
        }
        if (commonUtil.getString(actRegisterPwd).equals(" ")) {
            ToastUtils.show("请输入密码");
            return false;
        }
        if (commonUtil.getString(actRegisterPwd).equals(commonUtil.getString(actRegisterPwdTwo))) {
            ToastUtils.show("请确保两次密码一致");
            return false;
        }

        return true;
    }

    //请求验证码
    public boolean isVt() {
        if (commonUtil.getString(actRegisterName).length() != 11) {
            ToastUtils.show("请输入正确的手机号码");
            return false;
        }
        return true;
    }


    class TimeCount extends CountDownTimer {


        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {
            actRegisterVtbtn.setText(l / 1000 + "秒后重新发送");
            actRegisterVtbtn.setClickable(false);

        }

        @Override
        public void onFinish() {
            actRegisterVtbtn.setText("验证码");
            actRegisterVtbtn.setClickable(true);
        }
    }

}
