package com.example.canvastest;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class JoystickGestureDetectorListener extends GestureDetector.SimpleOnGestureListener {


    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return super.onDoubleTap(e);
    }




}
