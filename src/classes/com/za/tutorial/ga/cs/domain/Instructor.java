public class Instructor{
    private string id;
    private string name;
    public Instructor(string id, string name){
        this.id=id;
        this.name=name;
    }
    public string getId(){
        return id;
    }
    public string getName(){
        return name;
    }
    public string toString(){
        return name;
    }
}