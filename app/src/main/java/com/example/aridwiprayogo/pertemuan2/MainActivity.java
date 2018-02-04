package com.example.aridwiprayogo.pertemuan2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.aridwiprayogo.pertemuan2";

    EditText username, password;
    Button btn_login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);

        btn_login = findViewById(R.id.btn_login);

        final String usrnm = username.getText().toString();
        final String pass = password.getText().toString();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usrnm.equals("admin") && pass.equals("admin")) {

                    Intent intent = new Intent(MainActivity.this, HalamanBaru.class);
                    startActivity(intent);
                }
            }
        });

    }



}
