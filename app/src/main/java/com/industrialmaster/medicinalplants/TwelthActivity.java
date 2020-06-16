package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class TwelthActivity extends AppCompatActivity {

    String tx10 = "<p>Long recognized for its sweet perfume, lavender also boasts medical benefits as a nervine " +
            "and mild antidepressant. UMMC suggests adding it to your bath to alleviate stress, tension, and " +
            "insomnia. It's also used in creams to treat sunburns and acne.</p>"+

            "<p>Woody lavender plants prefer hot, sunny, and dry environments. The fresh flowers are tasty in small " +
            "doses when added to salads, honey, butter, lemonade, and even shortbread cookies. If you’re crafty, " +
            "try sewing up an herbal heating pad or eye pillow with the fragrant dried flowers.</p>";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelth);

        TextView textView = findViewById(R.id.tv10);
        textView.setText(Html.fromHtml(tx10));
    }

    public void next(View v){
        Intent intent = new Intent(this, ThirteenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, EleventhActivity.class);
        startActivity(intent);
    }
}
