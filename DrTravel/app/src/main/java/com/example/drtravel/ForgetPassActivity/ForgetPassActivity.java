package com.example.drtravel.ForgetPassActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.drtravel.R;

public class ForgetPassActivity extends AppCompatActivity {
    Button proses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        proses = (Button)findViewById(R.id.btn_proceses_email);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesemail(v);
            }
        });
    }

    public void prosesemail(View view) {
        Intent keprosesemail = new Intent(ForgetPassActivity.this, ForgetPassActivity2.class);
        startActivity(keprosesemail);
    }
}
