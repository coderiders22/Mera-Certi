package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page9_step_wise_procedure extends AppCompatActivity {
    MediaPlayer mysound;
    ImageButton play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_page9_step_wise_procedure);
        super.onCreate(savedInstanceState);
        mysound=MediaPlayer.create(page9_step_wise_procedure.this,R.raw.step_wise_procedure);

        play =  findViewById(R.id.imageButton6);
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