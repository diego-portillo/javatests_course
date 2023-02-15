package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testRepeat3() {
        Assert.assertEquals( "holaholahola", StringUtil.repeat("hola", 3));
    }
    @Test
    public void testRepeat2() {
        Assert.assertEquals("holahola", StringUtil.repeat("hola", 2));
    }
    @Test
    public void testRepeat0() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRepeatNegative() {
        StringUtil.repeat("hola", -1);
    }

}