package com.example.mypaperplane.funcmodule.bookmarks;

import com.example.mypaperplane.BasePresenter;
import com.example.mypaperplane.BaseView;

/**
 * @author pikachu
 * @time 2017/2/16 16:15
 * @desc 书签收藏
 */

public class BookMarksContract {

    //视图相关的接口方法
    interface View extends BaseView<Presenter>{

    }

    //业务处理相关的方法
    interface Presenter extends BasePresenter{

    }

}
