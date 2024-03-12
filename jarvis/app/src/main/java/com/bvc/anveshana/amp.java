package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class amp extends AppCompatActivity {
    TextView tv;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amp);
        bt1=findViewById(R.id.button25);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Amalapuram,+Andhra+Pradesh/@16.5738373,81.9713534,13z/data=!3m1!4b1!4m6!3m5!1s0x3a37ef83f9204c7d:0x5f9453f5c41b161e!8m2!3d16.5774798!4d82.0031455!16zL20vMGJfcWto?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}