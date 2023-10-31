package com.example.dinefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView popularPalmerasCardview = findViewById(R.id.popularPalmeras);
        popularPalmerasCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Palmeras.class);
                startActivity(intent);

            }
        });

        CardView hotPalmerasCardview = findViewById(R.id.hotPalmeras);
        hotPalmerasCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Palmeras.class);
                startActivity(intent);

            }
        });

        CardView preferPalmerasCardview = findViewById(R.id.preferPalmeras);
        preferPalmerasCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Palmeras.class);
                startActivity(intent);

            }
        });






    }
}