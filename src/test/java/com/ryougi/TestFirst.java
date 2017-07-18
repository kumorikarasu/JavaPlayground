package com.ryougi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sean on 7/18/2017.
 */
public class TestFirst{

    @Test
    public void testLengthOfTheUniqueKey() {

        Greeting msg = new Greeting("GOOD");
        Assert.assertEquals("GOODA", msg.toString());
    }
}
