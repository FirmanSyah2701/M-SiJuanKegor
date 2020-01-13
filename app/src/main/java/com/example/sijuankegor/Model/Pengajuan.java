package com.example.sijuankegor.Model;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.sijuankegor.BaseApi.RetrofitClient;
import com.example.sijuankegor.HomeOrmawa;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Pengajuan {
    private String kd_pengajuan;
    private String nama_kegiatan;
    private String tanggal;
    private String kd_user;
    private String kd_validasi;

    private static Pengajuan pengajuan;
    private Pengajuan(){}
    public static Pengajuan getInstance(){
        if(pengajuan == null){
            pengajuan = new Pengajuan();
        }
        return pengajuan;
    }

    public void addPengajuan(final String kd_pengajuan, final String nama_kegiatan, final String tanggal,
                             String kd_user, String kd_validasi, final Context context){
        this.kd_pengajuan = kd_pengajuan;
        this.nama_kegiatan = nama_kegiatan;
        this.tanggal = tanggal;
        User user = User.getInstance();
        this.kd_user = kd_user;
        //this.kd_user = kd_user;
        this.kd_validasi = kd_validasi;

        Toast.makeText(context, tanggal + " " +nama_kegiatan + " " + kd_pengajuan + " " + kd_user + " " + kd_validasi, Toast.LENGTH_SHORT).show();

        Call<Pengajuan> call = RetrofitClient.getInstance().baseAPI().addPengajuan(kd_pengajuan, nama_kegiatan, tanggal, kd_user, kd_validasi);
        call.enqueue(new Callback<Pengajuan>() {
            @Override
            public void onResponse(Call<Pengajuan> call, Response<Pengajuan> response) {

                Intent intent = new Intent(context, HomeOrmawa.class);
                context.startActivity(intent);

            }

            @Override
            public void onFailure(Call<Pengajuan> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public String getKd_pengajuan() {
        return kd_pengajuan;
    }

    public void setKd_pengajuan(String kd_pengajuan) {
        this.kd_pengajuan = kd_pengajuan;
    }

    public String getNama_kegiatan() {
        return nama_kegiatan;
    }

    public void setNama_kegiatan(String nama_kegiatan) {
        this.nama_kegiatan = nama_kegiatan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKd_user() {
        return kd_user;
    }

    public void setKd_user(String kd_user) {
        this.kd_user = kd_user;
    }

    public String getKd_validasi() {
        return kd_validasi;
    }

    public void setKd_validasi(String kd_validasi) {
        this.kd_validasi = kd_validasi;
    }
}
