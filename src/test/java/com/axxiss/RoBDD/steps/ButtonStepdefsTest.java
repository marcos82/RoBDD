package com.axxiss.RoBDD.steps;

import com.axxiss.RoBDD.app.MainActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * @author Alexis Mas - alexismas@about.me
 */
@RunWith(RobolectricTestRunner.class)
public class ButtonStepdefsTest {

    private ActivityStepdefs mActivitySteps;

    @Test
    public void setUp() {
        mActivitySteps = new ActivityStepdefs();
        mActivitySteps.iLaunchActivity(MainActivity.CLASS_NAME);
    }

    @Test
    public void test_iGoBack() {

    }

    @Test
    public void test_iPressMenuKey() {

    }

    @Test
    public void test_iPressEnter() {

    }


}
