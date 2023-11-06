
        package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.new_certi.R;
import com.example.new_certi.page12;

public class page11 extends AppCompatActivity {

    private Button button;
    Button gallery;
    EditText userName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        button = findViewById(R.id.button19);

        gallery=findViewById(R.id.gallery7);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();



            }
        });


    }
    public void openActivity2(){
        Intent intent = new Intent(this, page12.class);
        startActivity(intent);
    }
}