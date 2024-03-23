package com.example.tears;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tears.R;

public class Secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        ImageButton purpose_button = findViewById(R.id.purpose_button);
        purpose_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Purpose.class);
                startActivity(intent);
            }
        });

        ImageButton way_button =  findViewById(R.id.way_button);
        way_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Howtouse.class);
                startActivity(intent);
            }
        });
        ImageButton measure_button =  findViewById(R.id.measure_button);
        measure_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Measurestart.class);
                startActivity(intent);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton list_button =  findViewById(R.id.list_button);
        list_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });




    }
}