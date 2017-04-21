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
 * 登录
 * Created by Zhao on 2017/4/20.
 */

public class SuggestionActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.simpleTitleView)
    SimpleTitleView simpleTitleView;
    @BindView(R.id.act_suggestion_ed)
    EditText actSuggestionEd;
    @BindView(R.id.act_suggestion_btn)
    Button actSuggestionBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_suggestion);
        ButterKnife.bind(this);
    }

    @Override
    protected void initTitle() {

    }

    @Override
    protected void initView(){

}

    @Override
    protected void initListener() {

    }


    //请求注册接口
    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_suggestion_btn://注册
                if (isSumbit()) {

                }

        }

    }

    public boolean isSumbit() {
        if (commonUtil.getString(actSuggestionEd).equals(" ")) {
            ToastUtils.show("请输入疑问或建议");
            return false;
        }

        return true;
    }


}
