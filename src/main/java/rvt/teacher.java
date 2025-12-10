package rvt;

public class teacher extends person {
    private int salary;

    public teacher(String name, String adress, int salary){
        super(name, adress);
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + "\n salarey" + this.salary + " euro/month";
    }

}
