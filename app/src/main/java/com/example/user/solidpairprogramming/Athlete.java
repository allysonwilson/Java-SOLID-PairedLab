package com.example.user.solidpairprogramming;

import android.icu.text.AlphabeticIndex;

import java.util.ArrayList;

/**
 * Created by user on 12/09/2017.
 */

public class Athlete {
    private ArrayList<Recordable> healthTracker;
    private String name;

    public Athlete(String name) {
        this.name = name;
        this.healthTracker = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Recordable> getHealthTracker() {
        return healthTracker;
    }

    public void recordRun(double distance, double time, int altitudeGain){
        Run log = new Run(distance, time, altitudeGain);
        healthTracker.add(log);
    }
}
