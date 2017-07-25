package com.example.stanislavpeshkur.someactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataTransfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer);

    }

    public void onClickSend (View view) {
        EditText toEdittext = (EditText)findViewById(R.id.editTextTo);
        EditText descriptionEdittext = (EditText)findViewById(R.id.editTextDescription);
        EditText fromEdittext = (EditText)findViewById(R.id.editTextFrom);

        Intent intent = new Intent(DataTransfer.this,DataTransferReceive.class);
        intent.putExtra("to", toEdittext.getText().toString());
        intent.putExtra("description", descriptionEdittext.getText().toString());
        intent.putExtra("from",fromEdittext.getText().toString());
        startActivity(intent);
    }

}
