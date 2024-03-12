package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rosemilk extends AppCompatActivity {
    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rosemilk);
        bt1=findViewById(R.id.button13);
        bt2=findViewById(R.id.button30);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Rajahmundry+Rose+Milk+Center+-+74+years/@19.6900952,61.0245166,4z/data=!4m10!1m2!2m1!1srose+milk+rajahmundry!3m6!1s0x3a37a519b32f8c3b:0x997e0113d2b11ac7!8m2!3d17.003357!4d81.7705826!15sChVyb3NlIG1pbGsgcmFqYWhtdW5kcnmSARRiZXZlcmFnZV9kaXN0cmlidXRvcuABAA!16s%2Fg%2F11h6yw9sps?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://youtube.com/shorts/qmeE0TPw084?si=qGv1Xr33o1OIJia_";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}