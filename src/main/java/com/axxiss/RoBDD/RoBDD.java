package com.axxiss.RoBDD;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import org.robolectric.Robolectric;

import static org.junit.Assert.*;

/**
 * @author Alexis Mas - alexismas@about.me
 */
public class RoBDD {
    private static final String TAG = "RoBDD";

    public static void iShouldSee(View v, String text){
        String innerText = Robolectric.innerText(v);

        assertTrue(innerText.contains(text));
    }

    public static void iShouldSee(Activity activity, int id, String text) {
        TextView view = (TextView) activity.findViewById(id);
        assertEquals(String.valueOf(view.getText()), text);
        assertEquals(view.getVisibility(), View.VISIBLE);
    }

    public static void iShouldSee(Activity activity, int id){
        View view = activity.findViewById(id);
        assertNotNull(view);
        assertEquals(view.getVisibility(), View.VISIBLE);
    }

    public static void iClick(Activity activity, int id){
        View view =  activity.findViewById(id);
        view.callOnClick();
    }

}
