package com.example.tarea_ds_iii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //animaciones

        Animation animacion1  = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2  = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);


        ImageView logo = findViewById(R.id.LogoImageView);
        TextView desarrollo = findViewById(R.id.GuiaTextView);
        TextView material = findViewById(R.id.LogoTextView);


        desarrollo.setAnimation(animacion2);
        material.setAnimation(animacion2);
        logo.setAnimation(animacion1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Navigation_Activity.class);
                startActivity(intent);
                finish();

            }
        }, 4000);



    }
}