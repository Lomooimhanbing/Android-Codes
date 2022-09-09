package com.example.framelayouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Runnable{
    private int[] colors = new int[]{0xFFFF0000,0xFF0000FF,0xFF00FF,0xFFFF00FF,0xFF00FF00};
    private  int[] nextColorPoints = new int[]{1,2,3,4,0};
    private int currentColorPoint = 0;
    private View[] views;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        views = new View[]{findViewById(R.id.tv05),findViewById(R.id.tv04),findViewById(R.id.tv03),
                findViewById(R.id.tv02),findViewById(R.id.tv01)};
        handler = new Handler();
        handler.postDelayed(this,300);
    }

    @Override
    public void run() {
        int nextColorPoint = currentColorPoint;
        for (int i = views.length - 1;i >=0;i--) {
            views[i].setBackgroundColor(colors[nextColorPoint]);
            nextColorPoint = nextColorPoints[nextColorPoint];
        }
        currentColorPoint++;
        if(currentColorPoint == 5)
            currentColorPoint = 0;
        handler.postDelayed(this,300);
    }
}
