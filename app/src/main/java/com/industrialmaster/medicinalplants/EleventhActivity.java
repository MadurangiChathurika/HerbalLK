package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class EleventhActivity extends AppCompatActivity {

    String tx9 = "<p>One of the world’s most important medicinal herbs, the echinacea has the capacity to raise " +
            "the body’s resistance to bacterial and viral infections by stimulating the immune system. It also " +
            "has antibiotic properties that helps relieve allergies. Basically, the roots are beneficial in the " +
            "treatment of sores, wounds and burns.</p>"+

            "<p>It was once used by the Native Americans as an application for insect bites, stings and snakebites. " +
            "The echinacea grows on any well drained soil, as long as it gets sunlight.</p>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);

        TextView textView = findViewById(R.id.tv9);
        textView.setText(Html.fromHtml(tx9));
    }

    public void next(View v){
        Intent intent = new Intent(this, TwelthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, TenthActivity.class);
        startActivity(intent);
    }
}
