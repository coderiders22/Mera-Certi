package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class page2 extends AppCompatActivity {

    private Button button;
    Context context;
    ImageView nointernet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        nointernet = findViewById(R.id.nointernet);

        if (!isConnected()){
            nointernet.setVisibility(View.VISIBLE);
            Toast.makeText( page2.this, "No Internet Access",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText( page2.this,"Welcome to Mera Certi", Toast.LENGTH_SHORT).show();
        }

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    private boolean isConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();

    }

    public void openActivity2(){
        Intent intent = new Intent(this, page3.class);
        startActivity(intent);
    }
}