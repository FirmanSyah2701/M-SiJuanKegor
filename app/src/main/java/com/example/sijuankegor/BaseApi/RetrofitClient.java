package com.example.sijuankegor.BaseApi;

import com.example.sijuankegor.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient{

    private static final String BASE_URL = BuildConfig.BASE_URL;

    private static RetrofitClient mInstance;
    private static Retrofit retrofit;

    private RetrofitClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance() {
        if(mInstance == null){
            mInstance = new RetrofitClient();
        }
        return  mInstance;
    }

    public BaseAPI baseAPI() { return retrofit.create(BaseAPI.class);}
}