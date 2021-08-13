package com.example.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),NumbersActivity.class);
            startActivity(intent);
        });
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),FamilyActivity.class);
            startActivity(intent);
        });
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),ColorsActivity.class);
            startActivity(intent);
        });
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),PhrasesActivity.class);
            startActivity(intent);
        });
    }
}