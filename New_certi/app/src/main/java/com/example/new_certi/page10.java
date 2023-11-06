package com.example.new_certi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class page10 extends AppCompatActivity {

    private Button button;
    EditText editText,editText2,editText3,editText5,editText6,editText7;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);
        button = findViewById(R.id.button18);
        editText = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editText3 = findViewById(R.id.editTextText3);

        editText5 = findViewById(R.id.editTextText5);
        editText6 = findViewById(R.id.editTextText6);
        editText7 = findViewById(R.id.editTextText7);

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

                else if (TextUtils.isEmpty(editText5.getText().toString())) {
                    editText5.setError("field required");
                    return;

                }
                else if (TextUtils.isEmpty(editText6.getText().toString())) {
                    editText6.setError("field required");
                    return;

                }
                else if (TextUtils.isEmpty(editText7.getText().toString())) {
                    editText7.setError("field required");
                    return;

                }
                else{
                    openActivity2();
                }
            }
        });

    }
    public void openActivity2(){
        Intent intent = new Intent(this, page11.class);
        startActivity(intent);
    }

}
