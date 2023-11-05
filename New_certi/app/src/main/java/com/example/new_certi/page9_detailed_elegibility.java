package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page9_detailed_elegibility extends AppCompatActivity {

    MediaPlayer mysound;
    ImageButton play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_page9_detailed_elegibility);
        super.onCreate(savedInstanceState);

        mysound=MediaPlayer.create(page9_detailed_elegibility.this,R.raw.eligibility);

        play =  findViewById(R.id.imageButton3);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mysound.start();
            }
        });

    }
    public void onBackPressed() {
        // Stop audio playback when the back button is pressed
        super.onBackPressed();
        mysound.stop();

    }
}