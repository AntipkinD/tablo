package com.example.tablo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer counterA = 0;
    Integer counterB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnA(View view) {
        counterA++;
        TextView counterAView = findViewById(R.id.txt);
        counterAView.setText(counterA.toString());
    }
    public void onClickBtnB(View view){
        counterB++;
        TextView counterBView = findViewById(R.id.txt2);
        counterBView.setText(counterB.toString());
    }
    public void onClickBtnC(View view){
        counterA = 0;
        counterB = 0;
        TextView counterAView = findViewById(R.id.txt);
        TextView counterBView = findViewById(R.id.txt2);
        counterAView.setText(counterA.toString());
        counterBView.setText(counterB.toString());
    }
    
}