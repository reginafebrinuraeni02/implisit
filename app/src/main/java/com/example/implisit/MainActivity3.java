package com.example.implisit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button Next;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Next = findViewById(R.id.button4);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(act);
            }
        });
    }
}