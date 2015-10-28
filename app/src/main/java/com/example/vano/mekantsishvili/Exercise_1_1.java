package com.example.vano.mekantsishvili;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.vano.geolabb.R;

public class Exercise_1_1 extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linLay;
    private static String COLOR_VALUE;
    int mColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_1_1);


        linLay = (LinearLayout) findViewById(R.id.sc_ch);

        findViewById(R.id.white).setOnClickListener(this);
        findViewById(R.id.blue).setOnClickListener(this);
        findViewById(R.id.red).setOnClickListener(this);
        findViewById(R.id.green).setOnClickListener(this);
        findViewById(R.id.yellow).setOnClickListener(this);

        if (savedInstanceState != null){
            mColor = savedInstanceState.getInt(COLOR_VALUE);
            linLay.setBackgroundColor(mColor);
        }

    }
    public void onClick(View v) {
        int color;
        switch (v.getId()) {
            case R.id.blue:
                //linLay.setBackgroundColor(0xff0000ff);
                mColor = Color.parseColor("#0000ff");
                linLay.setBackgroundColor(mColor);
               // color = 0xff0000ff;
                break;
            case R.id.green:
                mColor = Color.parseColor("#00ff00");
                linLay.setBackgroundColor(mColor);
             //   linLay.setBackgroundColor(0xff00ff00);
                break;
            case R.id.red:
                mColor = Color.parseColor("#ff0000");
                linLay.setBackgroundColor(mColor);
                break;
            case R.id.yellow:
                mColor = Color.parseColor("#ffff00");
                linLay.setBackgroundColor(mColor);
                break;
            case R.id.white:
                mColor = Color.parseColor("#ffffff");
                linLay.setBackgroundColor(mColor);
                break;
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // TODO Auto-generated method stub
        super.onSaveInstanceState(outState);
        outState.putInt(COLOR_VALUE, mColor);
    }
}



