package com.example.nyongnsikak.efikhymnbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class about extends Activity {
    String num, about ;
    TextView textv;
    int num1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textv = (TextView) findViewById(R.id.newText);
        Intent GetText1 = getIntent();
        num = GetText1.getStringExtra("myNumber");
        num1 = Integer.parseInt(num);
        if (num1 == 1){
            about = getResources().getString(R.string.Acknowledge);
            textv.setText(about);
            num1 = 0;
        }


    }

}
