package com.axxiss.robdd.steps;

import com.axxiss.RoBDD.app.IntentActivity;
import com.axxiss.RoBDD.app.MainActivity;
import com.axxiss.robdd.steps.ActivityStepdefs;
import com.axxiss.robdd.steps.ViewStepdefs;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * @author Alexis Mas - alexismas@about.me
 */
@RunWith(RobolectricTestRunner.class)
public class ViewStepdefsTest {
    ViewStepdefs mViewSteps;
    ActivityStepdefs mActivitySteps;

    @Before
    public void setUp() {
        mActivitySteps = new ActivityStepdefs();
        mActivitySteps.iLaunchActivity(MainActivity.CLASS_NAME);
        mViewSteps = new ViewStepdefs(mActivitySteps.getActivity());
    }

    @Test
    public void testIShouldSee() {
        mViewSteps.iShouldSee(MainActivity.TEXT_BUTTON);
    }

    @Test
    public void testIClick() {
        mViewSteps.iClick(MainActivity.TEXT_BUTTON);
        mActivitySteps.currentActivityShouldBe(IntentActivity.CLASS_NAME);
    }

}
