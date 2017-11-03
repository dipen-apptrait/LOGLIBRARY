package com.loglibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import loglibrary.com.loglibrary.LogLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogLib.logDebug("This is forDebug");
        LogLib.logError("This is for error");
        LogLib.logInfo("This is for Log information");

    }
}
