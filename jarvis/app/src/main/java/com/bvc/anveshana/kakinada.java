package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kakinada extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakinada);
        bt1=findViewById(R.id.button27);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Kakinada,+Andhra+Pradesh/@16.9767646,82.1648307,12z/data=!3m1!4b1!4m6!3m5!1s0x3a3827ddaf59b4f7:0x92f8ddb9c89a4803!8m2!3d16.9890648!4d82.2474648!16zL20vMDVuNTY4?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}