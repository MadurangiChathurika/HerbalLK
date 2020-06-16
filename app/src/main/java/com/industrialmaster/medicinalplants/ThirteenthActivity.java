package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class ThirteenthActivity extends AppCompatActivity {

    String tx11 = "<p>The reason the plant is called lemon balm is because of the lemon minty scent of the leaves. " +
            "The flowers, which appear during the summer, are full of nectar. The crushed leaves, when rubbed on " +
            "the skin, are used as :</p>"+

            "<p>* mosquito repellent</p>" +
            "<p>* herpes ,herpes ,gout ,insect bites</p>" +
            "<p>Infusion of the leaves with water are known to treat :</p>" +
            "<p>* indigestion due to nervous tension</p>" +
            "<p>* digestive upsets in children</p>" +
            "<p>* colds ,fevers ,depression ,mild insomnia ,headaches</p>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth);

        TextView textView = findViewById(R.id.tv11);
        textView.setText(Html.fromHtml(tx11));
    }

    public void next(View v){
        Intent intent = new Intent(this, ForteenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, TwelthActivity.class);
        startActivity(intent);
    }
}
