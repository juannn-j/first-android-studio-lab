package com.example.laboratorio1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    TextView RegisterTextView;
    TextInputLayout UserInputField;
    TextInputLayout PasswordInputField;
    Button ButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // estado dond eapensa se ejcuta, lo hara
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RegisterTextView = findViewById(R.id.textViewRegister);
        UserInputField = findViewById(R.id.textInputLayoutUser);
        PasswordInputField = findViewById(R.id.textInputLayoutPassword);
        ButtonLogin = findViewById(R.id.ButtonLogin);

        RegisterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegistroActivity.class));
            }
        });
        ButtonLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    public void Login() {
        String User = "test";
        String Pass = "password";

        String userInput = UserInputField.getEditText().getText().toString();
        String passInput = PasswordInputField.getEditText().getText().toString();

        if (userInput.equals(User) && passInput.equals(Pass)) {
            startActivity(new Intent(MainActivity.this, DashboardActivity.class));
        } else {
            UserInputField.setError("Ingresa un usuario valido");
            PasswordInputField.setError("Ingresa una contraseña valida");
        }

    }
}