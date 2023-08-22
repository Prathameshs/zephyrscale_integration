package com.prathamesh.poc.zephryscaleupdates;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailingTest {

    @Test
    public void AUD_T18_test_that_fails() {
        String s = "This is just a passing test!";
        Assert.assertTrue(false, "This is just a FAILING test!");
    }
}
