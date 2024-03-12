package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bobbattlu extends AppCompatActivity {
    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobbattlu);
        bt1=findViewById(R.id.button15);
        bt2=findViewById(R.id.button29);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Varma+Nethi+Bobbatlu/@17.0019735,81.7885409,17z/data=!3m1!4b1!4m6!3m5!1s0x3a37a35c9964d441:0x2ae6681f9660ba54!8m2!3d17.0019735!4d81.7911158!16s%2Fg%2F11gy634x95?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://youtube.com/shorts/uPWH6WMmty0?si=jOqjWlY0wU6tUWH9";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}