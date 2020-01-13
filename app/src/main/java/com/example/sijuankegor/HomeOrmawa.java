package com.example.sijuankegor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeOrmawa extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ormawa);
        bottomNavigationView = findViewById(R.id.navigation);
        imageButton = findViewById(R.id.btnTambah);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeOrmawa.this, Form_pengajuan.class);
                startActivity(intent);
            }
        });

        BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new
                BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_riwayat:


                }
                return false;
            }
        };
    }
}
