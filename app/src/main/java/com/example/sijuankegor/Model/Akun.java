package com.example.sijuankegor.Model;

import com.google.gson.annotations.SerializedName;

public class Akun {
    @SerializedName("kd_akun")
    private String kd_akun;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("nama_pengguna")
    private String nama_pengguna;
    @SerializedName("level")
    private String level;

    public String getKd_akun() {
        return kd_akun;
    }

    public void setKd_akun(String kd_akun) {
        this.kd_akun = kd_akun;
    }

    public String getNama_pengguna() {
        return nama_pengguna;
    }

    public void setNama_pengguna(String nama_pengguna) {
        this.nama_pengguna = nama_pengguna;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
