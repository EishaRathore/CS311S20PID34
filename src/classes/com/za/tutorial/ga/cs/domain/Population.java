package com.za.tutorial.ga.cs;
import java.util.ArrayList;

public class Population{
    private ArrayList<Schedule> schedule;
    public Population(int size, Data data){
        schedule=new ArrayList<Schedule>(size);
        InStream.range(0,size).forEach(x -> schedule.add(new Schedule(data).initialize()));

    }
    public ArrayList <Schedule> getSchedule(){return this.schedule;}
    public Population sortByFitness(){
    schedule.sort((schedule1,schedule2) -> {
        int returnValue = 0;
        if(schedule1.getFitness() > schedule2.getFitness())
        returnValue = -1;
        else if(schedule1.getFitness() < schedule2.getFitness())
        returnValue = 1;
    });
    return this;
    }
}