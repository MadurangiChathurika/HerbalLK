package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class SixteenthActivity extends AppCompatActivity {

    String tx14 = "<p>Fenugreek seeds are nourishing and taken to :</p>"+

            "<p>* encourage weight gain (take note, anorexics)</p>" +
            "<p>* inhibit cancer of the liver</p>" +
            "<p>* lower blood cholesterol levels</p>" +
            "<p>* treat inflammation and ulcers of the stomach and intestines.</p>" +
            "<p>* drain off sweat ducts</p>" +
            "<p>* for body building ,poor digestion</p>" +
            "<p>* for late onset diabetes</p>"+
            "<p>* insufficient lactation</p>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteenth);

        TextView textView = findViewById(R.id.tv14);
        textView.setText(Html.fromHtml(tx14));
    }

    public void next(View v){
        Intent intent = new Intent(this, SeventeenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, FifteenthActivity.class);
        startActivity(intent);
    }
}
