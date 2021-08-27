package chapter9;

public class Earth {
    public static void main(String[] args) {

        Vertebrate tife = new Vertebrate();
        tife.reproduce();
        tife.die();
        tife.parentMove();
        //super calls the parent class method that makes other classes easily access the parent method
        //the parent does not have access to the children's attributes
        //
        tife.setEyes(45);
        System.out.println(tife.getEyes());
        tife.move();
    }
}