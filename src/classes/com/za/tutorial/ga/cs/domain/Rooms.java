public class Rooms{
    private string number;
    private int seatingCapacity;
    public Rooms(string number, int seatingCapacity){
        this.number=number;
        this.seatingCapacity=seatingCapacity;
    }
    public string getNumber(){
        return number;
    }
    public int getSeatingCapacity(){
        return seatingCapacity;
    }
}