package com.example.stanislavpeshkur.someactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WhoThiefChoose extends AppCompatActivity {

    public final static String THIEF = "com.example.stanislavpeshkur.someactivities.THIEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_thief_choose);
    }

    public void onRadioClick(View v) {
        Intent answerIntent = new Intent();

        switch (v.getId()) {
            case R.id.radioDog:
                answerIntent.putExtra(THIEF, "Shit dog");
                break;
            case R.id.radioBird:
                answerIntent.putExtra(THIEF, "Bird");
                break;
            case R.id.radioCat:
                answerIntent.putExtra(THIEF, "Cat");
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent);
        finish();

    }
}
