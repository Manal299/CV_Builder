package com.example.l215250_a2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EducationActivity extends AppCompatActivity {
    private EditText educationInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        educationInput = findViewById(R.id.educationInput);
    }

    public void saveEducation(View view) {
        // Save logic here
        finish();
    }

    public void cancel(View view) {
        finish();
    }
}
