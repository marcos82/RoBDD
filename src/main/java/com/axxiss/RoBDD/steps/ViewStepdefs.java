package com.axxiss.RoBDD.steps;

import android.app.Activity;
import android.view.View;
import com.axxiss.RoBDD.RoView;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * View stepsdefs.
 *
 * @author Alexis Mas - alexismas@about.me
 */
public class ViewStepdefs {
    private static final String TAG = "ViewStepdefs";
    /**
     * Activity where views are placed.
     */
    private Activity mActivity;


    /**
     * Creates a new isntance of View stepdefs.
     *
     * @param activity The activity where to look for views.
     */
    public ViewStepdefs(Activity activity) {
        mActivity = activity;
    }

    /**
     * Assert if a text is shown in the current activity;
     *
     * @param text the text.
     */
    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String text) {
        final View v = Robolectric.shadowOf(mActivity).getContentView();
        final View view = RoView.findViewByText(text, v);

        assertNotNull("Text not found", view);
    }

    @When("^I click \"([^\"]*)\"$")
    public void iClick(String text) {
        final View v = Robolectric.shadowOf(mActivity).getContentView();
        final View view = RoView.findViewByText(text, v);

        assertNotNull("View not found", view);

        assertTrue("No listener defined.", view.callOnClick());
    }
}
