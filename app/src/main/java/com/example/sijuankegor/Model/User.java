package com.example.sijuankegor.Model;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.sijuankegor.BaseApi.RetrofitClient;
import com.example.sijuankegor.Form_pengajuan;
import com.example.sijuankegor.HomeOrmawa;
import com.example.sijuankegor.Login_ormawa;
import com.example.sijuankegor.SQLite.UserDAO;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class User {
    private String kd_user;
    private String username;
    private String password;
    private String kd_ormawa;
    private String level;
    private String nama_ormawa;

    private static User user;
    private User(){}
    public static User getInstance(){
        if(user == null){
            user = new User();
        }
        return user;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getKd_user() {
        return kd_user;
    }

    public void setKd_user(String kd_user) {
        this.kd_user = kd_user;
    }

    public void setKd_ormawa(String kd_ormawa) {
        this.kd_ormawa = kd_ormawa;
    }

    public String getKd_ormawa() {
        return kd_ormawa;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setNama_ormawa(String nama_ormawa) {
        this.nama_ormawa = nama_ormawa;
    }

    public String getNama_ormawa() {
        return nama_ormawa;
    }

    public void login(final String username, final String password, final Context context){
        this.username = username;
        this.password = password;
        Toast.makeText(context, username, Toast.LENGTH_SHORT).show();
        //Toast.makeText(context, password, Toast.LENGTH_SHORT).show();
        Call<User> call = RetrofitClient.getInstance().baseAPI().login(username, password);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, final Response<User> response) {
                final UserDAO userDAO = new UserDAO(context);
                userDAO.setUser(username,password);
                Intent i = new Intent(context, HomeOrmawa.class);
                context.startActivity(i);

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
