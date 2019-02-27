package com.jianglei.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jianglei.bottomlibrary.IModuleName;
import com.jianglei.serviceprovider.JlServiceProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<IModuleName> moduleNames = JlServiceProvider.getServices("module_name");
        StringBuilder sb  = new StringBuilder("目前注册的模块有：\n");
        for(IModuleName moduleName : moduleNames){
            sb.append(moduleName.getModuleName()).append("\n");
        }
        TextView tvContent = findViewById(R.id.tvContent);
        tvContent.setText(sb.toString());
    }
}
