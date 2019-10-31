package com.example.pandu.wisatatarutung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button button1 = (Button) findViewById(R.id.buttonwisata);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuActivity.this,MenuWisata.class);
                startActivity(pindah);
            }
        });


        Button button2 = (Button) findViewById(R.id.buttonhotel);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuActivity.this,MenuHotel.class);
                startActivity(pindah);

            }
        });


        Button button3 = (Button) findViewById(R.id.buttonkuliner);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuActivity.this,MenuKuliner.class);
                startActivity(pindah);

            }
        });


        Button button4 = (Button) findViewById(R.id.buttontentang);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuActivity.this,MenuTentang.class);
                startActivity(pindah);

            }
        });

    }


}
