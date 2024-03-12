package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bhaskara extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhaskara);
        bt1=findViewById(R.id.button20);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Bhaskara+Hotel/@16.7616979,81.8390944,17z/data=!3m1!4b1!4m6!3m5!1s0x3a37bf8d788b40d7:0x624b48f94226a86c!8m2!3d16.7616979!4d81.8416693!16s%2Fg%2F1tcv99gn?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}