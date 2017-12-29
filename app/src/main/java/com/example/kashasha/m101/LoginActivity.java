package com.example.kashasha.m101;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText email_ed;
    EditText password_ed;
    Button login_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);
        login_bt= (Button) findViewById(R.id.BT_login);
         email_ed= (EditText) findViewById(R.id.ED_email);
         password_ed= (EditText) findViewById(R.id.ED_password);
         login_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();

                    }
                //}

        });
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            */
    }
}
