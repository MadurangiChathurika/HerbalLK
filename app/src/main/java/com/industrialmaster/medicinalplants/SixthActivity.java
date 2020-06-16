package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class SixthActivity extends AppCompatActivity {

    String tx4 = "<p>A bitter tasting plant that requires a lot of sun, the cardoon has become important " +
            "as a medicinal herb in recent years following the discovery of cynarin. The cardoon leaves, " +
            "best harvested before flowering, helps to :</p>"+

            "<p>* improve liver and gall bladder function</p>" +
            "<p>* stimulate the secretion of digestive juices</p>" +
            "<p>* lower blood cholesterol levels</p>" +
            "<p>* treat chronic liver and gall bladder diseases</p>" +
            "<p>* early stages of late-onset diabetes</p>" +
            "<p>* jaundice & hepatitis</p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        TextView textView = findViewById(R.id.tv4);
        textView.setText(Html.fromHtml(tx4));
    }

    public void next(View v){
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }
}
