package loglibrary.com.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import loglibrary.com.loglibrary.LogLib;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        LogLib.logDebug("This is a Debug Message");
        LogLib.logInfo("This is an Info Message");
        LogLib.logError("This is an Error");
    }
}
