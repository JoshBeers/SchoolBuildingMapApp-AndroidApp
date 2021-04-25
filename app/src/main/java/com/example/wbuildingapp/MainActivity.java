package com.example.wbuildingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("title");
        Log.v("landing page","landing page loaded");


        Button firstFloorButton=findViewById(R.id.firstFloorButtonS);
        firstFloorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","First floor button hit");
                Intent inten=new Intent(MainActivity.this,firstFloorPage.class);
                try {
                    startActivity(inten);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","first floor button failed");
                }

            }
        });

        Button secondFloorButton=findViewById(R.id.secondFloorButton);
        secondFloorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","second floor button hit");
                Intent intent=new Intent(MainActivity.this,secondFloorScreen.class);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","second floor button failed");
                }
            }
        });

        Button thirdFlooButton=findViewById(R.id.thirdFloorButton);
        thirdFlooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","third floor button hit");
                Intent intent=new Intent(MainActivity.this,thirdFloorScreen.class);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","third floor button failed");
                }
            }
        });

        Button campusMapButton=findViewById(R.id.campusButton);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","campus map button hit");
                Intent intent=new Intent(MainActivity.this,campusMap.class);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","campus button failed");
                }
            }
        });

        Button aboutButton=findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("landing page","about button hit");
                Intent intent=new Intent(MainActivity.this,aboutScreen.class);
                try {
                    startActivity(intent);
                }catch (Exception e){
                    System.out.println(e);
                    Log.e("landing page","about button failed");
                }
            }
        });

        ImageView imageView=findViewById(R.id.WestHallImage);

        //Drawable d=getDrawable()

      //  imageView.setImageDrawable(R.drawable.campusmap);


    }




}
