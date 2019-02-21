package com.test;

import com.company.Caesar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClass {

    Caesar unit;

    @Before
    public void before(){
        unit = new Caesar();
    }

    @Test
    public void caesarTest(){
        Assert.assertEquals("axvjrwn unccdln", unit.caesarCipher("romaine lettuce",9) );
    }

}
