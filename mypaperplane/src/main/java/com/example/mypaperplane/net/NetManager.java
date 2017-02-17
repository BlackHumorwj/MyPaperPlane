package com.example.mypaperplane.net;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.mypaperplane.utils.JsonUtil;

import java.util.Map;

/**
 * @author pikachu
 * @time 2017/2/17 14:01
 * @desc
 */

public class NetManager {

    private Object tag;

    private NetManager() {
        this.tag = null;
    }

    private NetManager(Object tag) {
        this.tag = tag;
    }

    public static NetManager getInstance() {
        return new NetManager();
    }

    public static NetManager getInstance(Object tag) {
        return new NetManager(tag);
    }


    public <T> void requestGet(String url, final Class<T> tClass, final ResponseListener<T> responseListener) {
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {

            @Override
            public void onResponse(String s) {
                responseListener.success(JsonUtil.fromJson(s,tClass));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                responseListener.error(volleyError);
            }
        });

        //设置请求超时时间
        request.setRetryPolicy(new DefaultRetryPolicy());
        VolleyQueue.getVolleyQueueInstance().addRequestWithTag(request, tag);
    }


    public <T> void requestPost(String url, final Map<String ,String> params, final Class<T> tClass, final ResponseListener<T> responseListener) {
        StringRequest request = new StringRequest(Request.Method.POST,url, new Response.Listener<String>() {

            @Override
            public void onResponse(String s) {
                responseListener.success(JsonUtil.fromJson(s,tClass));
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                responseListener.error(volleyError);
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                //添加PUT请求参数
                return params;
            }
        };

        //设置请求超时时间
        request.setRetryPolicy(new DefaultRetryPolicy());
        VolleyQueue.getVolleyQueueInstance().addRequestWithTag(request, tag);
    }



}
