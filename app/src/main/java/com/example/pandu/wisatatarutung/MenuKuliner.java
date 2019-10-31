package com.example.pandu.wisatatarutung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MenuKuliner extends AppCompatActivity implements View.OnClickListener{
    private CardView btn_kacang,btn_talam,btn_ombus,btn_cendol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kuliner);

        btn_kacang =(CardView) findViewById(R.id.btn_kacang);
        btn_talam =(CardView) findViewById(R.id.btn_talam);
        btn_ombus =(CardView) findViewById(R.id.btn_ombus);
        btn_cendol =(CardView) findViewById(R.id.btn_cendol);

        btn_kacang.setOnClickListener(this);
        btn_talam.setOnClickListener(this);
        btn_ombus.setOnClickListener(this);
        btn_cendol.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()) {
            case R.id.btn_kacang:
                i = new Intent(this, KulinerKacangSihobuk.class);
                startActivity(i);
                break;
            case R.id.btn_talam:
                i = new Intent(this, KulinerKueTalam.class);
                startActivity(i);
                break;
            case R.id.btn_ombus:
                i = new Intent(this, KulinerOmbusOmbus.class);
                startActivity(i);
                break;
            case R.id.btn_cendol:
                i = new Intent(this, KulinerCendol.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}

