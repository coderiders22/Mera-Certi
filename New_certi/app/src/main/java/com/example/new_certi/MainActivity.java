package com.example.new_certi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private String verificationId;
    FirebaseUser firebaseUser;

    private EditText phoneNumberEditText;
    private EditText otpEditText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        otpEditText = findViewById(R.id.otpEditText);
    }

    public void sendOTP(View view) {
        String phoneNumber = phoneNumberEditText.getText().toString();

        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phoneNumber,
                60,                // Timeout duration
                TimeUnit.SECONDS,  // Timeout units
                this,             // Activity (for callbacks)
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    @Override
                    public void onCodeSent(String verificationId, PhoneAuthProvider.ForceResendingToken token) {
                        // The SMS verification code has been sent to the provided phone number
                        // Store the verificationId somewhere as you'll need it later for verification
                        MainActivity.this.verificationId = verificationId;
                    }

                    @Override
                    public void onVerificationCompleted(PhoneAuthCredential credential) {
                        // Automatically verified if the device has received the SMS code
                    }

                    @Override
                    public void onVerificationFailed(FirebaseException e) {
                        // Handle errors here (e.g., invalid phone number)
                    }
                });
    }

    public void verifyOTP(View view) {
        String otp = otpEditText.getText().toString();
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, otp);

        auth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if (task.isSuccessful()) {
                            Intent intent = new Intent(MainActivity.this, page3.class);
                            Toast.makeText( MainActivity.this, "Verification success",Toast.LENGTH_SHORT).show();
                            // User is signed in successfully
                        } else {
                            Toast.makeText(MainActivity.this,"Verification failed",Toast.LENGTH_SHORT).show();
                            // Verification failed
                        }
                    }
                });
    }
}



