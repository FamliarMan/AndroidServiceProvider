package com.jianglei.businesstwo;

import android.util.Log;

import com.jianglei.bottomlibrary.IApplication;

/**
 * @author longyi created on 19-2-26
 */
public class TwoApplication implements IApplication {
    @Override
    public void onCreate() {
        Log.d("jianglei","TwoApplication onCreate()");
    }
}
