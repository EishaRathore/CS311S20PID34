package com.za.tutorial.ga.cs;
import java.util.ArrayList;

public class GeneticAlgorithm{
    private Data data;
    public GeneticAlgorithm(Data data){this.data = data;}
    public Population evolve(Population population){
        return mutatePopulation(crossoverPopulation);
    }
    Population crossoverPopulation(Population population){
        return null;
    }
    Schedule crossoverSchedule(Schedule schedule1,Schedule schedule2){
        return null;
    }
    Population mutatePopulation(Population population){
        return null;
    }
    Schedule mutateSchedule(Schedule mutateSchedule){
        return null;
    }
    Population selectTournamentPopulation(Population population){
        return null;
    }
}