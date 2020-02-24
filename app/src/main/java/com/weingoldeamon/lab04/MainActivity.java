package com.weingoldeamon.lab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {

    ViewFlipper vflip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vflip = findViewById(R.id.view_flip);
        getWindow().getDecorView().getRootView().setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeTop() {
            }
            public void onSwipeRight() {
                vflip.showPrevious();
            }
            public void onSwipeLeft() {
                vflip.showNext();
            }
            public void onSwipeBottom() {
            }
        });
    }
}