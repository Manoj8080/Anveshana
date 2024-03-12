package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vishnusri extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vishnusri);
        bt1=findViewById(R.id.button7);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Hotel+Vishnu+Sri/@16.5784974,82.0000055,17z/data=!3m1!4b1!4m6!3m5!1s0x3a37ef83800603bf:0xfb6ab6d5b259c7b7!8m2!3d16.5784974!4d82.0025804!16s%2Fg%2F1tf4cg38?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}