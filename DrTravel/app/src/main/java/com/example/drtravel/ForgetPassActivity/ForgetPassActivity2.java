package com.example.drtravel.ForgetPassActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.drtravel.LoginActivity.LoginActivity;
import com.example.drtravel.R;

public class ForgetPassActivity2 extends AppCompatActivity {
    Button Ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass2);

        Ok = (Button)findViewById(R.id.btn_Ok_lupa);
        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keAwal(v);
            }
        });
    }

    public void keAwal(View view) {
        Intent kelogin = new Intent(ForgetPassActivity2.this, LoginActivity.class);
        startActivity(kelogin);
    }
}
