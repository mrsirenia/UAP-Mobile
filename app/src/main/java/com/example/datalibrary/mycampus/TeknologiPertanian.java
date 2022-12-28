package com.example.datalibrary.mycampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class TeknologiPertanian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknologi_pertanian);

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

    public void keTSL(View view){
        Intent gotoTSL = new Intent(TeknologiPertanian.this, TSL.class);
        startActivity(gotoTSL);
    }

    public void keMP(View view){
        Intent gotoMP = new Intent(TeknologiPertanian.this, MP.class);
        startActivity(gotoMP);
    }

    public void keTepa(View view){
        Intent gotoTepa = new Intent(TeknologiPertanian.this, Tepa.class);
        startActivity(gotoTepa);
    }

    public void keTRKI(View view){
        Intent gotoTRKI = new Intent(TeknologiPertanian.this, TRKI.class);
        startActivity(gotoTRKI);
    }

    public void keTRKJJ(View view){
        Intent gotoTRKJJ = new Intent(TeknologiPertanian.this, TRKJJ.class);
        startActivity(gotoTRKJJ);
    }

    public void kePPA(View view){
        Intent gotoPPA = new Intent(TeknologiPertanian.this, PPA.class);
        startActivity(gotoPPA);
    }

    public void kePP(View view){
        Intent gotoPP = new Intent(TeknologiPertanian.this, PP.class);
        startActivity(gotoPP);
    }
}
