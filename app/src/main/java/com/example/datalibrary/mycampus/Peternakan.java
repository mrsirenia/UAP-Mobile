package com.example.datalibrary.mycampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

public class Peternakan extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peternakan);


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

    public void keProter(View view){
        Intent gotoProter = new Intent(Peternakan.this, Proter.class);
        startActivity(gotoProter);
    }

    public void keTekproter(View view){
        Intent gotoTekproter = new Intent(Peternakan.this, Tekproter.class);
        startActivity(gotoTekproter);
    }

    public void keTPI(View view){
        Intent gotoTPI = new Intent(Peternakan.this, TPI.class);
        startActivity(gotoTPI);
    }

    public void keTangkap(View view){
        Intent gotoTangkap = new Intent(Peternakan.this, Tangkap.class);
        startActivity(gotoTangkap);
    }

    public void keBP(View view){
        Intent gotoBP = new Intent(Peternakan.this, BP.class);
        startActivity(gotoBP);
    }
}
