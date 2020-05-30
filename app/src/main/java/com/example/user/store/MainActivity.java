package com.example.user.store;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;


public class MainActivity extends Activity implements View.OnClickListener{

    Button button;
    Button button2;
    Button button3;
    ImageView animal;
    ImageView animal2;
    ImageView animal3;
    ImageView animal4;
    ImageView animal5;
    ImageView animal6;
    ImageView animal7;
    ImageView animal8;
    ImageView animal9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 버튼 변수
        button = (Button)findViewById(R.id.tab_first);
        button2 = (Button)findViewById(R.id.tab_second);
        button3 = (Button)findViewById(R.id.tab_third);
        animal = (ImageView)findViewById(R.id.animal) ;
        animal2 = (ImageView)findViewById(R.id.animal2) ;
        animal3 = (ImageView)findViewById(R.id.animal3) ;
        animal4 = (ImageView)findViewById(R.id.animal4) ;
        animal5 = (ImageView)findViewById(R.id.animal5) ;
        animal6 = (ImageView)findViewById(R.id.animal6) ;
        animal7 = (ImageView)findViewById(R.id.animal7) ;
        animal8 = (ImageView)findViewById(R.id.animal8) ;
        animal9 = (ImageView)findViewById(R.id.animal9) ;

        // 버튼에 이벤트 지정
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        animal.setOnClickListener(this);
        animal2.setOnClickListener(this);
        animal3.setOnClickListener(this);
        animal4.setOnClickListener(this);
        animal5.setOnClickListener(this);
        animal6.setOnClickListener(this);
        animal7.setOnClickListener(this);
        animal8.setOnClickListener(this);
        animal9.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.animal:
            case R.id.animal2:
            case R.id.animal3:
            case R.id.animal4:
            case R.id.animal5:
            case R.id.animal6:
            case R.id.animal7:
            case R.id.animal8:
            case R.id.animal9:

             final EditText etEdit = new EditText(this);
             AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
             dialog.setTitle("입력");
             dialog.setView(etEdit);
             // OK 버튼 이벤트
             dialog.setPositiveButton("시작", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String inputValue = etEdit.getText().toString();
                    Intent intent4 = new Intent(getApplicationContext(), timer.class);
                    intent4.putExtra("String",inputValue);
                    startActivity(intent4);
                }
            });
            // Cancel 버튼 이벤트
            dialog.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            dialog.show();
            break;
            case R.id.tab_first:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0, 0);
                break;

            case R.id.tab_second:
                Intent intent2 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent2);
                finish();
                overridePendingTransition(0, 0);
                break;

            case R.id.tab_third:
                Intent intent3 = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent3);
                finish();
                overridePendingTransition(0, 0);
                break;

        }
    }
}
