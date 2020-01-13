package com.example.sijuankegor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_login extends AppCompatActivity {
    Button btnOrmawa;
    Button btnPembina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);

        btnOrmawa = findViewById(R.id.btn_ormawa);
        btnOrmawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_login.this, Login_ormawa.class);
                startActivity(intent);
            }
        });
    }
}
