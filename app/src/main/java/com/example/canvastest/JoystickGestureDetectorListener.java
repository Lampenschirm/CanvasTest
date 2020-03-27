package com.example.canvastest;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class JoystickGestureDetectorListener extends GestureDetector.SimpleOnGestureListener {

    private ViewCustomObject joyStick;
    JoystickGestureDetectorListener(ViewCustomObject viewCustomObject) {
        joyStick = viewCustomObject;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }


    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.i("Distanz","Distanz X: "+distanceX);
        joyStick.setInnerCirclePositionX(joyStick.getInnerCirclePositionX() - (int)distanceX);
        Log.i("Distanz","Distanz Y: "+distanceY);
        joyStick.setInnerCirclePositionY(joyStick.getInnerCirclePositionY()- (int)distanceY);
        Log.i("MotionEvent", "X-Koordinate Event1: "+e1.getX());
        Log.i("MotionEvent", "Y-Koordinate Event1: "+e1.getY());
        Log.i("MotionEvent", "X-Koordinate Event2: "+e1.getX());
        Log.i("MotionEvent", "Y-Koordinate Event2: "+e1.getY());
        return true;
        //return super.onScroll(e1, e2, distanceX, distanceY);
    }


}
