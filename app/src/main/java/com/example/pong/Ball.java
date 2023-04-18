package com.example.pong;

import android.graphics.RectF;

public class Ball {

    private RectF rect;
    private float xVelocity;
    private float yVelocity;
    private float ballWidth;
    private float ballHeight;

    public Ball(int screenX, int screenY) {
        // Make the ball size relative to screen resolution
        ballWidth = screenX / 100;
        ballHeight = ballWidth;

        // Set speed to be quarter of screen a second
        yVelocity = screenY / 4;
        xVelocity = yVelocity;

        // Initialize the Rect that represents the ball
        rect = new RectF();
    }

    public RectF getRect(){
        return rect;
    }

    // Update position each frame
    public void update(long fps){
        rect.left   = rect.left + (xVelocity / fps);
        rect.top    = rect.top + (yVelocity / fps);
        rect.right  = rect.left + ballWidth;
        rect.bottom = rect.top - ballHeight;
    }
}

