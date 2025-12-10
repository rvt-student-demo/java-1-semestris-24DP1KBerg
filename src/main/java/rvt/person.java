package rvt;

public class person {
    private String name;
    private String adress;
    
    public person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }


    public String toString(){
        return this.name + "\n" + this.adress;
    }
}
