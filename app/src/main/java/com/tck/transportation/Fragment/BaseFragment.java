package com.tck.transportation.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zhao on 2017/4/21.
 */

public  abstract class BaseFragment  extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        initDataAll();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void initDataAll()
    {
        initData();
        initListener();
        loadData();
    }
    protected abstract void initData();
    public abstract void loadData() ;
    public abstract void initListener() ;
}
