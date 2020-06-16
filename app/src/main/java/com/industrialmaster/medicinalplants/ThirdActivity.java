package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

        String tx1 = "<p>The aloe vera grows only under the sun with well drained dry or moist soil." +
                " Although the plant tastes like turd, it’s still edible. The sap from aloe vera is " +
                "extremely useful to speed up the healing & reducing the risk of infections for :</p>"+

                "<p>* wounds</p>" +
                "<p>* ulcerative colitis (drinking aloe vera juice)</p>" +
                "<p>* chronic constipation</p>" +
                "<p>* poor appetite</p>" +
                "<p>* digestive problems</p>" +
                "<p>* cuts</p>" +
                "<p>* burns</p>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView textView = findViewById(R.id.tv1);
        textView.setText(Html.fromHtml(tx1));
    }

    public void next(View v){
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
