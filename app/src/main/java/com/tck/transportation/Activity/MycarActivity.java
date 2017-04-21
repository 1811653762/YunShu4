package com.tck.transportation.Activity;

import android.os.Bundle;
import android.os.CountDownTimer;
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
 * 登录
 * Created by Zhao on 2017/4/20.
 */

public class MycarActivity extends BaseActivity implements View.OnClickListener {


    TimeCount timeCount;
    @BindView(R.id.act_login_icon)
    ImageView actLoginIcon;
    @BindView(R.id.act_forget_name)
    EditText actForgetName;
    @BindView(R.id.act_forget_vt)
    EditText actForgetVt;
    @BindView(R.id.act_forget_vtbtn)
    Button actForgetVtbtn;
    @BindView(R.id.act_forget_btn)
    Button actForgetBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_forgetpwd);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {

    }

    @Override
    protected void initView() {
        timeCount = new TimeCount(60000, 1000);
    }

    @Override
    protected void initListener() {
        actForgetBtn.setOnClickListener(this);
        actForgetVtbtn.setOnClickListener(this);
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
        if (commonUtil.getString(actForgetName).length() != 11) {
            ToastUtils.show("请输入正确的手机号码");
            return false;
        }
        if (commonUtil.getString(actForgetVt).equals(" ")) {
            ToastUtils.show("请输入验证码");
            return false;
        }

        return true;
    }

    //请求验证码
    public boolean isVt() {
        if (commonUtil.getString(actForgetName).length() != 11) {
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
            actForgetVtbtn.setText(l / 1000 + "秒后重新发送");
            actForgetVtbtn.setClickable(false);

        }

        @Override
        public void onFinish() {
            actForgetVtbtn.setText("验证码");
            actForgetVtbtn.setClickable(true);
        }
    }

}
