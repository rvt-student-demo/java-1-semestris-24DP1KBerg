package rvt;

public class overloadedCounter {

    public static void main(String[] args) {
        
        overloadedCounter c1 = new overloadedCounter(7);
        System.out.println("\n start value " + c1.value);
        c1.increase();
        System.out.println("\n increased value " + c1.value);
        c1.decreese();
        System.out.println("\n decreesed value " + c1.value);
        c1.increase(10);
        System.out.println("\n increased value by 10" + c1.value);
        c1.decreese(6);
        System.out.println("\n decreesed value by 6" + c1.value);
    }

    private int value;

    public overloadedCounter(int startValue){
        this.value = startValue;
    }

    public overloadedCounter(){
        this.value = 0;
    }

    public int value(){
        return this.value;
    }

    public void increase(){
        this.value = this.value + 1;
    }

    public void decreese(){
        this.value = this.value - 1;
    }

    public void increase(int increaseBy){
        if (increaseBy >= 0){
            this.value = this.value + increaseBy;
        }
    }

    public void decreese(int decreeseBy){
        if (decreeseBy >= 0){
            this.value = this.value + decreeseBy;
        }
    }
}

