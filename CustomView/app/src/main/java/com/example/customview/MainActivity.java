package com.example.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LinearLayout root = findViewById(R.id.root);
        final DrawView dv = new DrawView(this);
        root.addView(dv);
    }
}
