package com.example.l215250_a2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class CertificationsActivity extends AppCompatActivity {
    private EditText certificationsInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certifications);

        certificationsInput = findViewById(R.id.certificationsInput);
    }

    public void saveCertifications(View view) {
        finish();
    }

    public void cancel(View view) {
        finish();
    }
}
