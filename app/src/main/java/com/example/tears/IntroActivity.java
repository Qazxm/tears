package com.example.tears;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro); // intro.xml로 변경

        // 3초 뒤에 MainActivity로 이동
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainActivityIntent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
                finish(); // IntroActivity 종료
            }
        }, 3000); // 3초 뒤에 실행될 코드
    }
}

