package com.android.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Test1Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
    }

    public void onClick(View view) {
        startActivity(new Intent(Test1Activity.this, Test2Activity.class));
    }
}
