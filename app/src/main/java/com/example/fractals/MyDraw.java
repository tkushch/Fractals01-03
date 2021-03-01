package com.example.fractals;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class MyDraw extends View {
    Paint paint;
    Turtle t;
    public MyDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        t = new Turtle();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f(250, 10, canvas);

    }
    protected void f(int d, int level, Canvas canvas){
        t.forward(d, canvas);
        if (level > 0){
            t.turnLeft(45);
            f(d / 2, level - 1, canvas);

            t.turnRight(90);
            f(d / 2, level - 1, canvas);

            t.turnLeft(45);
        }
        t.backward(d, canvas);
    }
}
