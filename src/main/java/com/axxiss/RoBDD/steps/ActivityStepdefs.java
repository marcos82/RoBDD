package com.axxiss.RoBDD.steps;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.axxiss.RoBDD.RoActivity;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

        Intent intent = Robolectric.shadowOf(mCurrentActivity).peekNextStartedActivity();

        if (intent == null) {
            assertEquals(mCurrentActivity.getClass().getName(), activity.getClass().getName());
        } else {
            ComponentName componentName = intent.getComponent();
            if (componentName != null) {
                assertEquals(mCurrentActivity.getClass().getName(), componentName.getClassName());
            } else {
                assert false;
            }
        }
    }

}
