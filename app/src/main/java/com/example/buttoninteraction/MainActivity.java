package com.example.buttoninteraction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonShowToast = findViewById(R.id.button);
        buttonShowToast.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"This is text", Toast.LENGTH_SHORT).show();
            }
        });
    }
}