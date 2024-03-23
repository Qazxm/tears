package com.example.tears;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton back4_button = (ImageButton) findViewById(R.id.back4_button);
        back4_button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Measurestart.class);
                startActivity(intent);
            }
        });



    }
}