package com.za.tutorial.ga.cs;
import java.util.ArrayList;
import java.util.stream.IntStream;

import com.za.tutorial.ga.cs.domain.Schedule;

public class Population{
    private final ArrayList<Schedule> schedules;
    public Population(final int size, final Data data){
        schedules=new ArrayList<Schedule>(size);
        IntStream.range(0,size).forEach(x -> schedules.add(new Schedule(data).initialize()));

    }
    public ArrayList <Schedule> getSchedule(){return this.schedules;}
    public Population sortByFitness(){
    // schedules.sort((schedule1,schedule2) -> {
    //     int returnValue = 0;
    //     if(schedule1.getFitness() > schedule2.getFitness()) returnValue = -1;
    //     else if(schedule1.getFitness() < schedule2.getFitness()) returnValue = 1;
    return this;
    }
}