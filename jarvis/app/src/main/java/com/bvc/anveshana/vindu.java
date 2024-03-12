package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vindu extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vindu);
        bt1=findViewById(R.id.button21);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Vindu+Restaurant/@16.7547792,81.834927,17z/data=!3m1!4b1!4m6!3m5!1s0x3a37bf896afe3ce9:0x1185e7fa07588009!8m2!3d16.7547792!4d81.8375019!16s%2Fg%2F1tg851sp?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}