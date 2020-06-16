package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class EighthActivity extends AppCompatActivity {

    String tx6 = "<p>Bryophyllum calycinum, Bryophyllum pinnatum, also known as the Air Plant, Life Plant, " +
            "Miracle Leaf, Goethe Plant and the Katakataka (Filipino)) is a succulent plant native to Madagascar.</p>"+

            "<p>* The leaf or its juice is taken for diabetes.</p>" +
            "<p>* Leaf paste application stops bleeding and heals wounds.</p>" +
            "<p>* The burnt leaf (mashi) made in to paste with coconut oil cures burn.</p>" +
            "<p>* Leaf paste boiled in oil cures sciatica and rhematic pains.</p>" +
            "<p>* One leaf eaten raw with one pepper corn first thing every morning for 3 to 7 days cures urinary stones.</p>" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        TextView textView = findViewById(R.id.tv6);
        textView.setText(Html.fromHtml(tx6));
    }

    public void next(View v){
        Intent intent = new Intent(this, NinethActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }
}
