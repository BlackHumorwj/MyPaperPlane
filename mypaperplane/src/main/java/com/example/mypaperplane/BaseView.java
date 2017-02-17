package com.example.mypaperplane;

import android.view.View;

/**
 * @author pikachu
 * @time 2017/2/16 14:35
 * @desc
 */

public interface BaseView<T> {

    //为View 设置Presenter的引用
    void setPresenter(T presenter);

    //初始化控件
    void initViews(View view);
}
