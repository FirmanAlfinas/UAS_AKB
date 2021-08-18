package com.example.uas_akb.activities.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.uas_akb.R;
import com.example.uas_akb.activities.fragment.WeatherFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity, new WeatherFragment()).commit();
    }
}
