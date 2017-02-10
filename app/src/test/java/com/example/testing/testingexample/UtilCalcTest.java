package com.example.testing.testingexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by HouZhiguo on 17/2/10.
 */
public class UtilCalcTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void sum() throws Exception {
        // import static org.junit.Assert.*;
        Assert.assertEquals(6, UtilCalc.sum(2, 3));
    }

}