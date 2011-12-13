package com.main.recwallet;

import android.app.Activity;
import android.os.Bundle;
import android.media.MediaRecorder;
/*Create a new instance of android.media.MediaRecorder.
1. Set the audio source using MediaRecorder.setAudioSource(). You will probably want to use MediaRecorder.AudioSource.MIC.
2. Set output file format using MediaRecorder.setOutputFormat().
3. Set output file name using MediaRecorder.setOutputFile().
4. Set the audio encoder using MediaRecorder.setAudioEncoder().
5. Call MediaRecorder.prepare() on the MediaRecorder instance.
6. To start audio capture, call MediaRecorder.start().
7. To stop audio capture, call MediaRecorder.stop().
8. When you are done with the MediaRecorder instance, call MediaRecorder.release() on it. 
Calling MediaRecorder.release() is always recommended to free the resource immediately*/
public class RecWalletActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
    }
}