package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vivek extends AppCompatActivity {
     Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivek);
        bt1=findViewById(R.id.button14);
        bt2=findViewById(R.id.button31);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/VIVEK+Biryani/@17.0250146,81.7728117,17z/data=!3m1!4b1!4m6!3m5!1s0x3a37a401108e5a4f:0x99bfbf97a8b1fdb8!8m2!3d17.0250146!4d81.7753866!16s%2Fg%2F11hbpk8mvt?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://youtu.be/vGl5KnT5Duo?si=Biycj2k8z-FS40xV";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}