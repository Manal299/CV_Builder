package com.example.l215250_a2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ReferencesActivity extends AppCompatActivity {
    private EditText referencesInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_references);

        referencesInput = findViewById(R.id.referencesInput);
    }

    public void saveReferences(View view) {
        finish();
    }

    public void cancel(View view) {
        finish();
    }
}
