package com.tck.transportation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RelativeLayout;

import com.tck.transportation.R;
import com.tck.transportation.View.SimpleTitleView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 设置
 * Created by Zhao on 2017/4/20.
 */

public class SttingActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.simpleTitleView)
    SimpleTitleView simpleTitleView;
    @BindView(R.id.act_setting_font)
    RelativeLayout actSettingFont;
    @BindView(R.id.act_setting_push)
    RelativeLayout actSettingPush;
    @BindView(R.id.act_setting_sugg)
    RelativeLayout actSettingSugg;
    @BindView(R.id.act_setting_about)
    RelativeLayout actSettingAbout;
    @BindView(R.id.act_setting_clear)
    RelativeLayout actSettingClear;
    @BindView(R.id.act_setting_cancel)
    RelativeLayout actSettingCancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_setting);
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.act_setting_about://关于

                break;
            case R.id.act_setting_cancel://注销

                break;
            case R.id.act_setting_clear://清除

                break;
            case R.id.act_setting_sugg://反馈

                break;
            case R.id.act_setting_push://推送

                break;
            case R.id.act_setting_font://字体大小设置

                break;
            default:
                break;
        }
    }

    @Override
    protected void initTitle() {
        simpleTitleView.setTitle("设置");
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
        actSettingFont.setOnClickListener(this);
        actSettingPush.setOnClickListener(this);
        actSettingSugg.setOnClickListener(this);
        actSettingAbout.setOnClickListener(this);
        actSettingFont.setOnClickListener(this);
        actSettingClear.setOnClickListener(this);
        actSettingCancel.setOnClickListener(this);
    }

    @Override
    protected void loadData() {

    }
}
