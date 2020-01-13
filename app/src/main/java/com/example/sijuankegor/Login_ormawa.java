package com.example.sijuankegor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sijuankegor.Model.User;

public class Login_ormawa extends AppCompatActivity {
    EditText etUsername, etPassword;
    Context mContext;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ormawa);
        etUsername = findViewById(R.id.txtusername);
        etPassword = findViewById(R.id.txtpassword);
        btnLogin = findViewById(R.id.btn_login);

        mContext = this;
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final User user = User.getInstance();

                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();
                if(username.isEmpty()){
                    etUsername.setError("Username tidak boleh kosong");
                }else if(password.isEmpty()){
                    etPassword.setError("Password tidak boleh kosong");
                } else{
                    user.login(username, password, mContext);
                }
            }
        });
    }
}
