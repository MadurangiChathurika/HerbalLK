package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class NineteenthActivity extends AppCompatActivity {

    String tx17 = "<p>There are four types of tulsi mentioned in ayurvedic texts ie Rama, Krishna, Vana & Kapoor Tulsi.\n" +
            "\n" +
            "For over the centuries Tulsi (the queen of herbs) has been known for its remarkable healing properties.</p>"+

            "<p>* Tulsi is taken as the herbal tea and helps in curing malaria.</p>" +
            "<p>* The oil extracted from the Karpoora Tulsi is mostly used in the herbal toiletry. Its oil is also used against the insects and bacteria.</p>" +
            "<p>* The Rama Tulsi is the effective remedy for the Severe acute Respiratory Syndrome. Juice of its leaves gives relief in cold, fever, bronchitis and cough.</p>" +
            "<p>* It is very effective against indigestion, headache, hysteria, insomnia and cholera.</p>" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineteenth);

        TextView textView = findViewById(R.id.tv17);
        textView.setText(Html.fromHtml(tx17));
    }

    public void next(View v){
        Intent intent = new Intent(this, TwenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, EighteenthActivity.class);
        startActivity(intent);
    }
}
