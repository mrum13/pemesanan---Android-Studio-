package com.example.drtravel.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.drtravel.Dashboard.DashboardActivity;
import com.example.drtravel.ForgetPassActivity.ForgetPassActivity;
import com.example.drtravel.R;
import com.example.drtravel.RegisterActivity.RegisterActivity;

public class LoginActivity extends AppCompatActivity {
    TextView pass_salah;
    Button regis,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pass_salah = (TextView)findViewById(R.id.tv_lupapass);
        pass_salah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lupaPass(v);
            }
        });

        regis = (Button) findViewById(R.id.btn_daftar);
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regisAkun(v);
            }
        });

        login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dashboard(v);
            }
        });
    }

    public void lupaPass(View view) {
        Intent ke_lupa = new Intent(LoginActivity.this, ForgetPassActivity.class);
        startActivity(ke_lupa);
    }

    public void regisAkun(View view) {
        Intent keRegis = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(keRegis);
    }

    public void Dashboard(View view) {
        Intent keHome = new Intent(LoginActivity.this, DashboardActivity.class);
        startActivity(keHome);
    }
}
