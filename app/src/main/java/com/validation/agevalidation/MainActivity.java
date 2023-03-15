package com.validation.agevalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextNumber);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=e1.getText().toString();
                if(value.isEmpty())
                {
                    e1.setError("Please Enter your age");
                }
                else
                {
                    int age=Integer.parseInt(value);
                    if(age>=18)
                    {
                        Toast.makeText(MainActivity.this, "Your are Valid for Vote", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Beta Ghar Jao", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}