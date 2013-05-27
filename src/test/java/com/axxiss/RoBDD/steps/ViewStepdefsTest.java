package com.axxiss.RoBDD.steps;

import android.app.Activity;
import com.axxiss.RoBDD.app.SampleActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * @author Alexis Mas - alexismas@about.me
 */
@RunWith(RobolectricTestRunner.class)
public class ViewStepdefsTest {
    private static final String TAG = "ViewStepdefsTest";
    ViewStepdefs mSteps;

    @Before
    public void setUp() {
        ActivityStepdefs activitySteps = new ActivityStepdefs();
        activitySteps.iLaunchActivity(SampleActivity.CLASS_NAME);

        Activity activity = activitySteps.getActivity();

        mSteps = new ViewStepdefs(activity);
    }

    @Test
    public void iShouldSeeTest() {
        mSteps.iShouldSee("Sample text!");
    }

}
