package com.bizanalyst.sharedpreferenceloginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DashbroadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbroad);

        Intent intent = getIntent();
        TextView textView = findViewById(R.id.tv_name);
        TextView textView2 = findViewById(R.id.tv_name);
    }
}
