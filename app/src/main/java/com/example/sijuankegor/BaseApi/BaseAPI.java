package com.example.sijuankegor.BaseApi;

import com.example.sijuankegor.Model.Pengajuan;
import com.example.sijuankegor.Model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BaseAPI {

    @FormUrlEncoded
    @POST("user/login")
    Call<User> login(
            @Field("username") String username,
            @Field("password") String password
    );

    /*
    @FormUrlEncoded
    @POST("pembina/login")
    Call<User> login(
            @Field("username") String username,
            @Field("password") String password
    );
    */

    @FormUrlEncoded
    @POST("pengajuan")
    Call<Pengajuan> addPengajuan(
            @Field("kd_pengajuan") String kd_pengajuan,
            @Field("nama_kegiatan") String nama_kegiatan,
            @Field("tanggal") String tanggal,
            @Field("kd_user") String kd_user,
            @Field("kd_validasi") String kd_validasi
    );

}
