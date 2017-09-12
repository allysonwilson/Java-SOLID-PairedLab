package com.example.user.solidpairprogramming;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/09/2017.
 */

public class CompetitionTest {
    Competition competition;
    Athlete athlete1;
    Athlete athlete2;

    @Before
    public void before(){
        athlete1 = new Athlete("Terry");
        athlete2 = new Athlete("Berry");
        athlete1.recordRun(10.0, 10.0, 50);
        athlete2.recordRun(12.0, 15.0, 70);
        competition = new Competition();
    }

    @Test
    public void testNoCompetitors(){
        assertEquals( 0, competition.getCompetitors().size() );
    }

    @Test
    public void testHasCompetitors(){
        competition.addCompetitor(athlete1);
        competition.addCompetitor(athlete2);
        assertEquals(2, competition.getCompetitors().size());
        assertEquals("Terry", competition.getCompetitors().get(0).getName());
        assertEquals("Berry", competition.getCompetitors().get(1).getName());
    }

    @Test
    public void testLongestDistanceCovered(){
        competition.addCompetitor(athlete1);
        competition.addCompetitor(athlete2);
        assertEquals("Berry", competition.longestDistance());
    }

}
