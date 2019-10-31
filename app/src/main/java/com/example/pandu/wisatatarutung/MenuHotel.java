package com.example.pandu.wisatatarutung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MenuHotel extends AppCompatActivity implements View.OnClickListener{
    private CardView hotel_bali,hotel_hineni,hotel_palapa,hotel_safari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hotel);


        hotel_bali =(CardView) findViewById(R.id.hotel_bali);
        hotel_hineni =(CardView) findViewById(R.id.hotel_hineni);
        hotel_palapa =(CardView) findViewById(R.id.hotel_palapa);
        hotel_safari =(CardView) findViewById(R.id.hotel_safari);

        hotel_bali.setOnClickListener(this);
        hotel_hineni.setOnClickListener(this);
        hotel_palapa.setOnClickListener(this);
        hotel_safari.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()) {
            case R.id.hotel_bali:
                i = new Intent(this, HotelBali.class);
                startActivity(i);
                break;
            case R.id.hotel_hineni:
                i = new Intent(this, HotelHineni.class);
                startActivity(i);
                break;
            case R.id.hotel_palapa:
                i = new Intent(this, HotelPalapa.class);
                startActivity(i);
                break;
            case R.id.hotel_safari:
                i = new Intent(this, HotelSafari.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}
