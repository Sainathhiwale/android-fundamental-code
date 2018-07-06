package com.bizanalyst.sharedpreferenceloginsignup;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void signup(View view) {

        EditText editText = findViewById(R.id.et_rename);
        EditText editText2 = findViewById(R.id.et_readdress);
        EditText editText3 = findViewById(R.id.et_reemail);
        EditText editText4 = findViewById(R.id.et_repassword);

        SharedPreferences spf = getSharedPreferences("myspf", Context.MODE_PRIVATE);

        SharedPreferences.Editor esp = spf.edit();

        esp.putString("name",editText.getText().toString());
        esp.putString("address",editText2.getText().toString());
        esp.putString("email",editText3.getText().toString());
        esp.putString("password",editText4.getText().toString());

        esp.commit();
        //esp.apply();
        finish();
    }
}
