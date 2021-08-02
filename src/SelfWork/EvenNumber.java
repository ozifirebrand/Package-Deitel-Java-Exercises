package SelfWork;

public class EvenNumber {

    public static void main(String[] args) {

        String[] letters = {"A", "B", "C", "D"};

        for (String letter : letters) {
            if (letter.equals("A")) {
                continue;
            }
            System.out.println(letter);
            if (letter.equals("C")){
                break;
            }
        }
    }
}
/*A number is declared. 2 in this case.
Even number is printed between 1 and 200*/
 //       int firstNumber = 3;
//        int count = 0;
//        for (count = 1; count <=100; count= count+1){
//
//            System.out.println(firstNumber + " ");
//
//            firstNumber+=2;
//
//        }
//
//        while(count<100){
//
//            System.out.print(firstNumber);
//
//            firstNumber+=2;
//
//            count +=1;
//
//        }
//        switch (firstNumber){
//            case 1 : count+=1;
//            break;
//            case 2 : count+=2;
//            break;
//            case 3 : count+=3;
//            break;
//            case 4 : count+=4;
//            default:
//                break;
//        }
//        System.out.println(count);
//    }
//}