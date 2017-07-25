package com.example.stanislavpeshkur.someactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataTransferReceive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer_receive);

        String to;
        String description;
        String from;

        to = getIntent().getStringExtra("to");
        description = getIntent().getStringExtra("description");
        from = getIntent().getStringExtra("from");

        TextView textViewRecieved = (TextView)findViewById(R.id.textViewRecieved);
        textViewRecieved.setText(to + " , you recieved " + description + " from " + from);
    }
}
