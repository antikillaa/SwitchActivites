package com.example.stanislavpeshkur.someactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WhoThief extends AppCompatActivity {

    static final private int CHOOSE_THIEF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_thief);
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView textViewResults = (TextView)findViewById(R.id.textViewResult);

        if (requestCode == CHOOSE_THIEF) {
            if (requestCode == RESULT_OK) {
                String thiefname = data.getStringExtra(WhoThiefChoose.THIEF);
                textViewResults.setText(thiefname);
            }else {
                textViewResults.setText("Not answer");
            }
        }
    }

    public void onClickWhoChief (View v) {
        Intent questionIntent = new Intent(WhoThief.this,WhoThiefChoose.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);
    }
}
