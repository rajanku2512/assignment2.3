package com.example.rajan.startingagain;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("main Activity", "onCreate: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("main Activity", "on save instance state ");
    }

    public void show(View v){
        int id=v.getId();
        switch (id){
            case R.id.btn2:
                Toast.makeText(this,"welcome new user",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,ThirdActivity.class);
                startActivity(intent);
//Explicit intent
                break;
            case R.id.btn1:
                Toast.makeText(this,"welcome back",Toast.LENGTH_SHORT).show();
                Intent intent1 =new Intent(this,SecondActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn3:
                Intent intent2=new Intent( Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent2);

                Toast.makeText(this,"Starting browser",Toast.LENGTH_SHORT).show();

        }}/*
        implicit intent
        public void show (change to some other name) (View v)
        Intent intent2=new Intent( Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent2);
                Toast.makeText(this,"Starting browser",Toast.LENGTH_SHORT).show();
        */

    }




