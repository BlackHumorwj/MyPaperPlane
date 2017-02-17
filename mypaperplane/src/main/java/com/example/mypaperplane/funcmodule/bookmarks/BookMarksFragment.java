package com.example.mypaperplane.funcmodule.bookmarks;

import android.os.Bundle;
import android.view.View;

import com.example.mypaperplane.R;
import com.example.mypaperplane.base.BaseFragment;

/**
 * @author pikachu
 * @time 2017/2/16 15:58
 * @desc
 */

public class BookMarksFragment extends BaseFragment implements BookMarksContract.View {

    BookMarksContract.Presenter presenter;

    public static BookMarksFragment newInstance() {
        Bundle args = new Bundle();
        BookMarksFragment fragment = new BookMarksFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void init() {
        initViews(contentView);

    }

    @Override
    public int getContentId() {
        return R.layout.fragment_book_marks;
    }

    @Override
    public void setPresenter(BookMarksContract.Presenter presenter) {
        if (presenter != null) {
            this.presenter = presenter;
        }
    }

    @Override
    public void initViews(View view) {

    }
}
