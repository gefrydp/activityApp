package com.mitramas.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HalamanMasuk extends AppCompatActivity {
    Button buttonMasuk;
    public String theirName;
    EditText name = (EditText) findViewById(R.id.namaEditText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_masuk);

        buttonMasuk = (Button) findViewById(R.id.buttonPageMasuk);
        buttonMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                theirName = name.getText().toString();
                Intent i = null;
                i = new Intent(HalamanMasuk.this,HalamanUtama.class);
                Bundle b = new Bundle();
                b.putString("parse_nama",theirName);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}