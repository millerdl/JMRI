package jmri.jmrit.decoderdefn;

import jmri.util.JUnitUtil;

import org.junit.jupiter.api.*;
import org.junit.Assert;

/**
 *
 * @author Paul Bender Copyright (C) 2017
 */
public class InstallDecoderURLActionTest {

    @Test
    public void testCTor() {
        InstallDecoderURLAction t = new InstallDecoderURLAction("Test");
        Assert.assertNotNull("exists",t);
    }

    @BeforeEach
    public void setUp() {
        JUnitUtil.setUp();
    }

    @AfterEach
    public void tearDown() {
        JUnitUtil.tearDown();
    }

    // private final static Logger log = LoggerFactory.getLogger(InstallDecoderURLActionTest.class);

}
