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
        Assert.assertEquals("axvjrwn unccdln jwm laxdcxwb manbbnm frcq unvxw sdrln xuren xru npp fxalnbcnabqran bjdln", unit.caesarCipher("romaine lettuce and croutons dressed with lemon juice olive oil egg worcestershire sauce",9) );

    }

    @Test
    public void getCipherChar(){
        Assert.assertEquals("j", unit.encodeChar('a',9));
        Assert.assertEquals("a", unit.encodeChar('r',9));

        // Продивився ключ, вище 9, тому для a = j, а для 25 a = z а не і
        Assert.assertEquals("z", unit.encodeChar('a',25));
        Assert.assertEquals("q", unit.encodeChar('r',25));

    }

}
