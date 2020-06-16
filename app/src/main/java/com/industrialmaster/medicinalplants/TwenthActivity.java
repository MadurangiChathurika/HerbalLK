package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class TwenthActivity extends AppCompatActivity {

    String tx18 = "<p>Rosemary is the great reviver. This perennial woody herb stimulates energy and optimism and " +
            "sharpens memory and concentration by bringing more oxygen to your brain, according to UMMC. It’s a " +
            "wonderfully stimulating alternative to caffeine when you need that second wind!</p>"+

            "<p>A row of these long-lived and drought-tolerant plants makes a beautiful, bee-friendly, evergreen " +
            "hedge. You may only need one plant in your garden, as a little bit goes a long way.</p>" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenth);

        TextView textView = findViewById(R.id.tv18);
        textView.setText(Html.fromHtml(tx18));
    }

    public void next(View v){
        Intent intent = new Intent(this, TwentyfirstActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, NineteenthActivity.class);
        startActivity(intent);
    }
}
