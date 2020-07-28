package com.za.ga.cs;

import java.util.ArrayList;
import java.util.stream.IntStream;

import com.za.ga.cs.connectionProvider.Dbmgr;

public class GeneticAlgorithm {
	 private Dbmgr data;
	    public GeneticAlgorithm(Dbmgr data){this.data = data;}
	    public Population evolve(Population population){
	        return mutatePopulation(crossoverPopulation(population));
	    }
	    Population crossoverPopulation( Population population){
	        Population crossoverPopulation=new Population(population.getSchedule().size(), data);
	       IntStream.range(0,Driver.NUMB_OF_ELITE_SCHEDULE).forEach(x -> crossoverPopulation.getSchedule().set(x,population.getSchedule().get(x))); 
	       
	       IntStream.range(Driver.NUMB_OF_ELITE_SCHEDULE,population.getSchedule().size()).forEach(x -> {
	           if(Driver.CROSSOVER_RATE > Math.random()){
	               Schedule schedule1= selectTournamentPopulation(population).sortByFitness().getSchedule().get(0);
	               Schedule schedule2= selectTournamentPopulation(population).sortByFitness().getSchedule().get(0);
	               crossoverPopulation.getSchedule().set(x,crossoverSchedule(schedule1,schedule2));
	            }else crossoverPopulation.getSchedule().set(x,population.getSchedule().get(x));
	       });
	       return crossoverPopulation;
	    }
	    Schedule crossoverSchedule( Schedule schedule1, Schedule schedule2){
	         Schedule crossoverSchedule= new Schedule(data).initialize();
	        IntStream.range(0,crossoverSchedule.getClasses().size()).forEach(x -> {
	            if(Math.random() > 0.5){
	                crossoverSchedule.getClasses().set(x,schedule1.getClasses().get(x));
	             }else crossoverSchedule.getClasses().set(x,schedule2.getClasses().get(x));
	        });
	        return crossoverSchedule;
	    }
	    Population mutatePopulation( Population population){
	         Population mutatePopulation=new Population(population.getSchedule().size(),data);
	         ArrayList<Schedule>schedule = mutatePopulation.getSchedule();
	        IntStream.range(0,Driver.NUMB_OF_ELITE_SCHEDULE).forEach(x -> 
	            schedule.set(x,population.getSchedule().get(x)));
	        IntStream.range(0,Driver.NUMB_OF_ELITE_SCHEDULE).forEach(x -> {
	            schedule.set(x,mutateSchedule(population.getSchedule().get(x)));
	        });
	        return mutatePopulation;
	    }
	    Schedule mutateSchedule( Schedule mutateSchedule){
	         Schedule schedule = new Schedule(data).initialize();
	        IntStream.range(0,mutateSchedule.getClasses().size()).forEach(x -> {
	        if(Driver.MUTATION_RATE > Math.random()) mutateSchedule.getClasses().set(x, schedule.getClasses().get(x));
	        });
	        return mutateSchedule;
	    }
	    Population selectTournamentPopulation( Population population){
	         Population tournamentPopulation=new Population(Driver.TOURNAMENT_SELECTION_SIZE,data);
	        IntStream.range(0,Driver.TOURNAMENT_SELECTION_SIZE).forEach(x -> {
	           tournamentPopulation.getSchedule().set(x,population.getSchedule().get((int)(Math.random() * population.getSchedule().size())));
	        });
	        return tournamentPopulation;
	    }
}
