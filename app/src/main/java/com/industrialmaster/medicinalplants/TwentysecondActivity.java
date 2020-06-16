package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class TwentysecondActivity extends AppCompatActivity {

    String tx20 = "<p>The siberian ginseng has a wide range of health benefits, mostly as a powerful tonic herb " +
            "that maintains good health. Its medicinal properties are used for :</p>"+

            "<p>* menopausal problems, geriatric debility, physical and mental stress</p>" +
            "<p>* treat bone marrow suppression caused by chemotherapy or radiation</p>" +
            "<p>* hypercholesterolemia and neurasthenia with headache</p>" +
            "<p>* insomnia, poor appetite, increasing endurance, memory improvement</p>" +
            "<p>* anti-inflammatory purposes</p>" +
            "<p>* immunogenic ,chemoprotective purposes</p>" +
            "<p>* radiological protection</p>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentysecond);

        TextView textView = findViewById(R.id.tv20);
        textView.setText(Html.fromHtml(tx20));
    }

    public void next(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, TwentyfirstActivity.class);
        startActivity(intent);
    }
}
