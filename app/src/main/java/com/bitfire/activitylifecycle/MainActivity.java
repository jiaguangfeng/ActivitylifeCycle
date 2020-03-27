package com.bitfire.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("oncreate", "activity 创建时调用");
        //一般用于初始化操作  初始化布局 初始化 使用组件信息等

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart", "activity 创建或者后台回到前台  位于create 后");
        //  activity 正在启动
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart", "activity 从后台重新回到前台时被调用  ");
        //activity 重新启动
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "activity 创建或者从被覆盖、后台重新回到前台时被调用    ");
        //前台可见 可交互
        //重新回到前台后 刷新数据等操作
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "activity 被覆盖到下面或者锁屏时被调用      ");
        //activity 停止状态  一般后面执行 stop状态
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop", "activity 退出当前Activity或者跳转到新Activity时被调用        ");
        //在pause后执行
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "activity 退出当前Activity时被调用,调用之后Activity就结束了  ");
        //activity 正在销毁
        //一般在此方法中进行资源释放等操作
    }
}
