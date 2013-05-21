package com.axxiss.RoBDD;

import android.app.Activity;
import android.util.Log;

/**
 * @author Alexis Mas - alexismas@about.me
 */
public class RoActivity {
    private static final String TAG = "RoActivity";

    /**
     * Creates an Activity from it class name.
     *
     * @param activityName activity's class name
     * @return The activity
     */
    public static Activity createActivity(String activityName) {
        Activity activity = null;
        try {
            activity = (Activity) Class.forName(activityName).newInstance();
        } catch (ClassNotFoundException e) {
            Log.e(TAG, activityName + " is not a class.");
            e.printStackTrace();
        } catch (InstantiationException e) {
            Log.e(TAG, activityName + " can not be instantiated");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            Log.e(TAG, "Forbidden access.");
            e.printStackTrace();
        } catch (ClassCastException e) {
            Log.e(TAG, activityName + " is not an Android activity.");
            e.printStackTrace();
        }

        return activity;
    }


}
