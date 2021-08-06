package chapter5;

public class TrianglePrinting {
//    public static void main(String[] args) {
        /*A program that accurately displays asterisks in the order of one,
            two, three etc and stops at ten
           We have our asterisk printing string
          Print first asterisk
          Increase the asterisks up till 10

          */
//
//        String asterisk = "*";
        String mainString="*";
        int counter = 1;
        public void asteriskMethod(String asterisk){
            System.out.println(asterisk);
        for (counter= 1; counter<10; counter++) {

            String newString = mainString + asterisk;
            System.out.println(newString);
//            counter++;
//            while (counter < 10)
//                //counter += 1;
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

        asterisks.asteriskMethod("*");
        System.out.println("\n\n\n");
        asterisks.askeriskInverted("*");

    }
    }