package com.example.nyongnsikak.efikhymnbook;

import android.app.ActionBar;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;


public class MainActivity extends Activity {

    Intent hymnsIntent;
    String hymnNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void hymnNo1(View view){

        /* opens the next activity to display hymn1*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "1";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }

    public void hymnNo2(View view){

        /* opens the next activity to display hymn2*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "2";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }

    public void hymnNo3(View view){

        /* opens the next activity to display hymn3*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "3";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo4(View view){

        /* opens the next activity to display hymn4*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "4";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo5(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "5";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);

    }

    public void hymnNo6(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "6";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo7(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "7";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo8(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "8";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo9(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "9";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo10(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "10";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo11(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "11";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo12(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "12";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo13(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "13";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo14(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "14";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo15(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "15";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo16(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "16";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo16B(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "2000";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo17(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "17";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo18(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "18";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo19(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "19";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo20(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "20";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo21(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "21";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo22(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "22";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo23(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "23";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo24(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "24";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo25(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "25";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo26(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "26";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo27(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "27";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo28(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "28";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo29(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "29";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo30(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "30";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo31(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "31";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo32(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "32";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo33(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "33";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo34(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "34";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo35(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "35";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo36(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "36";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo37(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "37";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo38(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "38";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo39(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "39";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo40(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "40";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo41(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "41";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo42(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "42";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo43(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "43";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo44(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "44";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo45(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "45";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo46(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "46";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo47(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "47";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo48(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "48";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo49(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "49";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo50(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "50";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo51(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "51";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo52(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "52";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo53(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "53";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo54(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "54";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo55(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "55";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo56(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "56";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo57(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "57";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo58(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "58";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo59(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "59";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo60(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "60";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo61(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "61";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo62(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "62";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo63(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "63";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo64(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "64";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo65(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "65";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo66(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "66";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo67(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "67";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo68(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "68";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo69(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "69";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo70(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "70";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo71(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "71";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo72(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "72";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo73(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "73";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo74(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "74";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo75(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "75";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo76(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "76";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo77(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "77";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo78(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "78";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo79(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "79";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo80(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "80";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo81(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "81";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo82(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "82";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo83(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "83";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo84(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "84";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo85(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "85";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo86(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "86";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo87(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "87";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo88(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "88";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo89(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "89";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo90(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "90";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo91(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "91";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo92(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "92";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo93(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "93";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo94(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "94";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo95(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "95";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo96(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "96";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo97(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "97";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo98(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "98";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo99(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "99";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo100(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "100";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo101(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "101";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo102(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "102";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo103(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "103";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo104(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "104";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo105(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "105";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo106(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "106";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo107(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "107";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo108(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "108";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo109(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "109";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo110(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "110";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo111(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "111";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo112(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "112";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo113(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "113";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo114(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "114";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo115(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "115";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo116(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "116";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo117(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "117";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo118(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "118";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo119(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "119";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo120(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "120";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo121(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "121";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo122(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "122";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo123(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "123";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo124(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "124";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo125(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "125";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo126(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "126";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo127(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "127";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo128(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "128";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo129(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "129";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo130(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "130";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo131(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "131";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo132(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "132";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo133(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "133";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo134(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "134";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo135(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "135";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo136(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "136";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo137(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "137";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo138(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "138";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo139(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "139";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo140(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "140";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo141(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "141";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo142(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "142";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo143(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "143";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo144(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "144";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo145(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "145";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo146(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "146";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo147(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "147";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo148(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "148";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo149(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "149";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo150(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "150";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo151(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "151";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo152(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "152";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo153(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "153";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo154(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "154";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo155(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "155";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo156(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "156";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo157(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "157";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo158(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "158";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo159(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "159";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo160(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "160";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }



    public void hymnNo161(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "161";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo162(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "162";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo163(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "163";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo164(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "164";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo165(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "165";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo166(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "166";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo167(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "167";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo168(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "168";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo169(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "169";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }

    public void hymnNo170(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "170";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo171(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "171";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo172(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "172";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo173(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "173";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo174(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "174";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo175(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "175";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo176(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "176";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo177(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "177";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo178(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "178";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo179(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "179";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo180(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "180";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo181(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "181";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo182(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "182";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo183(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "183";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo184(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "184";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo185(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "185";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo186(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "186";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo187(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "187";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo188(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "188";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo189(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "189";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo190(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "190";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo191(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "191";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo192(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "192";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo193(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "193";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo194(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "194";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo195(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "195";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo196(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "196";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo197(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "197";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo198(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "198";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo199(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "199";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo200(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "200";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }

    public void hymnNo201(View view){

        /* opens the next activity to display hymn1*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "201";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }

    public void hymnNo202(View view){

        /* opens the next activity to display hymn2*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "202";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }

    public void hymnNo203(View view){

        /* opens the next activity to display hymn3*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "203";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo204(View view){

        /* opens the next activity to display hymn4*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "204";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo205(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "205";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);

    }

    public void hymnNo206(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "206";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo207(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "207";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo208(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "208";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo209(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "209";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo210(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "210";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo211(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "211";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo212(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "212";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo213(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "213";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo214(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "214";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo215(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "215";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo216(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "216";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }

    public void hymnNo217(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "217";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo218(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "218";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo219(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "219";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo220(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "220";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo221(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "221";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo222(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "222";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo223(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "223";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo224(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "224";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo225(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "225";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo226(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "226";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo227(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "227";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo228(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "228";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo229(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "229";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo230(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "230";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo231(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "231";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo232(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "232";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo233(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "233";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo234(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "234";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo235(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "235";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo236(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "236";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo237(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "237";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo238(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "238";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo239(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "239";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo240(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "240";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo241(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "241";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo242(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "242";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo243(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "243";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo244(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "244";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo245(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "245";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo246(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "246";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo247(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "247";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo248(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "248";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo249(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "249";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo250(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "250";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo251(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "251";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo252(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "252";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo253(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "253";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo254(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "254";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo255(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "255";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo256(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "256";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo257(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "257";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo258(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "258";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo259(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "259";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo260(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "260";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo261(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "261";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo262(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "262";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo263(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "263";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo264(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "264";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo265(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "265";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo266(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "266";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo267(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "267";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo268(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "268";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo269(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "269";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo270(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "270";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo271(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "271";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo272(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "272";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo273(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "273";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo274(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "274";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo275(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "275";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo276(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "276";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo277(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "277";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo278(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "278";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo279(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "279";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo280(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "280";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo281(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "281";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo282(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "282";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo283(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "283";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo284(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "284";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo285(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "285";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo286(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "286";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo287(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "287";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo288(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "288";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo289(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "289";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo290(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "290";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo291(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "291";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo292(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "292";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo293(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "293";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo294(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "294";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo295(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "295";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo296(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "296";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo297(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "297";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo298(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "298";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo299(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "299";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo300(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "300";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo301(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "301";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo302(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "302";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo303(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "303";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo304(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "304";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo305(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "305";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo306(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "306";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo307(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "307";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo308(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "308";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo309(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "309";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo310(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "310";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo311(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "311";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo312(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "312";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo313(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "313";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo314(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "314";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo315(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "315";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo316(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "316";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo317(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "317";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo318(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "318";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo319(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "319";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo320(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "320";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo321(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "321";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo322(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "322";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo323(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "323";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo324(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "324";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo325(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "325";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo326(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "326";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo327(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "327";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo328(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "328";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo329(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "329";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo330(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "330";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo331(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "331";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo332(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "332";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo333(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "333";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo334(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "334";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo335(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "335";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo336(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "336";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo337(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "337";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo338(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "338";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo339(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "339";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo340(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "340";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo341(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "341";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo342(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "342";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo343(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "343";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo344(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "344";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo345(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "345";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo346(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "346";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo347(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "347";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo348(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "348";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo349(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "349";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo350(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "350";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo351(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "351";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo352(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "352";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo353(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "353";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo354(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "354";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo355(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "355";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo356(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "356";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo357(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "357";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo358(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "358";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo359(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "359";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo360(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "160";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }



    public void hymnNo361(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "361";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo362(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "362";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo363(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "363";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo364(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "364";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo365(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "365";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
    public void hymnNo366(View view){

        /* opens the next activity to display hymn5*/

        hymnsIntent = new Intent(this, hymn_lyrics.class);
        hymnNo = "366";
        hymnsIntent.putExtra("hymns", hymnNo);
        startActivity(hymnsIntent);
    }
}
