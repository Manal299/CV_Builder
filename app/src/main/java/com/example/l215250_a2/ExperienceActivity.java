package com.example.l215250_a2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ExperienceActivity extends AppCompatActivity {
    private EditText experienceInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        experienceInput = findViewById(R.id.experienceInput);
    }

    public void saveExperience(View view) {
        finish();
    }

    public void cancel(View view) {
        finish();
    }
}
