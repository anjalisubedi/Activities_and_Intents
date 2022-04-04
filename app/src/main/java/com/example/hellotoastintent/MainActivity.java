package com.example.hellotoastintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mSayHello, mCount;
    private TextView mTextView;
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSayHello = findViewById(R.id.sayHello);
        mCount = findViewById(R.id.count);
        mTextView = findViewById(R.id.textView);

        counter =0;

        mSayHello.setOnClickListener(this);
        mCount.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.sayHello:
                Intent intent = new Intent(MainActivity.this, HelloToast.class);
                intent.putExtra("CounterValue", ""+counter);
                startActivity(intent);
                break;

            case R.id.count:
                counter++;
                mTextView.setText(""+counter);
                break;
        }
    }
}