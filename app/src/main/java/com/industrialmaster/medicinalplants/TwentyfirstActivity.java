package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class TwentyfirstActivity extends AppCompatActivity {

    String tx19 = "<p>Salvia, the Latin name for sage, means ‘to heal’.</p>"+

            "<p>Internally, the sage is used for :</p>" +
            "<p>* indigestion ,flatulence ,liver complaint ,excessive lactation ,excessive perspiration ," +
            "excessive salivation ,anxiety ,depression ,female sterility ,menopausal problems.</p>" +
            "<p>On the other hand, it is used externally for :</p>" +
            "<p>* insect bites ,skin infections ,throat infections ,mouth infections ,gum infections ,skin " +
            "infections ,vaginal discharge </p>" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyfirst);

        TextView textView = findViewById(R.id.tv19);
        textView.setText(Html.fromHtml(tx19));
    }

    public void next(View v){
        Intent intent = new Intent(this, TwentysecondActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, TwenthActivity.class);
        startActivity(intent);
    }
}
