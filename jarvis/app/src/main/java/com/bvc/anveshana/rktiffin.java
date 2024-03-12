package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rktiffin extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rktiffin);
        bt1=findViewById(R.id.button19);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/RK+Tiffins/@16.7620398,81.8407212,17z/data=!3m1!4b1!4m6!3m5!1s0x3a37bf8d5e849011:0x789ceeab20a5d31!8m2!3d16.7620398!4d81.8432961!16s%2Fg%2F11dxpflbz1?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}