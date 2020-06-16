package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void prev(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void pt11(View v){
        Intent intent = new Intent(this, ThirteenthActivity.class);
        startActivity(intent);
    }

    public void pt12(View v){
        Intent intent = new Intent(this, ForteenthActivity.class);
        startActivity(intent);
    }

    public void pt13(View v){
        Intent intent = new Intent(this, FifteenthActivity.class);
        startActivity(intent);
    }

    public void pt14(View v){
        Intent intent = new Intent(this, SixteenthActivity.class);
        startActivity(intent);
    }

    public void pt15(View v){
        Intent intent = new Intent(this, SeventeenthActivity.class);
        startActivity(intent);
    }

    public void pt16(View v){
        Intent intent = new Intent(this, EighteenthActivity.class);
        startActivity(intent);
    }

    public void pt17(View v){
        Intent intent = new Intent(this, NineteenthActivity.class);
        startActivity(intent);
    }

    public void pt18(View v){
        Intent intent = new Intent(this, TwenthActivity.class);
        startActivity(intent);
    }

    public void pt19(View v){
        Intent intent = new Intent(this, TwentyfirstActivity.class);
        startActivity(intent);
    }

    public void pt20(View v){
        Intent intent = new Intent(this, TwentysecondActivity.class);
        startActivity(intent);
    }
}
