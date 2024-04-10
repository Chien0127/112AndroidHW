package com.example.login;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Login Failed! Please input your username.", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Login Failed! Please input your password.", Toast.LENGTH_SHORT).show();
                }else{
                    String expectedUsername = "your_username";
                    String expectedPassword = "your_password";
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
