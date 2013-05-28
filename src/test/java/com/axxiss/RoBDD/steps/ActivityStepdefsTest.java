package com.axxiss.RoBDD.steps;

import com.axxiss.RoBDD.R;
import com.axxiss.RoBDD.app.IntentActivity;
import com.axxiss.RoBDD.app.MainActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

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
        mSteps.iLaunchActivity(MainActivity.CLASS_NAME);
        assertTrue("Activity not launched.",
                mSteps.getActivity() instanceof MainActivity);
    }

    @Test
    public void currentActivityShouldBeTest() {
        mSteps.iLaunchActivity(MainActivity.CLASS_NAME);

        mSteps.getActivity().findViewById(R.id.button_new_activity)
                .callOnClick();

        mSteps.currentActivityShouldBe(IntentActivity.CLASS_NAME);


        assertTrue("Activity not launched.",
                mSteps.getActivity() instanceof IntentActivity);

    }

}
