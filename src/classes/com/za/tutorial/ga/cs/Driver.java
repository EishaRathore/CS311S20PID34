package com.za.tutorial.ga.cs;

public class Driver{
    public static final int POPULATION_SIZE=9;
    public static final double MUTATION_RATE=0.1;
    public static final double CROSSOVER_RATE=9;
    public static final int TOURNAMENT_SELECTION_SIZE=9;
    public static final int NUMB_OF_ELITE_SCHEDULE=9;
    private Data data;
    public static void main(String[] args){
       Driver driver=new Driver();
       Data.data=new Data();
    }
  /*  private void printAvailableData(){
        System.out.printIn("")
    }*/
}