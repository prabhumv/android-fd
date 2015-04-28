package com.fd.activity;

import android.app.Activity;
import android.os.Bundle;
/*
sample android app
*/
public class FDActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}