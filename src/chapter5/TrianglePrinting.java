package chapter5;

public class TrianglePrinting {
        String mainString="*";
        int counter = 1;
        public void asteriskMethod(String asterisk){
            System.out.println(asterisk);
        for (counter= 1; counter<10; counter++) {

            String newString = mainString + asterisk;
            System.out.println(newString);
            mainString = newString + asterisk;
            System.out.println(mainString);
            counter++;
        }
        }


        public void askeriskInverted(String asterisk){
//            System.out.println(asterisk);

            for (int largeCounter=1; largeCounter <=10; largeCounter++) {
                for (int fastCounter =10; fastCounter>= largeCounter; fastCounter--) {
                    System.out.print("" + asterisk);
                }
                System.out.println();
            }
//                //mainString="**********";
//                String newString = mainString + asterisk;
//                System.out.println(newString);
//
//                mainString = newString + asterisk;
//                System.out.println(mainString);
//                counter++;

        }

    public static void main(String[] args) {
        TrianglePrinting asterisks = new TrianglePrinting();
//
//        asterisks.asteriskMethod("*");
//        System.out.println("\n\n");
//        asterisks.askeriskInverted("*");
        for(int row =0; row <10; row++){
            for (int column = 10; column>row; column--){
                System.out.print(" ");
            }
            for (int column =0; column< row; column++){
                System.out.print("* ");
            }

        System.out.println(" ");
            }
        }
    }