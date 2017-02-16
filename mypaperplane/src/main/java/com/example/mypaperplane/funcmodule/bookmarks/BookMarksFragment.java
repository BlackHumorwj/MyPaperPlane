package com.example.mypaperplane.funcmodule.bookmarks;

import android.os.Bundle;

import com.example.mypaperplane.R;
import com.example.mypaperplane.base.BaseFragment;

/**
 * @author pikachu
 * @time 2017/2/16 15:58
 * @desc
 */

public class BookMarksFragment extends BaseFragment {


    public static BookMarksFragment newInstance() {
        Bundle args = new Bundle();
        BookMarksFragment fragment = new BookMarksFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void init() {



    }

    @Override
    public int getContentId() {
        return R.layout.fragment_book_marks;
    }
}
