package com.example.codeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);
        final TextView show = new TextView(this);
        show.setText("Hello World");
        show.setTextSize(30);
        layout.addView(show);

        Button bn = new Button(this);
        bn.setText("单击");
        layout.addView(bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("time:" + new java.util.Date());
            }
        });
    }
}
