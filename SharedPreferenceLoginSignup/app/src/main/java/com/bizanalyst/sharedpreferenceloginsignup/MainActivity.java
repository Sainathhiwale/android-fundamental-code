package com.bizanalyst.sharedpreferenceloginsignup;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void userLogin(View view) {
        EditText et_user = findViewById(R.id.et_email);
        EditText et_password =findViewById(R.id.et_password);

        SharedPreferences spf = getSharedPreferences("myspf", Context.MODE_PRIVATE);

       String email= spf.getString("email","no data");
       String password= spf.getString("password","not data");



       if (et_user.getText().toString().equalsIgnoreCase(email)&& et_password.getText().toString().equalsIgnoreCase(password)) {
           Intent loginIntent = new Intent(getApplicationContext(), DashbroadActivity.class);
           startActivity(loginIntent);
       }

       Intent intent = new Intent();
       intent.putExtra("name",)
     //startActivity(new Intent(MainActivity.this,DashbroadActivity.class));
    }

    public void userRegister(View view) {

        Intent regIntent = new Intent();
        regIntent.setComponent(new ComponentName(getApplicationContext(),RegisterActivity.class));
        startActivity(regIntent);
    }
}
