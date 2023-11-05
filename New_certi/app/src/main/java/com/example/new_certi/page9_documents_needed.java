package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page9_documents_needed extends AppCompatActivity {
    MediaPlayer mysound;
    ImageButton play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_page9_documents_needed);
        super.onCreate(savedInstanceState);
        mysound=MediaPlayer.create(page9_documents_needed.this,R.raw.documents_needed);

        play =  findViewById(R.id.imageButton4);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mysound.start();
            }
        });

    }
}