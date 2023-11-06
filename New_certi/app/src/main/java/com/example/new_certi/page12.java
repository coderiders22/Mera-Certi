package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class page12 extends AppCompatActivity {

    private Button button,button2;


    EditText editText,editText2,editText3,editText4,editText5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12);
        button = findViewById(R.id.button20);
        editText = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editText3 = findViewById(R.id.editTextText3);
        editText4 = findViewById(R.id.editTextText4);
        editText5 = findViewById(R.id.editTextText5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (TextUtils.isEmpty(editText.getText().toString())) {
                    editText.setError("field required");
                    return;

                }
                else if (TextUtils.isEmpty(editText2.getText().toString())) {
                    editText2.setError("field required");
                    return;

                }
                else if (TextUtils.isEmpty(editText3.getText().toString())) {
                    editText3.setError("field required");
                    return;

                }
                else if (TextUtils.isEmpty(editText4.getText().toString())) {
                    editText4.setError("field required");
                    return;

                }
                else if (TextUtils.isEmpty(editText5.getText().toString())) {
                    editText5.setError("field required");
                    return;


                }
                else{
                    openActivity2();
                }
            }

        });
        button2=findViewById(R.id.addmember);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page12.this, page12.class);
                startActivity(intent);

            }
        });

    }
    public void openActivity2(){
        Intent intent = new Intent(this, page13.class);
        startActivity(intent);
    }
}