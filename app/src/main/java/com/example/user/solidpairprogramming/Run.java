package com.example.user.solidpairprogramming;

import android.icu.text.AlphabeticIndex;

import java.sql.Time;
import java.time.Instant;

/**
 * Created by user on 12/09/2017.
 */

public class Run implements Recordable{
    private double distance;
    private double time;
    private int altitudeGain;

    public Run(double distance, double time, int altitudeGain){
        this.distance = distance;
        this.time = time;
        this.altitudeGain = altitudeGain;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    public int getAltitudeGain() {
        return altitudeGain;
    }

//    public Recordable record(){
//        Run run = new Run(distance, time, altitudeGain);
//        return run;
//    }
}
