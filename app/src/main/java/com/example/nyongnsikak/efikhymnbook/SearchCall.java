package com.example.nyongnsikak.efikhymnbook;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SearchCall extends Activity {

    TextView displaySong;
    String getHymn;
    String getHymnNo;
    int hymnNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn_lyrics);



        displaySong = (TextView) findViewById(R.id.displaySong);


        Intent hymn_lyrics =  getIntent();
        getHymnNo = hymn_lyrics.getStringExtra("SearchNo");
        hymnNumber = Integer.parseInt(getHymnNo);
        displaySong.setTextColor(Color.parseColor("#010101"));

        if (hymnNumber == 1){
            getHymn = getResources().getString(R.string.hymn1);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 2){
            getHymn = getResources().getString(R.string.hymn2);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 3){
            getHymn = getResources().getString(R.string.hymn3);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 4){
            getHymn = getResources().getString(R.string.hymn4);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 5) {
            getHymn = getResources().getString(R.string.hymn5);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 6) {
            getHymn = getResources().getString(R.string.hymn6);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 7) {
            getHymn = getResources().getString(R.string.hymn7);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 8) {
            getHymn = getResources().getString(R.string.hymn8);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 9) {
            getHymn = getResources().getString(R.string.hymn9);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 10) {
            getHymn = getResources().getString(R.string.hymn10);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 11) {
            getHymn = getResources().getString(R.string.hymn11);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 12) {
            getHymn = getResources().getString(R.string.hymn12);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 13) {
            getHymn = getResources().getString(R.string.hymn13);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 14) {
            getHymn = getResources().getString(R.string.hymn14);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 15) {
            getHymn = getResources().getString(R.string.hymn15);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 16) {
            getHymn = getResources().getString(R.string.hymn16);
            displaySong.setText(getHymn + "");

        }
        else if (hymnNumber == 2000) {
            getHymn = getResources().getString(R.string.hymn16B);
            displaySong.setText(getHymn + "");

        }
        else if (hymnNumber == 17) {
            getHymn = getResources().getString(R.string.hymn17);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 18) {
            getHymn = getResources().getString(R.string.hymn18);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 19) {
            getHymn = getResources().getString(R.string.hymn19);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 20) {
            getHymn = getResources().getString(R.string.hymn20);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 21) {
            getHymn = getResources().getString(R.string.hymn21);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 22) {
            getHymn = getResources().getString(R.string.hymn22);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 23) {
            getHymn = getResources().getString(R.string.hymn23);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 24) {
            getHymn = getResources().getString(R.string.hymn24);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 25) {
            getHymn = getResources().getString(R.string.hymn25);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 26) {
            getHymn = getResources().getString(R.string.hymn26);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 27) {
            getHymn = getResources().getString(R.string.hymn27);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 28) {
            getHymn = getResources().getString(R.string.hymn28);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 29) {
            getHymn = getResources().getString(R.string.hymn29);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 30) {
            getHymn = getResources().getString(R.string.hymn30);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 31) {
            getHymn = getResources().getString(R.string.hymn31);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 32) {
            getHymn = getResources().getString(R.string.hymn32);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 33) {
            getHymn = getResources().getString(R.string.hymn34);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 35) {
            getHymn = getResources().getString(R.string.hymn35);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 36) {
            getHymn = getResources().getString(R.string.hymn36);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 37) {
            getHymn = getResources().getString(R.string.hymn37);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 38) {
            getHymn = getResources().getString(R.string.hymn38);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 39) {
            getHymn = getResources().getString(R.string.hymn39);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 40) {
            getHymn = getResources().getString(R.string.hymn40);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 41) {
            getHymn = getResources().getString(R.string.hymn41);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 42) {
            getHymn = getResources().getString(R.string.hymn42);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 43) {
            getHymn = getResources().getString(R.string.hymn43);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 44) {
            getHymn = getResources().getString(R.string.hymn44);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 45) {
            getHymn = getResources().getString(R.string.hymn45);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 46) {
            getHymn = getResources().getString(R.string.hymn46);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 47) {
            getHymn = getResources().getString(R.string.hymn47);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 48) {
            getHymn = getResources().getString(R.string.hymn48);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 49) {
            getHymn = getResources().getString(R.string.hymn49);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 50) {
            getHymn = getResources().getString(R.string.hymn50);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 51) {
            getHymn = getResources().getString(R.string.hymn51);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 52) {
            getHymn = getResources().getString(R.string.hymn52);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 53) {
            getHymn = getResources().getString(R.string.hymn53);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 54) {
            getHymn = getResources().getString(R.string.hymn54);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 55) {
            getHymn = getResources().getString(R.string.hymn55);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 56) {
            getHymn = getResources().getString(R.string.hymn56);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 57) {
            getHymn = getResources().getString(R.string.hymn57);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 58) {
            getHymn = getResources().getString(R.string.hymn58);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 59) {
            getHymn = getResources().getString(R.string.hymn59);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 60) {
            getHymn = getResources().getString(R.string.hymn60);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 61) {
            getHymn = getResources().getString(R.string.hymn61);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 62) {
            getHymn = getResources().getString(R.string.hymn62);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 63) {
            getHymn = getResources().getString(R.string.hymn63);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 64) {
            getHymn = getResources().getString(R.string.hymn64);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 65) {
            getHymn = getResources().getString(R.string.hymn65);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 66) {
            getHymn = getResources().getString(R.string.hymn66);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 67) {
            getHymn = getResources().getString(R.string.hymn67);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 68) {
            getHymn = getResources().getString(R.string.hymn68);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 69) {
            getHymn = getResources().getString(R.string.hymn69);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 70) {
            getHymn = getResources().getString(R.string.hymn70);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 71) {
            getHymn = getResources().getString(R.string.hymn71);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 72) {
            getHymn = getResources().getString(R.string.hymn72);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 73) {
            getHymn = getResources().getString(R.string.hymn73);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 74) {
            getHymn = getResources().getString(R.string.hymn74);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 75) {
            getHymn = getResources().getString(R.string.hymn75);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 76) {
            getHymn = getResources().getString(R.string.hymn76);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 77) {
            getHymn = getResources().getString(R.string.hymn77);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 78) {
            getHymn = getResources().getString(R.string.hymn78);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 79) {
            getHymn = getResources().getString(R.string.hymn79);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 80) {
            getHymn = getResources().getString(R.string.hymn80);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 81) {
            getHymn = getResources().getString(R.string.hymn81);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 82) {
            getHymn = getResources().getString(R.string.hymn82);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 83) {
            getHymn = getResources().getString(R.string.hymn83);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 84) {
            getHymn = getResources().getString(R.string.hymn84);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 85) {
            getHymn = getResources().getString(R.string.hymn85);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 86) {
            getHymn = getResources().getString(R.string.hymn86);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 87) {
            getHymn = getResources().getString(R.string.hymn87);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 88) {
            getHymn = getResources().getString(R.string.hymn88);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 89) {
            getHymn = getResources().getString(R.string.hymn89);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 90) {
            getHymn = getResources().getString(R.string.hymn90);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 91) {
            getHymn = getResources().getString(R.string.hymn91);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 92) {
            getHymn = getResources().getString(R.string.hymn92);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 93) {
            getHymn = getResources().getString(R.string.hymn93);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 94) {
            getHymn = getResources().getString(R.string.hymn94);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 95) {
            getHymn = getResources().getString(R.string.hymn95);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 96) {
            getHymn = getResources().getString(R.string.hymn96);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 97) {
            getHymn = getResources().getString(R.string.hymn97);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 98) {
            getHymn = getResources().getString(R.string.hymn98);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 99) {
            getHymn = getResources().getString(R.string.hymn99);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 100) {
            getHymn = getResources().getString(R.string.hymn100);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 101) {
            getHymn = getResources().getString(R.string.hymn101);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 102) {
            getHymn = getResources().getString(R.string.hymn102);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 103) {
            getHymn = getResources().getString(R.string.hymn103);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 104) {
            getHymn = getResources().getString(R.string.hymn104);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 105) {
            getHymn = getResources().getString(R.string.hymn105);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 106) {
            getHymn = getResources().getString(R.string.hymn106);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 107) {
            getHymn = getResources().getString(R.string.hymn107);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 108) {
            getHymn = getResources().getString(R.string.hymn108);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 109) {
            getHymn = getResources().getString(R.string.hymn109);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 110) {
            getHymn = getResources().getString(R.string.hymn110);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 111) {
            getHymn = getResources().getString(R.string.hymn111);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 112) {
            getHymn = getResources().getString(R.string.hymn112);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 113) {
            getHymn = getResources().getString(R.string.hymn113);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 114) {
            getHymn = getResources().getString(R.string.hymn114);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 115) {
            getHymn = getResources().getString(R.string.hymn115);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 116) {
            getHymn = getResources().getString(R.string.hymn116);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 117) {
            getHymn = getResources().getString(R.string.hymn117);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 118) {
            getHymn = getResources().getString(R.string.hymn118);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 119) {
            getHymn = getResources().getString(R.string.hymn119);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 120) {
            getHymn = getResources().getString(R.string.hymn120);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 121) {
            getHymn = getResources().getString(R.string.hymn121);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 122) {
            getHymn = getResources().getString(R.string.hymn122);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 123) {
            getHymn = getResources().getString(R.string.hymn123);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 124) {
            getHymn = getResources().getString(R.string.hymn124);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 125) {
            getHymn = getResources().getString(R.string.hymn125);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 126) {
            getHymn = getResources().getString(R.string.hymn126);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 127) {
            getHymn = getResources().getString(R.string.hymn127);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 128) {
            getHymn = getResources().getString(R.string.hymn128);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 129) {
            getHymn = getResources().getString(R.string.hymn129);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 130) {
            getHymn = getResources().getString(R.string.hymn130);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 131) {
            getHymn = getResources().getString(R.string.hymn131);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 132) {
            getHymn = getResources().getString(R.string.hymn132);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 133) {
            getHymn = getResources().getString(R.string.hymn133);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 134) {
            getHymn = getResources().getString(R.string.hymn134);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 135) {
            getHymn = getResources().getString(R.string.hymn135);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 136) {
            getHymn = getResources().getString(R.string.hymn136);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 137) {
            getHymn = getResources().getString(R.string.hymn137);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 138) {
            getHymn = getResources().getString(R.string.hymn138);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 139) {
            getHymn = getResources().getString(R.string.hymn139);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 140) {
            getHymn = getResources().getString(R.string.hymn140);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 141) {
            getHymn = getResources().getString(R.string.hymn141);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 142) {
            getHymn = getResources().getString(R.string.hymn142);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 143) {
            getHymn = getResources().getString(R.string.hymn143);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 144) {
            getHymn = getResources().getString(R.string.hymn144);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 145) {
            getHymn = getResources().getString(R.string.hymn145);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 146) {
            getHymn = getResources().getString(R.string.hymn146);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 147) {
            getHymn = getResources().getString(R.string.hymn147);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 148) {
            getHymn = getResources().getString(R.string.hymn148);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 149) {
            getHymn = getResources().getString(R.string.hymn149);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 150) {
            getHymn = getResources().getString(R.string.hymn150);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 151) {
            getHymn = getResources().getString(R.string.hymn151);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 152) {
            getHymn = getResources().getString(R.string.hymn152);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 153) {
            getHymn = getResources().getString(R.string.hymn153);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 154) {
            getHymn = getResources().getString(R.string.hymn154);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 155) {
            getHymn = getResources().getString(R.string.hymn155);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 156) {
            getHymn = getResources().getString(R.string.hymn156);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 157) {
            getHymn = getResources().getString(R.string.hymn157);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 158) {
            getHymn = getResources().getString(R.string.hymn158);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 159) {
            getHymn = getResources().getString(R.string.hymn159);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 160) {
            getHymn = getResources().getString(R.string.hymn160);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 161) {
            getHymn = getResources().getString(R.string.hymn161);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 162) {
            getHymn = getResources().getString(R.string.hymn162);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 163) {
            getHymn = getResources().getString(R.string.hymn163);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 164) {
            getHymn = getResources().getString(R.string.hymn164);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 165) {
            getHymn = getResources().getString(R.string.hymn165);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 166) {
            getHymn = getResources().getString(R.string.hymn166);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 167) {
            getHymn = getResources().getString(R.string.hymn167);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 168) {
            getHymn = getResources().getString(R.string.hymn168);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 169) {
            getHymn = getResources().getString(R.string.hymn169);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 170) {
            getHymn = getResources().getString(R.string.hymn170);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 171) {
            getHymn = getResources().getString(R.string.hymn171);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 172) {
            getHymn = getResources().getString(R.string.hymn172);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 173) {
            getHymn = getResources().getString(R.string.hymn173);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 174) {
            getHymn = getResources().getString(R.string.hymn174);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 175) {
            getHymn = getResources().getString(R.string.hymn175);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 176) {
            getHymn = getResources().getString(R.string.hymn176);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 177) {
            getHymn = getResources().getString(R.string.hymn177);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 178) {
            getHymn = getResources().getString(R.string.hymn178);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 179) {
            getHymn = getResources().getString(R.string.hymn179);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 180) {
            getHymn = getResources().getString(R.string.hymn180);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 181) {
            getHymn = getResources().getString(R.string.hymn181);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 182) {
            getHymn = getResources().getString(R.string.hymn182);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 183) {
            getHymn = getResources().getString(R.string.hymn183);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 184) {
            getHymn = getResources().getString(R.string.hymn184);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 185) {
            getHymn = getResources().getString(R.string.hymn185);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 186) {
            getHymn = getResources().getString(R.string.hymn186);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 187) {
            getHymn = getResources().getString(R.string.hymn187);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 188) {
            getHymn = getResources().getString(R.string.hymn188);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 189) {
            getHymn = getResources().getString(R.string.hymn189);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 190) {
            getHymn = getResources().getString(R.string.hymn190);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 191) {
            getHymn = getResources().getString(R.string.hymn191);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 192) {
            getHymn = getResources().getString(R.string.hymn192);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 193) {
            getHymn = getResources().getString(R.string.hymn193);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 194) {
            getHymn = getResources().getString(R.string.hymn194);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 195) {
            getHymn = getResources().getString(R.string.hymn195);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 196) {
            getHymn = getResources().getString(R.string.hymn196);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 197) {
            getHymn = getResources().getString(R.string.hymn197);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 198) {
            getHymn = getResources().getString(R.string.hymn198);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 199) {
            getHymn = getResources().getString(R.string.hymn199);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 200) {
            getHymn = getResources().getString(R.string.hymn200);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 201) {
            getHymn = getResources().getString(R.string.hymn201);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 202) {
            getHymn = getResources().getString(R.string.hymn202);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 203) {
            getHymn = getResources().getString(R.string.hymn203);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 204) {
            getHymn = getResources().getString(R.string.hymn204);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 205) {
            getHymn = getResources().getString(R.string.hymn205);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 206) {
            getHymn = getResources().getString(R.string.hymn206);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 207) {
            getHymn = getResources().getString(R.string.hymn207);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 208) {
            getHymn = getResources().getString(R.string.hymn208);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 209) {
            getHymn = getResources().getString(R.string.hymn209);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 210) {
            getHymn = getResources().getString(R.string.hymn210);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 211) {
            getHymn = getResources().getString(R.string.hymn211);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 212) {
            getHymn = getResources().getString(R.string.hymn212);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 213) {
            getHymn = getResources().getString(R.string.hymn213);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 214) {
            getHymn = getResources().getString(R.string.hymn214);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 215) {
            getHymn = getResources().getString(R.string.hymn215);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 216) {
            getHymn = getResources().getString(R.string.hymn216);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 217) {
            getHymn = getResources().getString(R.string.hymn217);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 218) {
            getHymn = getResources().getString(R.string.hymn218);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 219) {
            getHymn = getResources().getString(R.string.hymn219);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 220) {
            getHymn = getResources().getString(R.string.hymn220);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 221) {
            getHymn = getResources().getString(R.string.hymn221);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 222) {
            getHymn = getResources().getString(R.string.hymn222);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 223) {
            getHymn = getResources().getString(R.string.hymn223);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 224) {
            getHymn = getResources().getString(R.string.hymn224);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 225) {
            getHymn = getResources().getString(R.string.hymn225);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 226) {
            getHymn = getResources().getString(R.string.hymn226);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 227) {
            getHymn = getResources().getString(R.string.hymn227);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 228) {
            getHymn = getResources().getString(R.string.hymn228);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 229) {
            getHymn = getResources().getString(R.string.hymn229);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 230) {
            getHymn = getResources().getString(R.string.hymn230);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 231) {
            getHymn = getResources().getString(R.string.hymn231);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 232) {
            getHymn = getResources().getString(R.string.hymn232);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 233) {
            getHymn = getResources().getString(R.string.hymn233);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 234) {
            getHymn = getResources().getString(R.string.hymn234);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 235) {
            getHymn = getResources().getString(R.string.hymn235);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 236) {
            getHymn = getResources().getString(R.string.hymn236);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 237) {
            getHymn = getResources().getString(R.string.hymn237);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 238) {
            getHymn = getResources().getString(R.string.hymn238);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 239) {
            getHymn = getResources().getString(R.string.hymn239);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 240) {
            getHymn = getResources().getString(R.string.hymn240);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 241) {
            getHymn = getResources().getString(R.string.hymn241);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 242) {
            getHymn = getResources().getString(R.string.hymn242);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 243) {
            getHymn = getResources().getString(R.string.hymn243);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 244) {
            getHymn = getResources().getString(R.string.hymn244);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 245) {
            getHymn = getResources().getString(R.string.hymn245);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 246) {
            getHymn = getResources().getString(R.string.hymn246);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 247) {
            getHymn = getResources().getString(R.string.hymn267);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 248) {
            getHymn = getResources().getString(R.string.hymn248);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 249) {
            getHymn = getResources().getString(R.string.hymn249);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 250) {
            getHymn = getResources().getString(R.string.hymn250);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 251) {
            getHymn = getResources().getString(R.string.hymn251);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 252) {
            getHymn = getResources().getString(R.string.hymn252);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 253) {
            getHymn = getResources().getString(R.string.hymn253);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 254) {
            getHymn = getResources().getString(R.string.hymn254);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 255) {
            getHymn = getResources().getString(R.string.hymn255);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 256) {
            getHymn = getResources().getString(R.string.hymn256);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 257) {
            getHymn = getResources().getString(R.string.hymn257);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 258) {
            getHymn = getResources().getString(R.string.hymn258);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 259) {
            getHymn = getResources().getString(R.string.hymn259);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 260) {
            getHymn = getResources().getString(R.string.hymn260);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 261) {
            getHymn = getResources().getString(R.string.hymn261);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 262) {
            getHymn = getResources().getString(R.string.hymn262);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 263) {
            getHymn = getResources().getString(R.string.hymn263);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 264) {
            getHymn = getResources().getString(R.string.hymn264);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 265) {
            getHymn = getResources().getString(R.string.hymn265);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 266) {
            getHymn = getResources().getString(R.string.hymn266);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 267) {
            getHymn = getResources().getString(R.string.hymn267);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 268) {
            getHymn = getResources().getString(R.string.hymn268);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 269) {
            getHymn = getResources().getString(R.string.hymn269);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 270) {
            getHymn = getResources().getString(R.string.hymn270);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 271) {
            getHymn = getResources().getString(R.string.hymn271);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 272) {
            getHymn = getResources().getString(R.string.hymn272);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 273) {
            getHymn = getResources().getString(R.string.hymn273);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 274) {
            getHymn = getResources().getString(R.string.hymn274);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 275) {
            getHymn = getResources().getString(R.string.hymn275);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 276) {
            getHymn = getResources().getString(R.string.hymn276);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 277) {
            getHymn = getResources().getString(R.string.hymn277);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 278) {
            getHymn = getResources().getString(R.string.hymn278);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 279) {
            getHymn = getResources().getString(R.string.hymn279);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 280) {
            getHymn = getResources().getString(R.string.hymn280);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 281) {
            getHymn = getResources().getString(R.string.hymn281);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 282) {
            getHymn = getResources().getString(R.string.hymn282);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 283) {
            getHymn = getResources().getString(R.string.hymn283);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 284) {
            getHymn = getResources().getString(R.string.hymn284);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 285) {
            getHymn = getResources().getString(R.string.hymn285);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 286) {
            getHymn = getResources().getString(R.string.hymn286);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 287) {
            getHymn = getResources().getString(R.string.hymn287);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 288) {
            getHymn = getResources().getString(R.string.hymn288);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 289) {
            getHymn = getResources().getString(R.string.hymn289);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 290) {
            getHymn = getResources().getString(R.string.hymn290);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 291) {
            getHymn = getResources().getString(R.string.hymn291);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 292) {
            getHymn = getResources().getString(R.string.hymn292);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 293) {
            getHymn = getResources().getString(R.string.hymn293);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 294) {
            getHymn = getResources().getString(R.string.hymn294);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 295) {
            getHymn = getResources().getString(R.string.hymn295);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 296) {
            getHymn = getResources().getString(R.string.hymn296);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 297) {
            getHymn = getResources().getString(R.string.hymn297);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 298) {
            getHymn = getResources().getString(R.string.hymn298);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 299) {
            getHymn = getResources().getString(R.string.hymn299);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 300) {
            getHymn = getResources().getString(R.string.hymn300);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 301) {
            getHymn = getResources().getString(R.string.hymn301);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 302) {
            getHymn = getResources().getString(R.string.hymn302);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 303) {
            getHymn = getResources().getString(R.string.hymn303);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 304) {
            getHymn = getResources().getString(R.string.hymn304);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 305) {
            getHymn = getResources().getString(R.string.hymn305);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 306) {
            getHymn = getResources().getString(R.string.hymn306);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 307) {
            getHymn = getResources().getString(R.string.hymn307);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 308) {
            getHymn = getResources().getString(R.string.hymn308);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 309) {
            getHymn = getResources().getString(R.string.hymn309);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 310) {
            getHymn = getResources().getString(R.string.hymn310);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 311) {
            getHymn = getResources().getString(R.string.hymn311);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 312) {
            getHymn = getResources().getString(R.string.hymn312);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 313) {
            getHymn = getResources().getString(R.string.hymn313);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 314) {
            getHymn = getResources().getString(R.string.hymn314);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 315) {
            getHymn = getResources().getString(R.string.hymn315);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 316) {
            getHymn = getResources().getString(R.string.hymn316);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 317) {
            getHymn = getResources().getString(R.string.hymn317);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 318) {
            getHymn = getResources().getString(R.string.hymn318);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 319) {
            getHymn = getResources().getString(R.string.hymn319);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 320) {
            getHymn = getResources().getString(R.string.hymn320);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 321) {
            getHymn = getResources().getString(R.string.hymn321);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 322) {
            getHymn = getResources().getString(R.string.hymn322);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 323) {
            getHymn = getResources().getString(R.string.hymn323);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 324) {
            getHymn = getResources().getString(R.string.hymn324);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 325) {
            getHymn = getResources().getString(R.string.hymn325);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 326) {
            getHymn = getResources().getString(R.string.hymn326);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 327) {
            getHymn = getResources().getString(R.string.hymn327);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 328) {
            getHymn = getResources().getString(R.string.hymn328);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 329) {
            getHymn = getResources().getString(R.string.hymn329);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 330) {
            getHymn = getResources().getString(R.string.hymn330);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 331) {
            getHymn = getResources().getString(R.string.hymn331);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 332) {
            getHymn = getResources().getString(R.string.hymn332);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 333) {
            getHymn = getResources().getString(R.string.hymn333);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 334) {
            getHymn = getResources().getString(R.string.hymn334);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 335) {
            getHymn = getResources().getString(R.string.hymn335);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 336) {
            getHymn = getResources().getString(R.string.hymn336);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 337) {
            getHymn = getResources().getString(R.string.hymn337);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 338) {
            getHymn = getResources().getString(R.string.hymn338);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 339) {
            getHymn = getResources().getString(R.string.hymn339);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 340) {
            getHymn = getResources().getString(R.string.hymn340);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 341) {
            getHymn = getResources().getString(R.string.hymn341);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 342) {
            getHymn = getResources().getString(R.string.hymn342);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 343) {
            getHymn = getResources().getString(R.string.hymn343);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 344) {
            getHymn = getResources().getString(R.string.hymn344);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 345) {
            getHymn = getResources().getString(R.string.hymn345);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 346) {
            getHymn = getResources().getString(R.string.hymn346);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 347) {
            getHymn = getResources().getString(R.string.hymn347);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 348) {
            getHymn = getResources().getString(R.string.hymn348);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 349) {
            getHymn = getResources().getString(R.string.hymn349);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 350) {
            getHymn = getResources().getString(R.string.hymn350);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 351) {
            getHymn = getResources().getString(R.string.hymn351);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 352) {
            getHymn = getResources().getString(R.string.hymn352);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 353) {
            getHymn = getResources().getString(R.string.hymn353);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 354) {
            getHymn = getResources().getString(R.string.hymn354);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 355) {
            getHymn = getResources().getString(R.string.hymn355);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 356) {
            getHymn = getResources().getString(R.string.hymn356);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 357) {
            getHymn = getResources().getString(R.string.hymn357);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 358) {
            getHymn = getResources().getString(R.string.hymn358);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 359) {
            getHymn = getResources().getString(R.string.hymn359);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 360) {
            getHymn = getResources().getString(R.string.hymn360);
            displaySong.setText(getHymn + "");
        }

        else if (hymnNumber == 361) {
            getHymn = getResources().getString(R.string.hymn361);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 362) {
            getHymn = getResources().getString(R.string.hymn362);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 363) {
            getHymn = getResources().getString(R.string.hymn363);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 364) {
            getHymn = getResources().getString(R.string.hymn364);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 365) {
            getHymn = getResources().getString(R.string.hymn365);
            displaySong.setText(getHymn + "");
        }
        else if (hymnNumber == 366) {
            getHymn = getResources().getString(R.string.hymn366);
            displaySong.setText(getHymn + "");
        }
        else{
            getHymn = getResources().getString(R.string.aboutMyHymns);
            displaySong.setText(getHymn + "");
        }
    }


}

