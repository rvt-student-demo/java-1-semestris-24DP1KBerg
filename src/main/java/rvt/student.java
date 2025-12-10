package rvt;

public class student extends person {
    private int studyCredit;
    
    public student(String name, String adress){
        super(name, adress);
        this.studyCredit = 0;
    }

    public int credits(){
        return this.studyCredit + 1;
    }

    public String toString(){
        return super.toString() + "\nStudy credits " + this.studyCredit;
    }

    
}
