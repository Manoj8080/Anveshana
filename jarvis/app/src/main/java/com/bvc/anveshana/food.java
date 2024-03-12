package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class food extends AppCompatActivity {
    Button bt1,bt2,bt3;
    ImageView iv1,iv2,iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        bt1=findViewById(R.id.button);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food.this, hotels.class);
                startActivity(intent);
            }

        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food.this, rjyhotel1.class);
                startActivity(intent);

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(food.this, rvmhtl1.class);
                startActivity(intent);
            }
        });
    }
}