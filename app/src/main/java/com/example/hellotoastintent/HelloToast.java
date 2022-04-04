package com.example.hellotoastintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelloToast extends AppCompatActivity {

    private TextView mCounterValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);

        mCounterValue = findViewById(R.id.counterValue);

        Bundle bundle = getIntent().getExtras();

        if(bundle==null)
        {
            mCounterValue.setText("0");
        }
        else
        {
            String valueExtract;

            valueExtract = bundle.getString("CounterValue");
            mCounterValue.setText(valueExtract);
        }
    }
}