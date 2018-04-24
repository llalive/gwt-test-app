package ru.llalive.gwttestapp;

import ru.llalive.gwttestapp.client.Gwt_test_appTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class Gwt_test_appSuite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for Gwt_test_app");
		suite.addTestSuite(Gwt_test_appTest.class);
		return suite;
	}
}
