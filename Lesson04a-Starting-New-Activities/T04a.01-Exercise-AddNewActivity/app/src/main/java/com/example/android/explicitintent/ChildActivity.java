package com.example.android.explicitintent;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Petya Marinova on 28-Dec-17.
 */

public class ChildActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        mTextView=(TextView) findViewById(R.id.tv_display);
    }
}
