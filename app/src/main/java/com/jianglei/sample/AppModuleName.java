package com.jianglei.sample;

import com.jianglei.bottomlibrary.IModuleName;

/**
 * @author longyi created on 19-2-27
 */
public class AppModuleName implements IModuleName {
    @Override
    public String getModuleName() {
        return "app";
    }
}
