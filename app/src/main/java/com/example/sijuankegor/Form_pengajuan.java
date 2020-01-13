package com.example.sijuankegor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.sijuankegor.Model.Pengajuan;
import com.example.sijuankegor.Model.User;

public class Form_pengajuan extends AppCompatActivity {
    Button btnBatal, btnSubmit;
    ImageButton imgButton;
    Context mContext;
    EditText etKd, etNama, etTanggal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pengajuan);

        etKd = findViewById(R.id.edit_kdpengajuan);
        etNama = findViewById(R.id.edit_nama);
        etTanggal = findViewById(R.id.edit_tanggal);
        btnBatal = findViewById(R.id.btn_batal);
        btnSubmit = findViewById(R.id.btn_submit);
        imgButton = findViewById(R.id.imgBtnKembali);
        mContext = this;

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Pengajuan pengajuan = Pengajuan.getInstance();

                final String kd_pengajuan = etKd.getText().toString();
                final String nama = etNama.getText().toString();
                final String tanggal = etTanggal.getText().toString();
                User user = User.getInstance();
                //String kd_user = pengajuan.getKd_user();
                //String kd_validasi = pengajuan.getKd_validasi();

                pengajuan.addPengajuan(kd_pengajuan, nama, tanggal, "orm1", "v002", mContext);


            }
        });

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form_pengajuan.this, HomeOrmawa.class);
                startActivity(intent);
            }
        });
        btnBatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form_pengajuan.this, HomeOrmawa.class);
                startActivity(intent);
            }
        });
    }
}
