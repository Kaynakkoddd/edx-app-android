package org.edx.mobile.test.screenshot.test;

import android.view.View;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.facebook.testing.screenshot.Screenshot;

import org.edx.mobile.view.LaunchActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LaunchScreenshotTests {

    @Rule
    public ActivityTestRule<LaunchActivity> mActivityRule =
            new ActivityTestRule<>(LaunchActivity.class, true, true);

    @Test
    public void testScreenshot_recordLaunchActivity() throws Throwable {
        View view = mActivityRule.getActivity().findViewById(android.R.id.content);
        Screenshot.snap(view).record();
    }
}
