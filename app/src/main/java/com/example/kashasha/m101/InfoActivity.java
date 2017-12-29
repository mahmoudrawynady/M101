package com.example.kashasha.m101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView textView1= (TextView) findViewById(R.id.disName);
        TextView textView= (TextView) findViewById(R.id.disDes);
        textView1.setText(getIntent().getStringExtra("name"));
        textView.setText(getIntent().getStringExtra("info"));
        setTitle(getIntent().getStringExtra("title"));
    }
}
