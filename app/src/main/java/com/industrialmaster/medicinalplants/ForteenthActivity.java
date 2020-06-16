package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class ForteenthActivity extends AppCompatActivity {

    String tx12 = "<p>Lemongrass has been reported to have innumerable therapeutic and other health benefits.</p>"+

            "<p>* alleviate certain respiratory conditions including laryngitis and sore throats</p>" +
            "<p>* anti-pyretic property which reduces high fevers.</p>" +
            "<p>* lemongrass inhibits bacteria and yeast growth.</p>" +
            "<p>* beneficial for nervous and stress-related conditions.</p>" +
            "<p>* useful for all types of pain including abdominal pain, headaches, joint pains, muscle pains, " +
            "digestive tract spasms, muscle cramps, stomachache and others.</p>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forteenth);

        TextView textView = findViewById(R.id.tv12);
        textView.setText(Html.fromHtml(tx12));
    }

    public void next(View v){
        Intent intent = new Intent(this, FifteenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, ThirteenthActivity.class);
        startActivity(intent);
    }
}
