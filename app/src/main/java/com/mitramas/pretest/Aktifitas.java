package com.mitramas.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aktifitas extends AppCompatActivity {
    Button buttonTambahAktifitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktifitas);

        buttonTambahAktifitas = (Button) findViewById(R.id.buttonTambahAktifitas);
        buttonTambahAktifitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahAktifitas();
            }
        });
    }

    public void tambahAktifitas(){
        Intent intentTambahAktifitas = new Intent(this, HalamanUtama.class);
        startActivity(intentTambahAktifitas);
    }
}