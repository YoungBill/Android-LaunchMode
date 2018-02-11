package com.android.launchmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by chentao on 2018/2/6.
 * 最基础的Activity
 * 项目中，除非有特殊需求的Activity，否则建议统一继承此Activity
 */

public class BaseActivity extends AppCompatActivity {

    protected final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "-------onCreate------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "-------onStart------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "-------onResume------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "-------onStop------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "-------onRestart------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "-------onDestroy------");
    }

}

