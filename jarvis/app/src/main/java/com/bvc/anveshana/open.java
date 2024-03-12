package com.bvc.anveshana;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.VideoView;

public class open extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        VideoView videoView = findViewById(R.id.videoView);

        // Load and start the fade-in animation
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        videoView.startAnimation(animation);

        // Set up and play the video from the res/raw directory
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.anime);
        videoView.setVideoURI(videoUri);
        videoView.start(); // Start playing the video

        // Set up an AnimationListener to jump to the next activity after the animation
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Animation started
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Animation ended, start the next activity
                Intent intent = new Intent(open.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional, depending on your use case
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Animation repeated
            }
        });
    }
}
