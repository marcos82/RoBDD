package com.axxiss.robdd.steps;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.axxiss.robdd.RoActivity;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.robolectric.Robolectric;

import static org.junit.Assert.*;

/**
 * Activity steps definition.
 *
 * @author Alexis Mas - alexismas@about.me
 */
public class ActivityStepdefs {
    /**
     * Current activity.
     */
    private Activity mCurrentActivity;

    /**
     * Get the current activity.
     *
     * @return the activity.
     */
    public Activity getActivity() {
        return mCurrentActivity;
    }

    /**
     * Launch a new activity.
     *
     * @param activityName the activity class name.
     */
    @Given("^I launch the activity \"([^\"]*)\"$")
    public void iLaunchActivity(String activityName) {


        mCurrentActivity = null;

        mCurrentActivity = RoActivity.createActivity(activityName);

        if (mCurrentActivity == null) {
            Assert.fail("Activity couldn't be created.");
        } else {
            Robolectric.shadowOf(mCurrentActivity).callOnCreate(null);
            assertTrue("Activity couldn't be launched.", true);
        }
    }

    /**
     * Assert that a specific activity is the current one.
     *
     * @param activityName activity's class name.
     */
    @Then("^Current activity should be \"([^\"]*)\"$")
    public void currentActivityShouldBe(String activityName) {
        Activity activity = RoActivity.createActivity(activityName);

        Intent intent = Robolectric.shadowOf(mCurrentActivity).getNextStartedActivity();

        if (intent == null) {
            assertEquals(activity.getClass().getName(), mCurrentActivity.getClass().getName());
        } else {
            ComponentName componentName = intent.getComponent();
            if (componentName != null) {

                if (componentName.getClassName().equals(activity.getClass().getName())) {
                    mCurrentActivity = activity;
                    assertTrue(true);
                }
            } else {
                fail("Intent's component null");
            }
        }
    }

}
