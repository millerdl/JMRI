package apps.startup.configurexml;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * TriggerRouteModelXmlTest.java
 *
 * Description: tests for the TriggerRouteModelXml class
 *
 * @author   Paul Bender  Copyright (C) 2016
 */
public class TriggerRouteModelXmlTest {

    @Test
    public void testCtor(){
      Assert.assertNotNull("TriggerRouteModelXml constructor",new TriggerRouteModelXml());
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        apps.tests.Log4JFixture.setUp();
    }

    @After
    public void tearDown() {
        apps.tests.Log4JFixture.tearDown();
    }

}

