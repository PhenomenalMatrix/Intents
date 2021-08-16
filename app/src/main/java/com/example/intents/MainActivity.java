package com.example.intents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.main_tv);
        button = findViewById(R.id.start_btn);
        Intent intent = new Intent(this, SecondActivity.class);
        button.setOnClickListener(v ->{
            startActivityForResult(intent,1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 1  && data != null){
            String txt = data.getStringExtra("key");
            textView.setText(txt);
        }else {
            Toast.makeText(getBaseContext(),"Error",Toast.LENGTH_SHORT).show();
        }
    }
}