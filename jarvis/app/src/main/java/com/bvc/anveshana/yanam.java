package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yanam extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yanam);
        bt1=findViewById(R.id.button26);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Yanam,+Puducherry/@16.7271912,82.2175775,3a,75y,90t/data=!3m8!1e2!3m6!1sAF1QipPjt7lCNjDlZFneMT5EgFi1B8sjr2wxgiqAMr4f!2e10!3e12!6shttps:%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipPjt7lCNjDlZFneMT5EgFi1B8sjr2wxgiqAMr4f%3Dw360-h201-k-no!7i4016!8i2252!4m7!3m6!1s0x3a381fd8f6cf57c9:0x35ba5f35d97ba721!8m2!3d16.7271912!4d82.2175775!10e5!16zL20vMDR6eHZ4?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}