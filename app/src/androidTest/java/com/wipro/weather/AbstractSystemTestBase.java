package com.wipro.weather;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


public abstract class AbstractSystemTestBase<T extends Activity> extends ActivityInstrumentationTestCase2<T> {
	
	public static final int WAIT_FOR_ACTIVITY_TIMEOUT = 30000;	
	public static final int WAIT_FOR_DIALOG_TIMEOUT = 30000;	
	public static final int WAIT_FOR_VIEW_TIMEOUT = 6000;	
	public static final int WAIT_FOR_TEXT_TIMEOUT = 6000;	
	public static final int STANDARD_WAIT_TIME = 30000;
	public static final int SHORT_WAIT_TIME = 5000;
	
	protected Solo solo;
	
	public AbstractSystemTestBase(Class<T> activityClass) {
		super(activityClass);
	}
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	@Override
	public void tearDown() throws Exception {
		super.tearDown();
		solo.finishOpenedActivities();
	}


}
