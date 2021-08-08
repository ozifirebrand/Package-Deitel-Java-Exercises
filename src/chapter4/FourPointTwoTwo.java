//completed
package chapter4;

public class FourPointTwoTwo {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("N\t\t 10*N\t 100*N\t\t 1000*N");
        while (number<=5){
            System.out.print(number);
            System.out.print("\t\t  ");
            System.out.print(10*number);
            System.out.print("\t  ");
            System.out.print(100*number);
            System.out.print("\t\t ");
            System.out.print(1000*number);
            System.out.println();
            number+=1;
        }
    }
}
