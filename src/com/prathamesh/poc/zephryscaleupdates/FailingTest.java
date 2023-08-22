package com.prathamesh.poc.zephryscaleupdates;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailingTest {

    @Test(description = "AUD-T14")
    public void test_that_fails() {
        String s = "This is just a passing test!";
        Assert.assertTrue(false, "This is just a FAILING test!");
    }
}
