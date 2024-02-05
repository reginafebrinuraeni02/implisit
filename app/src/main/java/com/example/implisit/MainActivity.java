package com.example.implisit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnprofile, btnkonversi, btnshare, btnback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnprofile=(Button) findViewById(R.id.btnprofile);
        btnkonversi=(Button) findViewById(R.id.btnkonversi);
        btnshare=(Button) findViewById(R.id.btnshare);
        btnback=(Button) findViewById(R.id.btnback);


        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });

        btnkonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
            }
        });

        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentShare = new Intent();
                intentShare.setAction(Intent.ACTION_SEND);
                String value;
                String halo = "Halo! Ini RERE.";
                Intent intent = intentShare.putExtra(Intent.EXTRA_TEXT, value="Halo! Ini RERE.");
                intentShare.setType("text/plain");

                if(intentShare.resolveActivity(getPackageManager()) != null){
                    startActivity(intentShare);
                }

            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity4.class));
            }
        });

    }


}