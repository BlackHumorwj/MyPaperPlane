package com.example.mypaperplane.net;

import com.android.volley.VolleyError;

/**
 * @author pikachu
 * @time 2017/2/16 17:29
 * @desc 请求返回的接口
 */

public interface ResponseListener {

    /**
     * 请求成功的回调
     * @param response 返回的数据
     */
    void success(String response);

    /**
     * 请求错误的回调
     * @param volleyError 错误信息
     */
    void error(VolleyError volleyError);
}
