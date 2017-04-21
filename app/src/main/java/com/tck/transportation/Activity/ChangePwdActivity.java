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
 * 修改密码
 * Created by Zhao on 2017/4/20.
 */

public class ChangePwdActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.simpleTitleView)
    SimpleTitleView simpleTitleView;
    @BindView(R.id.act_change_pwd1)
    EditText actChangePwd1;
    @BindView(R.id.act_change_pwd2)
    EditText actChangePwd2;
    @BindView(R.id.act_change_btn)
    Button actChangeBtn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_changepwd);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {
        simpleTitleView.setTitle("修改密码");
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initListener() {
        actChangeBtn.setOnClickListener(this);
    }


    //请求接口
    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_change_btn://修改密码按钮
                if (isChange()) {

                }
                break;

            default:
                break;

        }

    }

    public boolean isChange() {
        if (commonUtil.getString(actChangePwd1).equals(" ")) {
            ToastUtils.show("请输入旧密码");
            return false;
        }
        if (commonUtil.getString(actChangePwd2).equals(" ")) {
            ToastUtils.show("请输入新密码");
            return false;
        }
        if (!commonUtil.getString(actChangePwd1).equals(commonUtil.getString(actChangePwd2))) {
            ToastUtils.show("请保持两次密码一致");
            return false;
        }
        return true;
    }

}
