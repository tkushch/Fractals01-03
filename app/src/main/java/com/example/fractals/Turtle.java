package com.example.fractals;


import android.graphics.Canvas;
import android.graphics.Paint;

public class Turtle {

    private float x = 500, y = 500;
    private boolean tail = true;
    private Paint paint = new Paint();
    private float angle;

    public void up() {
        tail = false;
    }
    public void down() {
        tail = true;
    }
    public void forward(float distance, Canvas canvas){
        float oldX = x;
        float oldY = y;
        x += Math.cos(angle/180*Math.PI) * distance;
        y += Math.sin(angle/180*Math.PI) * distance;
        if (tail) {
            canvas.drawLine(oldX, oldY, x, y, paint);
        }
    }
    public void backward(float distance, Canvas canvas){
        forward(-distance, canvas);
    }

    public void turnRight(float angle){
        this.angle += angle;
    }

    public void turnLeft(float angle){
        this.angle -= angle;
    }
}
