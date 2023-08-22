package com.prathamesh.poc.zephryscaleupdates;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PassingTest {

    @Test(description = "AUD-T13")
    public void test_that_passes() {
        String s = "This is just a passing test!";
        Assert.assertTrue(true, "This is just a passing test!");
    }
}
