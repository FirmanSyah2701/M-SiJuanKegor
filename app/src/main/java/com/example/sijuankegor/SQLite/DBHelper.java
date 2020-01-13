package com.example.sijuankegor.SQLite;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{
    protected static final String DATABASE_NAME = "sijuankegor";
    protected static final String TABLE_NAME = "user";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) { super(context, DATABASE_NAME, null, DATABASE_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String user = "CREATE TABLE IF NOT EXISTS user (username VARCHAR(20) NOT NULL, password VARCHAR(20) NOT NULL);";
        db.execSQL(user);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS " + TABLE_NAME + "";
        db.execSQL(sql);
        onCreate(db);
    }
}
