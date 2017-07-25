package com.example.stanislavpeshkur.someactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAbout(View view) {
        Intent intent = new Intent(MainActivity.this, AboutPage.class);
        startActivity(intent);
    }

    public void onClickDataTransfer(View view) {
        Intent intent = new Intent(MainActivity.this, DataTransfer.class);
        startActivity(intent);
    }

    public void onClickSherlockButton(View view) {
        Intent intent = new Intent(MainActivity.this, WhoThief.class);
        startActivity(intent);
    }

}
