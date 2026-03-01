package com.example.laboratorio1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class RegistroActivity extends AppCompatActivity {

    TextInputLayout NombresInputField;
    TextInputLayout ApellidosInputField;
    TextInputLayout CorroeInputField;
    TextInputLayout PasswordInputField;
    TextInputLayout PasswordConfirmedInputField;

    TextView BackToLoginTextView;
    Button BtnGotoRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resgistro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        NombresInputField = findViewById(R.id.textInputLayoutNombres);
        ApellidosInputField = findViewById(R.id.textInputLayoutApellidos);
        CorroeInputField = findViewById(R.id.textInputLayoutCorreoRegister);
        PasswordInputField = findViewById(R.id.textInputLayoutPasswordRegister);
        PasswordConfirmedInputField = findViewById(R.id.textInputLayoutPasswordConfirmedRegister);

        BackToLoginTextView = findViewById(R.id.BackToLogin);
        BtnGotoRegister = findViewById(R.id.BtnRegistrar);
        BackToLoginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistroActivity.this, MainActivity.class));
            }
        });
    }

//    public void Register() {
//
//        String NombresInput = NombresInputField.getEditText().getText().toString();
//        String ApellidosInput = ApellidosInputField.getEditText().getText().toString();
//        String CorreoInput = CorroeInputField.getEditText().getText().toString();
//        String PasswordInput = PasswordInputField.getEditText().getText().toString();
//        String ConfirmedPasswordInput = PasswordConfirmedInputField.getEditText().getText().toString();
//
//    }
}