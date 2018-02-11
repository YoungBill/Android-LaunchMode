package com.android.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "-------onNewIntent------");
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), "com.android.launchmode.Test1Activity");
        startActivity(intent);
    }
}
