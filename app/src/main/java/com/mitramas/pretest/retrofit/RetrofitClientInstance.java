package com.mitramas.pretest.retrofit;

import com.mitramas.pretest.request.Daftar;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    public static final String BASE_URL="https://192.168.68.125:3000/";
    public static Daftar getApiService(){
        return RetrofitClient.getClient(BASE_URL).create(Daftar.class);
    }
}
