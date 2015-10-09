package com.coldsnickersbar.dungeongenerationtests;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by Adam on 10/9/15.
 */
public class AllTests extends TestSuite {

    public static Test suite() {
        return new TestSuiteBuilder(AllTests.class).includePackages("com.coldsnickersbar.dungeongenerationtests").build();
    }
}
