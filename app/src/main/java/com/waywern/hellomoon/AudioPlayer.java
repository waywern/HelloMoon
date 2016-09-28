package com.waywern.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by slisovtsov on 9/28/2016.
 */
public class AudioPlayer {
    private MediaPlayer mPlayer;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }

    }

    public void play(Context c) {
        stop();
        mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
        mPlayer.start();

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
    }
}
