
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
    EditText editText,editText2,editText3,editText4,editText5;






    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        button = findViewById(R.id.button19);
        editText = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editText3 = findViewById(R.id.editTextText3);
        editText4 = findViewById(R.id.editTextText4);
        editText5 = findViewById(R.id.editTextText5);



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


    }
    public void openActivity2(){
        Intent intent = new Intent(page11.this, page12.class);
        startActivity(intent);
    }
}