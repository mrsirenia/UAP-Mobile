package com.example.datalibrary.mycampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class EkonomiBisnis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekonomi_bisnis);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    public void keMI(View view){
        Intent gotoMI = new Intent(EkonomiBisnis.this, MI.class);
        startActivity(gotoMI);
    }

    public void keAKBD(View view){
        Intent gotoAKBD = new Intent(EkonomiBisnis.this, AKBD.class);
        startActivity(gotoAKBD);
    }

    public void keAKP(View view){
        Intent gotoAKP = new Intent(EkonomiBisnis.this, AKP.class);
        startActivity(gotoAKP);
    }

    public void kePW(View view){
        Intent gotoPW = new Intent(EkonomiBisnis.this, PW.class);
        startActivity(gotoPW);
    }

    public void keAGBP(View view){
        Intent gotoAGBP = new Intent(EkonomiBisnis.this, AGBP.class);
        startActivity(gotoAGBP);
    }

    public void kePA(View view){
        Intent gotoPA = new Intent(EkonomiBisnis.this, PA.class);
        startActivity(gotoPA);
    }

    public void keHotel(View view){
        Intent gotoHotel = new Intent(EkonomiBisnis.this, Hotel.class);
        startActivity(gotoHotel);
    }
}