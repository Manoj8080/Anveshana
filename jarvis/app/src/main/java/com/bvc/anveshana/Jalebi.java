package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jalebi extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jalebi);
        bt1=findViewById(R.id.button9);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/chettu+kindha+jilabe/@16.5855206,82.0066297,19z/data=!3m1!4b1!4m6!3m5!1s0x3a37eff78977d665:0x5da80f06ad0b87f8!8m2!3d16.5855206!4d82.0072734!16s%2Fg%2F11qk4dgs33?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}