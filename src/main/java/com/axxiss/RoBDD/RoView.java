package com.axxiss.RoBDD;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Alexis Mas - alexismas@about.me
 */
public class RoView {

    /**
     * Gets the inner text of a view.
     *
     * @param view the view.
     * @return the text, null if no text is found.
     */
    public static String getInnerText(View view) {

        // TextView and Button
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }

        //TODO: check if all text based widgets are included

        return null;
    }

    /**
     * Check if a text is shown in a specific view.
     *
     * @param text The text.
     * @param view The view.
     * @return true if view's text contains the string.
     */
    public static boolean iShouldSee(String text, View view) {
        String currentText = getInnerText(view);

        if (currentText != null) {
            return currentText.contains(text);
        }


        int childCount;

        //No text was found, hence check if the view is a layout
        if (view instanceof ViewGroup) {
            LinearLayout layout = (LinearLayout) view;
            childCount = layout.getChildCount();

            for (int i = 0; i < childCount; i++) {
                if (iShouldSee(text, layout.getChildAt(i))) {
                    return true;
                }
            }
        }

        return false;
    }

}
