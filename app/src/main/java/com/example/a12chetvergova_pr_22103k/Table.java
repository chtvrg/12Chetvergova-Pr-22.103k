package com.example.a12chetvergova_pr_22103k;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Table  extends AppCompatActivity implements View.OnClickListener{
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        btn = findViewById(R.id.btnBorsch);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, ShowItem.class));
    }
}