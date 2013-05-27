package com.axxiss.RoBDD.steps;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * @author Alexis Mas - alexismas@about.me
 */
@RunWith(RobolectricTestRunner.class)
public class ActivityStepdefsTest {
    private static final String TAG = "ActivityStepdefsTest";

    ActivityStepdefs mSteps;


    @Before
    public void setUp() {
        mSteps = new ActivityStepdefs();
    }

    @Test
    public void iLaunchActivityTest() {
        mSteps.iLaunchActivity("com.axxiss.RoBDD.app.SampleActivity");
    }

}
