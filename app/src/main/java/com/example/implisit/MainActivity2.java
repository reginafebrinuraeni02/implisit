package com.example.implisit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button Next;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Next = findViewById(R.id.button5);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(act);
            }
        });
    }
}