package com.example.l215250_a2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {
    private EditText summaryInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        summaryInput = findViewById(R.id.summaryInput);
    }

    public void saveSummary(View view) {
        // Save summary logic here (SharedPreferences/Database)
        finish(); // Closes activity and returns to home
    }

    public void cancel(View view) {
        finish();
    }
}
