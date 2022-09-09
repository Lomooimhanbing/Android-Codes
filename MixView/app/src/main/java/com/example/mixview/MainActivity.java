package com.example.mixview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int[] images = new int[] {
            R.drawable.xml, R.drawable.java, R.drawable.ee, R.drawable.ajax, R.drawable.classic
    };
    int currentImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout root = findViewById(R.id.root);
        final ImageView image = new ImageView(this);
        root.addView(image);
        image.setImageResource(images[currentImg]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(images[++currentImg % images.length]);
            }
        });
    }
}
