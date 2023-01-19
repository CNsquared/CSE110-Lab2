package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import android.widget.Button;
import android.widget.TextView;;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest {

    @Test
    public void testOne(){
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);

        scenario.onActivity(activity -> {
            Button btnOne = activity.findViewById(R.id.btn_one);
            Button btnPlus = activity.findViewById(R.id.btn_plus);
            Button btnEquals = activity.findViewById(R.id.btn_equals);

            btnOne.performClick();
            btnPlus.performClick();
            btnOne.performClick();
            btnEquals.performClick();

            TextView answer = activity.findViewById(R.id.display);

            assertEquals("2",answer.getText());
        }
        );

    }

}