package com.android.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Test2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
    }

    public void onClick(View view) {
        startActivity(new Intent(Test2Activity.this, MainActivity.class));
    }
}
