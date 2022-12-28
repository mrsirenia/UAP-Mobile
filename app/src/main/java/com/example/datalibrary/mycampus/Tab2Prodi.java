package com.example.datalibrary.mycampus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab2Prodi extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab2_prodi, container, false);

        CardView cardView = rootView.findViewById(R.id.card_s1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAbout = new Intent(rootView.getContext(), BudidayaTanamanPangan.class);
                startActivity(gotoAbout);
            }
        });

        CardView cardView1 = rootView.findViewById(R.id.card_s2);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAbout = new Intent(rootView.getContext(), BudidayaTanamanPerkebunan.class);
                startActivity(gotoAbout);
            }
        });

        CardView cardView2 = rootView.findViewById(R.id.card_s3);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAbout = new Intent(rootView.getContext(), TeknologiPertanian.class);
                startActivity(gotoAbout);
            }
        });

        CardView cardView3 = rootView.findViewById(R.id.card_s4);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAbout = new Intent(rootView.getContext(), Peternakan.class);
                startActivity(gotoAbout);
            }
        });

        CardView cardView4 = rootView.findViewById(R.id.card_s5);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAbout = new Intent(rootView.getContext(), EkonomiBisnis.class);
                startActivity(gotoAbout);
            }
        });

        return rootView;
    }
}
