package com.example.mathmatrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView4 = findViewById(R.id.textView4);
        int number = getIntent().getIntExtra("number", 0);
        openActivity(number);
    }
    private void openActivity(int number) {
        StringBuilder tableBuilder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            tableBuilder.append(String.format("%d x %d = %d\n", number, i, number * i));
        }
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(tableBuilder.toString());
    }
}