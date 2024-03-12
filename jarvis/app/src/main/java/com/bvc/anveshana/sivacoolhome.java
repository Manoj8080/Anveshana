package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sivacoolhome extends AppCompatActivity {
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sivacoolhome);
        bt1=findViewById(R.id.button8);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/BBC+Siva+cool+home/@16.5893895,82.0062155,17z/data=!3m1!4b1!4m6!3m5!1s0x3a37ef9768b2e751:0x4bcb1c2a03b22f4c!8m2!3d16.5893895!4d82.0087904!16s%2Fg%2F1hm3rnh7c?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
    }
}