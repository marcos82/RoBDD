package com.axxiss.robdd.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Dummy sample activity for testing purpose.
 * <p/>
 * This activity is intended to be started by an intent.
 *
 * @author Alexis Mas - alexismas@about.me
 */
public class IntentActivity extends Activity {

    public static final String CLASS_NAME =
            "com.axxiss.RoBDD.app.IntentActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("");

        LinearLayout layout = new LinearLayout(this);
        layout.addView(text);

        setContentView(layout);
    }

}
