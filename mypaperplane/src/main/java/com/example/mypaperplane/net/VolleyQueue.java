package com.example.mypaperplane.net;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.mypaperplane.global.AppData;

/**
 * @author pikachu
 * @time 2017/2/17 11:37
 * @desc 创建消息队列
 */

public class VolleyQueue {

    private        RequestQueue mRequestQueue;
    private static VolleyQueue  mVolleyQueue;

    private VolleyQueue() {
        mRequestQueue = Volley.newRequestQueue(AppData.mContext);
    }


    public static VolleyQueue getVolleyQueueInstance() {
        if (mVolleyQueue == null) {
            synchronized (VolleyQueue.class) {
                if (mVolleyQueue == null) {
                    mVolleyQueue = new VolleyQueue();
                }
            }
        }
        return mVolleyQueue;
    }


    public RequestQueue getRequestQueue() {
        return this.mRequestQueue;
    }

    /**
     * 添加一个请求没有tag的
     *
     * @param request 一个请求
     * @param <T>     泛型
     */
    public <T> void addRequest(Request<T> request) {
        getRequestQueue().add(request);
    }

    /**
     * @param request 添加一个有Tag 的请求
     * @param tag     Tag
     * @param <T>
     */
    public <T> void addRequestWithTag(Request<T> request, Object tag) {
        if (tag == null) {
            getRequestQueue().add(request);
        } else {
            getRequestQueue().add(request.setTag(tag));
        }

    }

    /**
     * 取消带有此tag的Request
     *
     * @param object Tag
     */
    public void cancelRequest(Object object) {
        getRequestQueue().cancelAll(object);
    }


}
