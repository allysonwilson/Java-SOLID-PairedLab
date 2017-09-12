package com.example.user.solidpairprogramming;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by user on 12/09/2017.
 */

public class AthleteTest {

    Athlete athlete;

    @Before
    public void before(){
        athlete = new Athlete("Terry");
    }

    @Test
    public void canGetName(){
        assertEquals("Terry", athlete.getName());
    }

    @Test
    public void testArrayStartsEmpty(){
        assertEquals(0, athlete.getHealthTracker().size());
    }

    @Test
    public void canAddRunsToArray(){
        athlete.recordRun(5.0, 1.0, 70);
        assertEquals(1, athlete.getHealthTracker().size());
    }



}
