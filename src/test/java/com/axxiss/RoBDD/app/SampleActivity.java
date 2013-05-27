package com.axxiss.RoBDD.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Alexis Mas - alexismas@about.me
 */
public class SampleActivity extends Activity {
    private static final String TAG = "SampleActivity";

    public final static String CLASS_NAME = "com.axxiss.RoBDD.app.SampleActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Sample text!");

        LinearLayout layout = new LinearLayout(this);
        layout.addView(text);

        setContentView(layout);
    }
}
