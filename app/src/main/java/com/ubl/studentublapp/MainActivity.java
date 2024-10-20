package com.ubl.studentublapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fullNameText = findViewById(R.id.fullName);
        EditText usernameText = findViewById(R.id.username);
        EditText emailText = findViewById(R.id.email);
        TextView txtResultView = findViewById(R.id.txtResult);
        Button btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullNameValue = fullNameText.getText().toString();
                String username = usernameText.getText().toString();
                String email = emailText.getText().toString();
                txtResultView.setText("Registration Success!! \n" +
                        "Full Name:\t" + fullNameValue + "\nUsername : " +
                        username + "\nEmail:" + email);
            }
        });

    }
}