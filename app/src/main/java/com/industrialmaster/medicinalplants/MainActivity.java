package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void pt1(View v){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void pt2(View v){
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void pt3(View v){
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void pt4(View v){
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }

    public void pt5(View v){
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }

    public void pt6(View v){
        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }

    public void pt7(View v){
        Intent intent = new Intent(this, NinethActivity.class);
        startActivity(intent);
    }

    public void pt8(View v){
        Intent intent = new Intent(this, TenthActivity.class);
        startActivity(intent);
    }

    public void pt9(View v){
        Intent intent = new Intent(this, EleventhActivity.class);
        startActivity(intent);
    }

    public void pt10(View v){
        Intent intent = new Intent(this, TwelthActivity.class);
        startActivity(intent);
    }
}
