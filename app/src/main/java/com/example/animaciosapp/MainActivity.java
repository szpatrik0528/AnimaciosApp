package com.example.animaciosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnBounce, btnFadeIn, btnFadeOut, btnRotate, btnZoomIn, btnZoomOut, btnFrameAnimation;
    TextView txtBounce, txtFadeIn, txtFadeOut, txtRotate, txtZoomIn, txtZoomOut;
    Animation animBounce, animFadeIn, animFadeOut, animRotate, animZoomIn, animZoomOut;
    ImageView imgFrameAnimation;
    boolean running = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnFrameAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!running){
                    imgFrameAnimation.setBackgroundResource(R.drawable.frame_anim);
                    AnimationDrawable frameAnimation = (AnimationDrawable) imgFrameAnimation.getBackground();
                    frameAnimation.start();
                    running = true;
                }else{
                    imgFrameAnimation.setBackgroundResource(R.drawable.frame_anim);
                    AnimationDrawable frameAnimation = (AnimationDrawable) imgFrameAnimation.getBackground();
                    frameAnimation.stop();
                    running = false;
                }
            }
        });
    }

    private void init() {

        btnBounce = findViewById(R.id.btnBounce);
        btnFadeIn = findViewById(R.id.btnFadeIn);
        btnFadeOut = findViewById(R.id.btnFadeOut);
        btnRotate = findViewById(R.id.btnRotate);
        btnZoomIn = findViewById(R.id.btnZoomIn);
        btnZoomOut = findViewById(R.id.btnZoomOut);
        btnFrameAnimation = findViewById(R.id.btnFrameAnimation);

        txtBounce = findViewById(R.id.txtBounce);
        txtFadeIn = findViewById(R.id.txtFadeIn);
        txtFadeOut = findViewById(R.id.txtFadeOut);
        txtRotate = findViewById(R.id.txtRotate);
        txtZoomIn = findViewById(R.id.txtZoomIn);
        txtZoomOut = findViewById(R.id.txtZoomOut);

        animBounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);

        imgFrameAnimation = findViewById(R.id.imgFrameAnimate);
        imgFrameAnimation.setBackgroundResource(R.drawable.frame_anim);

        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtBounce.startAnimation(animBounce);
            }
        });
        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFadeIn.startAnimation(animFadeIn);
            }
        });
        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFadeOut.startAnimation(animFadeOut);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtRotate.startAnimation(animRotate);
            }
        });
        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtZoomIn.startAnimation(animZoomIn);
            }
        });
        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtZoomOut.startAnimation(animZoomOut);
            }
        });
    }
}