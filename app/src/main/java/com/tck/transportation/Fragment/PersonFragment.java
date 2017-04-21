package com.tck.transportation.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tck.transportation.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 我的
 * Created by Zhao on 2017/4/21.
 */

public class PersonFragment extends BaseFragment implements View.OnClickListener {

    @BindView(R.id.fg_person_icon)
    ImageView fgPersonIcon;
    @BindView(R.id.fg_person_name)
    TextView fgPersonName;
    @BindView(R.id.fg_person_ratingBar)
    RatingBar fgPersonRatingBar;
    @BindView(R.id.fg_person_realIcon)
    ImageView fgPersonRealIcon;
    @BindView(R.id.fg_person_realpass)
    TextView fgPersonRealpass;
    @BindView(R.id.fg_person_real)
    RelativeLayout fgPersonReal;
    @BindView(R.id.fg_person_mycar)
    LinearLayout fgPersonMycar;
    @BindView(R.id.fg_person_mycard)
    LinearLayout fgPersonMycard;
    @BindView(R.id.fg_person_offenway)
    LinearLayout fgPersonOffenway;
    @BindView(R.id.fg_person_update)
    LinearLayout fgPersonUpdate;
    @BindView(R.id.fg_person_setting)
    LinearLayout fgPersonSetting;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_person, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {

    }

    @Override
    public void loadData() {

    }

    @Override
    public void initListener() {
        fgPersonIcon.setOnClickListener(this);
        fgPersonMycar.setOnClickListener(this);
        fgPersonMycard.setOnClickListener(this);
        fgPersonOffenway.setOnClickListener(this);
        fgPersonSetting.setOnClickListener(this);
        fgPersonReal.setOnClickListener(this);
        fgPersonUpdate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fg_person_icon://头像

                break;
            case R.id.fg_person_real://实名认证

                break;
            case R.id.fg_person_mycar://我的车辆

                break;
            case R.id.fg_person_mycard://绑定银行卡

                break;
            case R.id.fg_person_offenway://长跑路线

                break;
            case R.id.fg_person_update://检查更新

                break;
            case R.id.fg_person_setting://设置

                break;
            default:
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
