package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class TenthActivity extends AppCompatActivity {

    String tx8 = "<p>It requires moist soil and can grow shadeless. The great burdock is the pretty famous in " +
            "the area of detoxification in both Chinese and Western herbal medicine. The root is is used to treat ‘" +
            "toxic overload’ that result in throat infections and skin diseases like :</p>"+

            "<p>* boils, rashes, burns, bruises</p>" +
            "<p>* herpes, eczema, acne</p>" +
            "<p>* impetigo, ringworm, bites</p>" +
            "<p>* The leaves and seeds can be crushed to poultice it to bruises, burns, ulcers and sores</p>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);

        TextView textView = findViewById(R.id.tv8);
        textView.setText(Html.fromHtml(tx8));
    }

    public void next(View v){
        Intent intent = new Intent(this, EleventhActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, NinethActivity.class);
        startActivity(intent);
    }
}
