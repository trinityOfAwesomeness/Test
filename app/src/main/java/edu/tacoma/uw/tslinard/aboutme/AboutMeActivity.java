package edu.tacoma.uw.tslinard.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        TextView aboutTextView = findViewById(R.id.about_text_view);
        aboutTextView.setText("Name: Tatiana Linardopoulou\nGraduating Year: 2021\nFavorite Class: TCSS343");
    }
}