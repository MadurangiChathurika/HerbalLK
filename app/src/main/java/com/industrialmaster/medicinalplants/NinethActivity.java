package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class NinethActivity extends AppCompatActivity {

    String tx7 = "<p>Costus igneus, commonly known as insulin plant in India, belongs to the family Costaceae. " +
            "Consumption of the leaves are believed to lower blood glucose levels, and diabetics who consumed " +
            "the leaves of this plant did report a fall in their blood glucose levels.</p>"+

            "<p>The fresh leaves of this plant is chewed two times daily for 1 week after 1 week, 1 leaf should " +
            "be chewed twice a day this dosage should be continued for 1 month. It is said that this treatment is " +
            "effective in bringing blood sugar levels under control in diabetes patients.</p>" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth);

        TextView textView = findViewById(R.id.tv7);
        textView.setText(Html.fromHtml(tx7));
    }

    public void next(View v){
        Intent intent = new Intent(this, TenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }
}
