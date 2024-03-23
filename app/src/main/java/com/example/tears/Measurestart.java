package com.example.tears;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Measurestart extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.measurestart);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton back3_button = (ImageButton) findViewById(R.id.back3_button);
        back3_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Secondpage.class);
                startActivity(intent);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton measurestart_button =  findViewById(R.id.measurestart_button);
        measurestart_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Result.class);
                startActivity(intent);
            }
        });



    }
}