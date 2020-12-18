package com.example.shopnow;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertNotNull;

public class UserActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mUserActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mUserActivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(MainActivity.class.getName(),null,false);
    // nav_profile

    @Before
    public void setUp() throws Exception {
        mUserActivity = mUserActivityTestRule.getActivity();
    }

    @Test
    public void testLaunchActivityonBtnClick()
    {
        assertNotNull(mUserActivity.findViewById(R.id.btnlogins));
        onView(withId(R.id.btnlogins)).perform(click());

        Activity MainActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5000);
        assertNotNull(MainActivity);
        MainActivity.finish();
    }

    @After
    public void tearDown() throws Exception {
        mUserActivity = null;
    }

//    @Rule
//    public ActivityTestRule<MainActivity> mPhoneTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
//
//    private MainActivity mPhone = null;
//
//    @Before
//    public void setUp() throws Exception {
//        mPhone = mPhoneTestRule.getActivity();
//    }
//
//    @Test
//    public void testLaunch()
//    {
//        View view = mPhone.findViewById(R.id.phone);
//        assertNotNull(view);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        mPhone = null;
//    }

//    @Rule
//    public ActivityTestRule<MainActivity> mEmailTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
//
//    private MainActivity mEmail = null;
//
//    @Before
//    public void setUp() throws Exception {
//        mEmail = mEmailTestRule.getActivity();
//    }
//
//    @Test
//    public void testLaunch()
//    {
//        View view = mEmail.findViewById(R.id.email);
//        assertNotNull(view);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        mEmail = null;
//    }
}