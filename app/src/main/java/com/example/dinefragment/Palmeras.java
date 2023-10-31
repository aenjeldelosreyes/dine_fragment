package com.example.dinefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Palmeras extends AppCompatActivity {
    ImageButton btnHeart;
    ImageButton btnShare;
    private boolean isLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palmeras);

        //        back button
        ImageButton button = findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Palmeras.this,MainActivity.class);
                startActivity(intent);

            }
        });

        //        like button
        btnHeart=findViewById(R.id.btnHeart);
        btnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isLike){
                    isLike=true;
                    btnHeart.setImageDrawable(getResources().getDrawable(
                            R.drawable.ic_btn_heart_filled
                    ));
                    Toast.makeText(Palmeras.this, "You liked this location", Toast.LENGTH_SHORT).show();
                }
                else{
                    isLike=false;
                    btnHeart.setImageDrawable(getResources().getDrawable(
                            R.drawable.ic_btn_heart
                    ));
                    Toast.makeText(Palmeras.this, "You removed like in this location", Toast.LENGTH_SHORT).show();
                }


            }
        });

        //        share button
        btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Palmeras.this, "You shared this location", Toast.LENGTH_SHORT).show();
            }
        });
    }
}