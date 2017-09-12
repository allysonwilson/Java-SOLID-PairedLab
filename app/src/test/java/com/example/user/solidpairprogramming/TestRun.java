package com.example.user.solidpairprogramming;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 12/09/2017.
 */

public class TestRun {
    Run run;


    @Before
    public void before() {
        run = new Run(7.24, 30.0, 20);
    }

    @Test
    public void canGetDistance(){
        assertEquals(7.24 , run.getDistance(), 0.01);
    }

    @Test
    public void canGetTime(){
        assertEquals(30.0, run.getTime(), 0.01);
    }

    @Test
    public void canGetAltitudeGain(){
        assertEquals(20, run.getAltitudeGain() );
    }
}
