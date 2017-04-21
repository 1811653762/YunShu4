package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.tck.transportation.R;
import com.tck.transportation.View.SimpleTitleView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 登录
 * Created by Zhao on 2017/4/20.
 */

public class PersonDataActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.simpleTitleView)
    SimpleTitleView simpleTitleView;
    @BindView(R.id.act_person_imgIcon)
    ImageView actPersonImgIcon;
    @BindView(R.id.act_person_img)
    RelativeLayout actPersonImg;
    @BindView(R.id.act_person_phone)
    RelativeLayout actPersonPhone;
    @BindView(R.id.act_person_wchat)
    RelativeLayout actPersonWchat;
    @BindView(R.id.act_person_pwd)
    RelativeLayout actPersonPwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_persondata);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {
        simpleTitleView.setTitle("我的资料");
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initListener() {
        actPersonImg.setOnClickListener(this);
        actPersonPhone.setOnClickListener(this);
        actPersonWchat.setOnClickListener(this);
        actPersonPwd.setOnClickListener(this);
        actPersonImgIcon.setOnClickListener(this);
    }


    //请求登录接口
    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_person_img://头像

                break;
            case R.id.act_person_phone://手机号

                break;
            case R.id.act_person_wchat://微信号

                break;
            case R.id.act_person_pwd://密码

                break;
            default:
                break;

        }

    }



}
