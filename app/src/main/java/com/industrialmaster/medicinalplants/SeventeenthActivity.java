package com.industrialmaster.medicinalplants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class SeventeenthActivity extends AppCompatActivity {

    String tx15 = "<p>Peppermint is sometimes regarded as ‘the world’s oldest medicine’, with archaeological " +
            "evidence placing its use at least as far back as ten thousand years ago. Pepeprmint are naturally " +
            "high in manganese, vitamin A and vitamin C. Crushed leaves rubbed on the skin help soothe and relax " +
            "the muscles. Infused peppermint leaves are used to :</p>"+

            "<p>* reduce irritable bower syndrome</p>" +
            "<p>* against upset stomachs</p>" +
            "<p>* inhibit bacterial growth</p>" +
            "<p>* treat fevers</p>" +
            "<p>* flatulence</p>" +
            "<p>* spastic colon</p>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeenth);

        TextView textView = findViewById(R.id.tv15);
        textView.setText(Html.fromHtml(tx15));
    }

    public void next(View v){
        Intent intent = new Intent(this, EighteenthActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
        Intent intent = new Intent(this, SixteenthActivity.class);
        startActivity(intent);
    }
}
