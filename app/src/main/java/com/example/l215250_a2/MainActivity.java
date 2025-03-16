package com.example.l215250_a2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view) {
        Class<?> targetActivity = null;

        // ✅ Using if-else instead of switch-case
        if (view.getId() == R.id.btnProfile) {
            targetActivity = ProfileActivity.class;
        } else if (view.getId() == R.id.btnSummary) {
            targetActivity = SummaryActivity.class;
        } else if (view.getId() == R.id.btnEducation) {
            targetActivity = EducationActivity.class;
        } else if (view.getId() == R.id.btnExperience) {
            targetActivity = ExperienceActivity.class;
        } else if (view.getId() == R.id.btnCertifications) {
            targetActivity = CertificationsActivity.class;
        } else if (view.getId() == R.id.btnReferences) {
            targetActivity = ReferencesActivity.class;
        }

        // Start the selected activity if it's not null
        if (targetActivity != null) {
            startActivity(new Intent(this, targetActivity));
        }
    }
}
