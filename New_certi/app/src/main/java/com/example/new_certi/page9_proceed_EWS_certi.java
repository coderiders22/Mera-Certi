package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.Button;

public class page9_proceed_EWS_certi extends AppCompatActivity {

    private Button button;
    Button gallery;
    Button gallery2;
    Button gallery3;
    Button gallery4;
    Button gallery5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9_proceed_ews_certi);

        gallery=findViewById(R.id.gallery);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(intent);
            }
        });

        gallery2=findViewById(R.id.gallery2);
        gallery2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(intent);
            }
        });

        gallery3=findViewById(R.id.gallery3);
        gallery3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(intent);
            }
        });

        gallery4=findViewById(R.id.gallery4);
        gallery4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(intent);
            }
        });

        gallery5=findViewById(R.id.gallery5);
        gallery5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(intent);
            }
        });


        button = findViewById(R.id.button17_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });





    }



    public void openActivity2(){
        Intent intent = new Intent(this, page10.class);
        startActivity(intent);
    }
}