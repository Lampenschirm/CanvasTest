package com.example.canvastest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;

public class MainActivity extends AppCompatActivity {
 protected GestureDetector joystickGestureDetectorListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewCustomObject circle =  findViewById(R.id.Circle);
        joystickGestureDetectorListener = new GestureDetector(this, new JoystickGestureDetectorListener());
    }
}
