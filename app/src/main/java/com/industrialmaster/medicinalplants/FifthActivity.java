package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    String tx3 = "<p>The gotu kola acts on various phases of connective tissue development and stimulates healing of :</p>"+
            "<p>* ulcers & skin injuries</p>" +
            "<p>* decreasing capillary fragility</p>" +
            "<p>* stimulation of the lipids and protein necessary for healthy skin</p>" +
            "<p>* Leaves are thought to maintain youthfulness.</p>" +
            "<p>* Crushed leaves are poulticed to treat open sores.</p>" +
            "<p>* The gotu kola can also be used to treat leprosy and revitalize the brain and nervous system.</p>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        TextView textView = findViewById(R.id.tv3);
        textView.setText(Html.fromHtml(tx3));
    }

    public void next(View v){
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}
