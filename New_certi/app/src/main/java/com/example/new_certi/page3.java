package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page3 extends AppCompatActivity {

    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button = findViewById(R.id.button4_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

    }
    public void openActivity2(){
        Intent intent = new Intent(this, page4.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, page6.class);
        startActivity(intent);
    }
}