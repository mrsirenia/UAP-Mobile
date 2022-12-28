package com.example.datalibrary.mycampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class BudidayaTanamanPerkebunan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budidaya_tanaman_perkebunan);


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

    public void keKebun(View view){
        Intent gotoKebun = new Intent(BudidayaTanamanPerkebunan.this, Kebun.class);
        startActivity(gotoKebun);
    }

    public void kePMIP(View view){
        Intent gotoPMIP = new Intent(BudidayaTanamanPerkebunan.this, PMIP.class);
        startActivity(gotoPMIP);
    }

    public void keKopi(View view){
        Intent gotoKopi = new Intent(BudidayaTanamanPerkebunan.this, Kopi.class);
        startActivity(gotoKopi);
    }
}