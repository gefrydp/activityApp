package com.mitramas.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonDaftar;
    private Button buttonMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDaftar = (Button) findViewById(R.id.buttonDaftar);
        buttonMasuk = (Button) findViewById(R.id.buttonMasuk);
        buttonDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPageDaftar();
            }
        });
        buttonMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPageMasuk();
            }
        });
    }

    public void openPageDaftar(){
        Intent intentDaftar = new Intent(this, HalamanDaftar.class);
        startActivity(intentDaftar);
    }
    public void openPageMasuk(){
        Intent intentMasuk = new Intent(this, HalamanMasuk.class);
        startActivity(intentMasuk);
    }
}