package com.axxiss.RoBDD.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.axxiss.RoBDD.R;

/**
 * Dummy sample activity for testing purpose.
 * <p/>
 * This is the main activity.
 *
 * @author Alexis Mas - alexismas@about.me
 */
public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    public final static String CLASS_NAME = "com.axxiss.RoBDD.app.MainActivity";

    public final static String TEXT_TEXTVIEW = "This is a TextView";
    public final static String TEXT_BUTTON = "This is a Button";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        Intent i = new Intent(this, IntentActivity.class);
        startActivity(i);
    }
}
