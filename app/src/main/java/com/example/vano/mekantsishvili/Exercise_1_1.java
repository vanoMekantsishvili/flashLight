package com.example.vano.mekantsishvili;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.vano.geolabb.R;

public class Exercise_1_1 extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linLay;
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



    }

    public void onClick(View v) {
        int color;
        switch (v.getId()) {
            case R.id.blue:
                linLay.setBackgroundColor(0xff0000ff);
                color = 0xff0000ff;
                break;
            case R.id.green:
                linLay.setBackgroundColor(0xff00ff00);
                break;
            case R.id.red:
                linLay.setBackgroundColor(0xffff0000);
                break;
            case R.id.yellow:
                linLay.setBackgroundColor(0xffffff00);
                break;
            case R.id.white:
                linLay.setBackgroundColor(0xffffffff);
                break;
        }
    }
}
