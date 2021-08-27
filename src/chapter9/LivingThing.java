package chapter9;

public class LivingThing {
    private int eyes;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void reproduce(){
        System.out.println("Be fruitful Nne");
    }
    public void die(){
        System.out.println("Die Die Die");
    }
    public void move(){
        System.out.println("Waka waka");
    }
    public LivingThing(){
        System.out.println("Who wan create living thing?");
    }
}
