package com.example.asus_pc.navigationdrawer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mediaPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        Button playBT =(Button)findViewById(R.id.button_mediaPlayer_play);

        final MediaPlayer mplay = MediaPlayer.create(mediaPlayerActivity.this,R.raw.sample_audio);

        playBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mplay.start();
            }
        });
    }
}
