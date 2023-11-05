package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class page7 extends AppCompatActivity {

    private Button button;
    MediaPlayer mysound;
     ImageButton play;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mysound=MediaPlayer.create(page7.this,R.raw.page7);
        setContentView(R.layout.activity_page7);
        button = findViewById(R.id.button9);
        play =  findViewById(R.id.imageButton2);
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
    }
    public void openActivity2(){
        Intent intent = new Intent(this, page8.class);
        startActivity(intent);
    }
    public void chose_certi(View v){
        mysound.start();


    }
    public void onBackPressed() {
        // Stop audio playback when the back button is pressed
        super.onBackPressed();
        mysound.stop();

    }
}