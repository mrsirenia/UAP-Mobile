package com.example.datalibrary.mycampus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datalibrary.mycampus.about.ActivityHistory;
import com.example.datalibrary.mycampus.about.ActivityVisimisi;


public class Tab1University extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1_university, container, false);

        CardView cardView = rootView.findViewById(R.id.card_history);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAbout = new Intent(rootView.getContext(), ActivityHistory.class);
                startActivity(gotoAbout);
            }
        });

        CardView cardView1 = rootView.findViewById(R.id.card_visimisi);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAbout = new Intent(rootView.getContext(), ActivityVisimisi.class);
                startActivity(gotoAbout);
            }
        });

        return rootView;
    }


}
