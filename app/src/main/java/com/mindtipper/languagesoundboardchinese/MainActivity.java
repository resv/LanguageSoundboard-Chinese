package com.mindtipper.languagesoundboardchinese;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view){

//converts int id into string for log only
        int id = view.getId();
        String ourId = "";

//converts proper id for audio to be played
        ourId = view.getResources().getResourceEntryName(id);
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.mindtipper.languagesoundboardchinese");

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();

        Log.i("Button tapped", ourId);
    }
}
