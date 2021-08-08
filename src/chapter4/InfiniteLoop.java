package chapter4;

public class InfiniteLoop {
    public static void main(String[] args) {
        int multipleOfTwo = 0;
        int number = 1;
        while (number >=1){
            multipleOfTwo = number%2;
            if (multipleOfTwo == 0){
                System.out.println(number);
                number += 1;
            }else {
                number+=1;
            }
        }
    }
}
