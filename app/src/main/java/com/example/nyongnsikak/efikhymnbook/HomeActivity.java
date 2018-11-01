package com.example.nyongnsikak.efikhymnbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = (RecyclerView) findViewById(R.id.rv_hymn_list);
        HymnListAdapter hymnListAdapter = new HymnListAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(hymnListAdapter);
    }
}
