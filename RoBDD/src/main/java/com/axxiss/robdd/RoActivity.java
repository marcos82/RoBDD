package com.axxiss.robdd;

import android.app.Activity;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Alexis Mas - alexismas@about.me
 */
public class RoActivity {
    private final static Logger LOGGER = Logger.getLogger(RoActivity.class.getName());

    /**
     * Creates an Activity from it class name.
     *
     * @param activityName activity's class name
     * @return The activity
     */
    public static Activity createActivity(String activityName) {
        Activity activity = null;
        Class<?> clazz;

        try {
            clazz = Class.forName(activityName);

            if (clazz != null) {
                activity = (Activity) clazz.newInstance();
            }

        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, activityName + " is not a class.");
        } catch (InstantiationException e) {
            LOGGER.log(Level.SEVERE, activityName + " can not be instantiated");
        } catch (IllegalAccessException e) {
            LOGGER.log(Level.SEVERE, "Forbidden access.");
        } catch (ClassCastException e) {
            LOGGER.log(Level.SEVERE, activityName + " is not an Android activity.");
        }

        return activity;
    }
}
