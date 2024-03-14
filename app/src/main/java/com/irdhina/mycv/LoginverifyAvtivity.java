package com.irdhina.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginverifyAvtivity extends AppCompatActivity {

    TextView tvUsername, tvPassword, tvAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginverify_avtivity);

        tvUsername = findViewById(R.id.tvUsername);
        tvPassword = findViewById(R.id.tvPassword);
        tvAge = findViewById(R.id.tvAge);

        Bundle bundle = getIntent().getExtras();
        tvUsername.setText(bundle.getString("username"));
        tvPassword.setText(bundle.getString("password"));
        tvAge.setText(bundle.getString("age"));
    }
}