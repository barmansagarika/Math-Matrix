package com.example.mathmatrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View view){
        EditText editText = findViewById(R.id.editTextNumber);
        String numberStr = editText.getText().toString();

        if (TextUtils.isEmpty(numberStr)) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            return;
        }
        int number = Integer.parseInt(numberStr);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("number", number);
        startActivity(intent);
    }
}