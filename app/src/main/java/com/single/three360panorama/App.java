package com.single.three360panorama;

import android.app.Application;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;

/**
 * app
 *
 * Created by li on 2017/9/7.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        //搜集本地tbs内核信息并上报服务器，服务器返回结果决定使用哪个内核。
        /**
         * Three.js是JavaScript编写的WebGL第三方库。提供了非常多的3D显示功能。
         Android下相信很多人都多少做过前端开发，现在很多应用程序都是基于前端H5/RN/小程序等来玩的。
         当然我们全景图也可以放到前端来实现，套个WebView利用JavaScript与Android交互来实现一部分功能
         */
        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {

            @Override
            public void onViewInitFinished(boolean arg0) {
                // TODO Auto-generated method stub
                //x5內核初始化完成的回调，为true表示x5内核加载成功，否则表示x5内核加载失败，会自动切换到系统内核。
                Log.d("app", " onViewInitFinished is " + arg0);
            }

            @Override
            public void onCoreInitFinished() {
                // TODO Auto-generated method stub
            }
        };
        //x5内核初始化接口
        QbSdk.initX5Environment(getApplicationContext(),  cb);

    }
}
