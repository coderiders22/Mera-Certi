package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class page8 extends AppCompatActivity {

    private Button button;
    MediaPlayer mysound;
    ImageButton play;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mysound=MediaPlayer.create(page8.this,R.raw.detailed_section);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
        button = findViewById(R.id.button10);
        play =  findViewById(R.id.imageButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound.stop();
                openActivity2();
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound.start();
            }
        });

        button = findViewById(R.id.button10_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound.stop();
                openActivity3();
            }
        });

        button = findViewById(R.id.button10_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound.stop();
                openActivity4();
            }
        });

        button = findViewById(R.id.button10_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound.stop();
                openActivity5();
            }
        });

        button = findViewById(R.id.button10_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mysound.stop();
                openActivity6();
            }
        });


    }
    public void openActivity2(){
        Intent intent = new Intent(this, page9_detailed_elegibility.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, page9_step_wise_procedure.class);
        startActivity(intent);
    }
    public void onBackPressed() {
        // Stop audio playback when the back button is pressed
        super.onBackPressed();
        mysound.stop();

    }

    public void openActivity4(){
        Intent intent = new Intent(this, page9_documents_needed.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent = new Intent(this, page9_proceed_EWS_certi.class);
        startActivity(intent);
    }

    public void openActivity6(){
        Intent intent = new Intent(this, page9_check_status.class);
        startActivity(intent);
    }
    public void chose_certi(View v){
        mysound.start();


    }


}