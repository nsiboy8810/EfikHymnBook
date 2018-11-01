package com.example.nyongnsikak.efikhymnbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Splashscreen extends Activity {

    int delay = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent start = new Intent(Splashscreen.this,cover_Activity.class);
                startActivity(start);
                finish();
            }
        }, delay);

    }


}
