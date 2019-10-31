package com.example.pandu.wisatatarutung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;


public class MenuWisata extends AppCompatActivity implements View.OnClickListener {
    private CardView btn_air,btn_salib,btn_soda,btn_sopo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_wisata);


        btn_air =(CardView) findViewById(R.id.btn_air);
        btn_salib =(CardView) findViewById(R.id.btn_salib);
        btn_soda =(CardView) findViewById(R.id.btn_soda);
        btn_sopo =(CardView) findViewById(R.id.btn_sopo);

        btn_air.setOnClickListener(this);
        btn_salib.setOnClickListener(this);
        btn_soda.setOnClickListener(this);
        btn_sopo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()) {
            case R.id.btn_air:
                i = new Intent(this, WisataAirPanas.class);
                startActivity(i);
                break;
            case R.id.btn_salib:
                i = new Intent(this, WisataSalibKasih.class);
                startActivity(i);
                break;
            case R.id.btn_soda:
                i = new Intent(this, WisataSodaParbubu.class);
                startActivity(i);
                break;
            case R.id.btn_sopo:
                i = new Intent(this, WisataSopoPartungkoan.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}
