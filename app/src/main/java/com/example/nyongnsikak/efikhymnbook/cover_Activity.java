package com.example.nyongnsikak.efikhymnbook;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.InputMismatchException;


public class cover_Activity extends Activity {

    EditText searchBox;
    Button goHYMN,aboutHymns,searchHymn,backHymn, Acknowledge;
    ImageButton myGo;
    Intent ChangeActivity;
    String  collect, number;
    int searchHymnsNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_);

        aboutHymns = (Button) findViewById(R.id.AboutHynms);
        searchBox = (EditText) findViewById(R.id.searchText);
        Acknowledge = (Button) findViewById(R.id.acknowledge);
        Acknowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeActivity = new Intent(cover_Activity.this, about.class);
                number = "1";
                ChangeActivity.putExtra("myNumber", number);
                startActivity(ChangeActivity);
            }
        });
        aboutHymns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeActivity = new Intent(cover_Activity.this, about.class);
                number = "2";
                ChangeActivity.putExtra("myNumber", number);
            startActivity(ChangeActivity);
            }
        });
        searchBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    collect = String.valueOf(searchBox.getText());
                    searchHymnsNo = Integer.parseInt(collect);
                } catch (Exception exc) {
                    searchBox.setText("");
                    searchBox.setTextColor(Color.parseColor("#010101"));


                }

            }
        });

    }

    public void goHymns(View view){
        ChangeActivity = new Intent(this, MainActivity.class);
        startActivity(ChangeActivity);
    }

    public void searchHymns(View view){
        Acknowledge = (Button) findViewById(R.id.acknowledge);
   myGo = (ImageButton) findViewById(R.id.imageButton);
       searchBox = (EditText) findViewById(R.id.searchText);
        goHYMN = (Button) findViewById(R.id.myOwnHymns);
        searchHymn = (Button) findViewById(R.id.mySearch);
        backHymn = (Button)  findViewById(R.id.myBack);
        aboutHymns = (Button)findViewById(R.id.AboutHynms);
        goHYMN.setVisibility(View.INVISIBLE);
        aboutHymns.setVisibility(View.INVISIBLE);
        backHymn.setVisibility(View.VISIBLE);
        searchHymn.setVisibility(View.INVISIBLE);
        searchBox.setVisibility(View.VISIBLE);
        myGo.setVisibility(View.VISIBLE);
        searchBox.setTextColor(Color.parseColor("#d3d3d3"));
        Acknowledge.setVisibility(View.INVISIBLE);

    }

    public void backHymns(View view){
        Acknowledge = (Button) findViewById(R.id.acknowledge);
         myGo = (ImageButton) findViewById(R.id.imageButton);
        searchBox = (EditText) findViewById(R.id.searchText);
        goHYMN = (Button) findViewById(R.id.myOwnHymns);
        searchHymn = (Button) findViewById(R.id.mySearch);
        backHymn = (Button)  findViewById(R.id.myBack);
        aboutHymns = (Button)findViewById(R.id.AboutHynms);
        goHYMN.setVisibility(View.VISIBLE);
        aboutHymns.setVisibility(View.VISIBLE);
        backHymn.setVisibility(View.INVISIBLE);
        searchHymn.setVisibility(View.VISIBLE);
        searchBox.setVisibility(View.INVISIBLE);
        searchBox.setText("");
        myGo.setVisibility(View.INVISIBLE);
        searchBox.setText("enter hymn no");
        Acknowledge.setVisibility(View.VISIBLE);


    }

    public void goSearch(View view) {


        searchBox = (EditText) findViewById(R.id.searchText);

        try {

            ChangeActivity = new Intent(this, SearchCall.class);
            collect = String.valueOf(searchBox.getText());
            searchHymnsNo = Integer.parseInt(collect);

            if (searchHymnsNo >= 1 && searchHymnsNo <= 366) {
                ChangeActivity.putExtra("SearchNo", collect);

                startActivity(ChangeActivity);
            }
        }
        catch (Exception exc){
          searchBox.setText("");
        }

        }


    }



