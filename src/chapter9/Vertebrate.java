package chapter9;

public class Vertebrate extends Animal{
    public Vertebrate(){
        super(3);
        System.out.println("Who wan create vertebrate?");
    }
    @Override
    public void move(){
        System.out.println("Go placidly");
        System.out.println(getEyes()+ 2* getEyes());
    }
    public void parentMove(){
        super.move();
    }
}
