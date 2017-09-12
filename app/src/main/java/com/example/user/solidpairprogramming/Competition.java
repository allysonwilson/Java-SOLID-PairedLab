package com.example.user.solidpairprogramming;

import android.icu.text.AlphabeticIndex;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 12/09/2017.
 */

public class Competition {
    ArrayList<Athlete> competitors;

    public Competition(){
        competitors = new ArrayList<>();
    }

    public ArrayList<Athlete> getCompetitors() {
        return competitors;
    }

    public void addCompetitor(Athlete athlete) {
        competitors.add(athlete);
    }

    public String longestDistance() {
        Athlete winner = null;
        double longestDistance = 0.0;
        for (Athlete competitor: competitors) {
            ArrayList<Recordable> healthTracker = competitor.getHealthTracker();
            for (Recordable run : healthTracker) {
                if (run.getDistance() > longestDistance) {
                    longestDistance = run.getDistance();
                    winner = competitor;
                }
            }
        }
        return winner.getName();
    }
}

//add athletes
//        show winner: longest distance, fastest average, speed most altitude