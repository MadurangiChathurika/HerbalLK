package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class SeventhActivity extends AppCompatActivity {

    String tx5 = "<p>Ashwagandha is best known for stress Reduction, Neural Protection, and a Lot More from an Ancient Herb.\n" +
            "\n" +
            "The benefits of ashwagandha are many; in addition to promoting fertility, aiding in wound care, and boosting the immune system, some other benefits are:</p>"+

            "<p>* Diuretic, Sleep aid</p>" +
            "<p>* Galactogogue and Anti-epileptic</p>" +
            "<p>* Anti-tumor, Pain relief</p>" +
            "<p>* Eye health & Heart tonic</p>" +
            "<p>* Lowers cholesterol & Regulates blood sugar</p>" +
            "<p>* Reduces depression and Combats stress</p>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        TextView textView = findViewById(R.id.tv5);
        textView.setText(Html.fromHtml(tx5));
    }

    public void next(View v){
        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }
}
