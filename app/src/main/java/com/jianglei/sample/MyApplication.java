package com.jianglei.sample;

import android.app.Application;

import com.jianglei.bottomlibrary.IApplication;
import com.jianglei.bottomlibrary.IModuleName;
import com.jianglei.serviceprovider.JlServiceProvider;

import java.util.List;

/**
 * @author longyi created on 19-2-26
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JlServiceProvider.register(this,"application",IApplication.class);
        JlServiceProvider.register(this,"module_name", IModuleName.class);
        List<IApplication> applications = JlServiceProvider.getServices("application");
        for(IApplication application : applications){
            application.onCreate();
        }
    }
}
