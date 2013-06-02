package com.axxiss.robdd;


import android.app.Activity;
import com.axxiss.RoBDD.app.MainActivity;
import com.axxiss.robdd.RoActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author Alexis Mas - alexismas@about.me
 */
@RunWith(RobolectricTestRunner.class)
public class RoActivityTest {
    private static final String TAG = "RoActivityTest";

    @Test
    public void testCreateActivity() {

        Activity activityNull = RoActivity.createActivity("adfavasasdv");
        assertNull(activityNull);

        Activity activityNotNull = RoActivity
                .createActivity(MainActivity.CLASS_NAME);
        assertNotNull(activityNotNull);
    }
}
