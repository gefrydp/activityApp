package com.mitramas.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mitramas.pretest.request.Daftar;
import com.mitramas.pretest.retrofit.RetrofitClient;
import com.mitramas.pretest.retrofit.RetrofitClientInstance;

import java.time.Duration;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HalamanDaftar extends AppCompatActivity {
    Button buttonDaftar;
    private EditText editTextEmail;
    private EditText editTextNama;
    private EditText editTextPassword;
    private Daftar mApiService;
    private String email, nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_daftar);
        mApiService= RetrofitClientInstance.getApiService();

        buttonDaftar = (Button) findViewById(R.id.buttonPageDaftar);
        editTextEmail = (EditText) findViewById(R.id.emailEditText);
        editTextNama = (EditText) findViewById(R.id.namaEditText);
        editTextPassword = (EditText) findViewById(R.id.passwordEditText);
        buttonDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daftarPengguna();

                nama = editTextNama.getText().toString();
                email = editTextEmail.getText().toString();
                password = editTextPassword.getText().toString();
                mApiService.postDaftar(nama, email, password).enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
                Toast.makeText(getApplicationContext(),"Data Tersimpan", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void daftarPengguna(){
        Intent intentDaftarPengguna = new Intent(this, HalamanMasuk.class);
        startActivity(intentDaftarPengguna);
    }
}