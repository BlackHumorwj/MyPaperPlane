package com.example.mypaperplane.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * @author pikachu
 * @time 2017/2/16 15:45
 * @desc 普通Fragment的基类
 */

public abstract class BaseFragment extends Fragment {
    public View contentView;

    private int mContentId;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         contentView = View.inflate(getContext(), getContentId(), null);
        ButterKnife.bind(this, contentView);
        init();
        return contentView;
    }

    /**
     * 初始化一些数据
     */
    public void init() {

    }

    /**
     * 获取布局资源ID
     *
     * @return 资源ID
     */
    public abstract int getContentId();
}
