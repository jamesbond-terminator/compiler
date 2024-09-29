package com.jamesbon.cmpiler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class forgotpass extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextVerificationCode;
    private EditText editTextNewPassword;
    private EditText editTextConfirmPassword;
    private Button buttonSendCode;
    private Button buttonVerifyCode;
    private Button buttonResetPassword;
    private TextView textViewResendCode;

    private String verificationCode = "123456"; // Simulated verification code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextVerificationCode = findViewById(R.id.editTextVerificationCode);
        editTextNewPassword = findViewById(R.id.editTextNewPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        buttonSendCode = findViewById(R.id.buttonSendCode);
        buttonVerifyCode = findViewById(R.id.buttonVerifyCode);
        buttonResetPassword = findViewById(R.id.buttonResetPassword);
        textViewResendCode = findViewById(R.id.textViewResendCode);

        buttonSendCode.setOnClickListener(v -> sendVerificationCode());
        buttonVerifyCode.setOnClickListener(v -> verifyCode());
        buttonResetPassword.setOnClickListener(v -> resetPassword());
        textViewResendCode.setOnClickListener(v -> sendVerificationCode());
    }

    private void sendVerificationCode() {
        String email = editTextEmail.getText().toString().trim();

        if (email.isEmpty()) {
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
            return;
        }

        // Simulate sending the verification code (you would typically call an API here)
        Toast.makeText(this, "Verification code sent to " + email, Toast.LENGTH_SHORT).show();
        showVerificationFields();
    }

    private void showVerificationFields() {
        findViewById(R.id.layoutEmail).setVisibility(View.GONE);
        findViewById(R.id.layoutCode).setVisibility(View.VISIBLE);
        findViewById(R.id.layoutResetPassword).setVisibility(View.GONE);
    }

    private void verifyCode() {
        String enteredCode = editTextVerificationCode.getText().toString().trim();

        if (!enteredCode.equals(verificationCode)) {
            Toast.makeText(this, "Invalid verification code", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Code verified successfully", Toast.LENGTH_SHORT).show();
        showResetPasswordFields();
    }

    private void showResetPasswordFields() {
        findViewById(R.id.layoutEmail).setVisibility(View.GONE);
        findViewById(R.id.layoutCode).setVisibility(View.GONE);
        findViewById(R.id.layoutResetPassword).setVisibility(View.VISIBLE);
    }

    private void resetPassword() {
        String newPassword = editTextNewPassword.getText().toString().trim();
        String confirmPassword = editTextConfirmPassword.getText().toString().trim();

        if (!newPassword.equals(confirmPassword)) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            return;
        }

        // Here, add the logic to update the password (e.g., API call)
        Toast.makeText(this, "Password reset successfully", Toast.LENGTH_SHORT).show();
        finish(); // Close this activity
    }
}
