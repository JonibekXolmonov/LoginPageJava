package com.example.loginpagejava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initViews();
    }

    private void initViews() {
        findViewById(R.id.tv_sign_in).setOnClickListener(v -> openSignInPage());

        findViewById(R.id.btn_sign_up).setOnClickListener(v -> openHomeActivity());
    }

    private void openHomeActivity() {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    private void openSignInPage() {
        startActivity(new Intent(this, SignInActivity.class));
        finish();
    }
}