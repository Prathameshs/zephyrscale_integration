package com.prathamesh.poc.zephryscaleupdates;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PassingTest {

    @Test
    public void AUD_T17_test_that_passes() {
        String s = "This is just a passing test!";
        Assert.assertTrue(true, "This is just a passing test!");
    }
}
