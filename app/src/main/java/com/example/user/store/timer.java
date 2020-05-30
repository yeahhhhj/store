package com.example.user.store;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        Intent intent4 = getIntent(); //이전 액티비티에서 수신할 데이터를 받기위해 선언
        String Receive = intent4.getStringExtra("String");       //호출한 액티비티에서 String 이라는 키 값을 가진 데이터 로드
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(Receive);

    }
}
