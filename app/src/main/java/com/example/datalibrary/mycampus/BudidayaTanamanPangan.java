package com.example.datalibrary.mycampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

public class BudidayaTanamanPangan extends AppCompatActivity implements View.OnClickListener {

    CardView cv_ptp, cv_horti, cv_tekben, cv_tpth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budidaya_tanaman_pangan);

        cv_ptp = findViewById(R.id.row_ptp);
        cv_horti = findViewById(R.id.row_horti);
        cv_tekben = findViewById(R.id.row_tekben);
        cv_tpth = findViewById(R.id.row_tpth);

        cv_ptp.setOnClickListener(this);
        cv_horti.setOnClickListener(this);
        cv_tekben.setOnClickListener(this);
        cv_tpth.setOnClickListener(this);

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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.row_ptp:
                Intent intentpai = new Intent(this, PTP.class);
                startActivity(intentpai);
                break;

            case R.id.row_horti:
                Intent intentpba = new Intent(this, Horti.class);
                startActivity(intentpba);
                break;

            case R.id.row_tekben:
                Intent intentsaa = new Intent(this, Tekben.class);
                startActivity(intentsaa);
                break;

            case R.id.row_tpth:
                Intent intentafi = new Intent(this, TPTH.class);
                startActivity(intentafi);
                break;
        }
    }
}
