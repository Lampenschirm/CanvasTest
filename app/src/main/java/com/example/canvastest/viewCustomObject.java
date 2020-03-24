package com.example.canvastest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class viewCustomObject extends View {

    Paint outerCircleColor;
    Paint innerCircleColor;
    private int outerCircleRadius = 0;
    private int innerCircleRadius = 0;
    private int innerCirclePositionX =0;
    private int innerCirclePositionY =0;
    private int outerCirclePositionX =0;
    private int outerCirclePositionY =0;

    public int getOuterCircleRadiusRadius() {
        return outerCircleRadius;
    }

    public void setOuterCircleRadius(int radius) {
        this.outerCircleRadius = radius;
        invalidate();
        requestLayout();
    }

    public int getInnerCircleRadius() {
        return innerCircleRadius;
    }

    public void setInnerCircleRadius(int innerCircleRadius) {
        this.innerCircleRadius = innerCircleRadius;
        invalidate();
        requestLayout();
    }



    public int getInnerCirclePositionX() {
        return innerCirclePositionX;
    }

    public void setInnerCirclePositionX(int innerCirclePositionX) {
        this.innerCirclePositionX = innerCirclePositionX;
        invalidate();
        requestLayout();
    }



    public int getInnerCirclePositionY() {
        return innerCirclePositionY;
    }

    public void setInnerCirclePositionY(int innerCirclePositionY) {
        this.innerCirclePositionY = innerCirclePositionY;
        invalidate();
        requestLayout();
    }



    public int getOuterCirclePositionX() {
        return outerCirclePositionX;
    }

    public void setOuterCirclePositionX(int outerCirclePositionX) {
        this.outerCirclePositionX = outerCirclePositionX;
        invalidate();
        requestLayout();
    }



    public int getOuterCirclePositionY() {
        return outerCirclePositionY;
    }

    public void setOuterCirclePositionY(int outerCirclePositionY) {
        this.outerCirclePositionY = outerCirclePositionY;
        invalidate();
        requestLayout();
    }


    public viewCustomObject(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.getTheme().obtainStyledAttributes(attrs,R.styleable.viewCustomObject,0,0);
        try{
            outerCircleRadius= array.getInteger(R.styleable.viewCustomObject_outerCircleRadius,200);
            innerCircleRadius= array.getInteger(R.styleable.viewCustomObject_innerCircleRadius,100);
            innerCirclePositionX = array.getInteger(R.styleable.viewCustomObject_innerCirclePositionX, 200);
            innerCirclePositionY = array.getInteger(R.styleable.viewCustomObject_innerCirclePositionY, 200);
            outerCirclePositionX = array.getInteger(R.styleable.viewCustomObject_outerCirclePositionX, 200);
            outerCirclePositionY = array.getInteger(R.styleable.viewCustomObject_outerCirclePositionY, 200);
        }finally {
            array.recycle();
        }
    }





    private void init(){
        outerCircleColor = new Paint();
        outerCircleColor.setColor(Color.BLUE);
        innerCircleColor = new Paint();
        innerCircleColor.setColor(Color.RED);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        init();
        //outerCircle
        canvas.drawCircle(outerCirclePositionX,outerCirclePositionY,outerCircleRadius, outerCircleColor);
        //innerCircle
        canvas.drawCircle(innerCirclePositionX,innerCirclePositionY,innerCircleRadius,innerCircleColor);
    }
}

