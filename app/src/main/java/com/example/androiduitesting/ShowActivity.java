package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity that displays the name of the city the user clicked on.
 * Provides a back button to return to MainActivity.
 */
public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameTextView = findViewById(R.id.textViewCityName);
        Button backButton = findViewById(R.id.buttonBack);

        // Receive data from MainActivity
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("city_name");
        cityNameTextView.setText(cityName);

        // Go back to MainActivity
        backButton.setOnClickListener(v -> {
            finish(); // closes ShowActivity and returns to MainActivity
        });
    }
}
