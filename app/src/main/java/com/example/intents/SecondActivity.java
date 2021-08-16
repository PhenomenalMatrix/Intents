package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = findViewById(R.id.save_btn);
        editText = findViewById(R.id.edit_text);

        button.setOnClickListener(v -> {
            String txt = editText.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("key",txt);
            setResult(RESULT_OK, intent);
            finish();
        });


    }
}