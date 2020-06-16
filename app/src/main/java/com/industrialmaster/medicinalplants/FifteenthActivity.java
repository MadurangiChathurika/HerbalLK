package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class FifteenthActivity extends AppCompatActivity {

    String tx13 = "<p>The plant of which marshmallows were once made of. The root is taken internally to treat :</p>"+

            "<p>* inflammations and irritations of the urinary and respiratory mucus membranes</p>" +
            "<p>* counter excess stomach acid</p>" +
            "<p>* peptic ulceration ,gastritis</p>" +
            "<p>Externally, the root is applied to :</p>" +
            "<p>* bruises, sprains</p>" +
            "<p>* aching muscles</p>" +
            "<p>* insect bites</p>"+
            "<p>* skin inflammations, splinters</p>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteenth);

        TextView textView = findViewById(R.id.tv13);
        textView.setText(Html.fromHtml(tx13));
    }

    public void next(View v){
        Intent intent = new Intent(this, SixteenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, ForteenthActivity.class);
        startActivity(intent);
    }
}
