package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class EighteenthActivity extends AppCompatActivity {

    String tx16 = "<p>Commonly known as the five-leaved chaste tree, is a large aromatic shrub with quadrangular, densely whitish, tomentose branchlets.\n" +
            "\n" +
            "Key therapeutic benefits:</p>"+

            "<p>* Because of its anti-inflammatory, antibacterial and antifungal properties, the plant is useful in treating sores and skin infections.</p>" +
            "<p>* Five-Leaved Chaste Tree relieves muscle aches and joint pains.</p>" +
            "<p>* The herb is effective in treating vaginal discharge.</p>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteenth);

        TextView textView = findViewById(R.id.tv16);
        textView.setText(Html.fromHtml(tx16));
    }

    public void next(View v){
        Intent intent = new Intent(this, NineteenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, SeventeenthActivity.class);
        startActivity(intent);
    }
}
