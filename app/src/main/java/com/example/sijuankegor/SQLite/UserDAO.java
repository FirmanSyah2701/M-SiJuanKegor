package com.example.sijuankegor.SQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.sijuankegor.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO extends DBHelper {
    public UserDAO(Context context) { super(context);}

    public User getUser(){
        User user = User.getInstance();
        String sql = "SELECT * FROM user";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        String username, password;

        if(cursor.moveToFirst()){
            username = cursor.getString(cursor.getColumnIndex("username"));
            password = cursor.getString(cursor.getColumnIndex("password"));

            user.setUsername(username);
            user.setPassword(password);
        } else {
            return null;
        }
        return user;
    }

    public void setUser(String username, String password){
        String sql = "INSERT INTO user VALUES('" + username + "', '" + password + "');";
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL(sql);
    }

    public void setStatus(){
        String sql = "UPDATE user SET status='1' ";
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL(sql);
    }

}
