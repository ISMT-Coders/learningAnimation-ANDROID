package com.example.animation_ismt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 Button btn_blink, btn_feed, btn_move, btn_rotate, btn_slide, btn_zoom;
 ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        btn_blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                img.startAnimation(animation);
            }
        });
        btn_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.feed);
                img.startAnimation(animation);
            }
        });
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                img.startAnimation(animation);
            }
        });
        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                img.startAnimation(animation);
            }
        });
        btn_slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                img.startAnimation(animation);
            }
        });
        btn_zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                img.startAnimation(animation);
            }
        });

    }

    private void findId() {
        btn_blink = findViewById(R.id.blink);
        btn_feed = findViewById(R.id.feed);
        btn_move = findViewById(R.id.move);
        btn_rotate = findViewById(R.id.rotate);
        btn_slide = findViewById(R.id.slide);
        btn_zoom = findViewById(R.id.zoom);
        img = findViewById(R.id.img);
    }
}