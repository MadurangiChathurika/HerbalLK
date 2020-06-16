package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    String tx2 = "<p>It grows in almost any type of soil condition. It has no problem with nutritionally " +
            "poor, very acidic or very alkaline soils, just as long as it’s moist. Well known as a remedy " +
            "for skin problems, the deep-orange flowered pot marigold variety is applied externally to :</p>"+

            "<p>* bites</p>" +
            "<p>* varicose veins</p>" +
            "<p>* sprains & stings</p>" +
            "<p>* wounds & sore eyes</p>" +
            "<p>* The tea of the petals tones up circulation and, taken regularly, eases varicose veins.</p>" +
            "<p>* Internally it is used to treat fevers and chronic infections.</p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        TextView textView = findViewById(R.id.tv2);
        textView.setText(Html.fromHtml(tx2));
    }

    public void next(View v){
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
