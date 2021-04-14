package com.mitramas.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HalamanUtama extends AppCompatActivity {
    Button buttonHomePage;
    public TextView sName;
    public String showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        sName = (TextView) findViewById(R.id.hiUser);
        Bundle b = getIntent().getExtras();
//        showName = b.getString(parse_nama);
        sName.setText("Hai "+showName);
        buttonHomePage = (Button) findViewById(R.id.buttonHomePage);
        buttonHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAktifitas();
            }
        });
    }

    public void openAktifitas(){
        Intent intentOpenAktifitas = new Intent (this, Aktifitas.class);
        startActivity(intentOpenAktifitas);
    }
}