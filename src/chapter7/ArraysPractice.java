package chapter7;
/*
Program takes user input, ten of them
Array loops through the items
Adds the individual elements
Divides their sum by 10
    To find the smallest number
    First number is assigned as the smallest number
    Loop goes through the array and equates the first number to the smallest no
    If the next number is smaller than the current no, equate the number to the smallest no
    Else keep going

    To find the largest no
    Equate the first no to the largest no
    Loop goes through the array
    If next no is greater than the largest no, equate it to the largest no

Finally display the largest, smallest and average score
 */
public class ArraysPractice {
    //public static void main(String[] args) {
        int smallestNumber = 0;
        int largestNumber = 0;
        double totalNumber = 0;
        int[] scores = {56, 34, 76,32, 89, 23, 79, 44, 88, 65};

        public void smallestNumberMethod() {
            smallestNumber = scores[0];
            for (int index = 0; index < 10; index= index + 1) {
                if ( scores[index] < smallestNumber ){
                    smallestNumber = scores[index];
                }
            }
            System.out.println(smallestNumber);
        }
        public void largestNumberMethod(){
            largestNumber = scores[0];
            for (int index = 0; index < 10; index++) {
                if ( scores[index]> largestNumber ){
                    largestNumber = scores[index];
                }
            }
            System.out.println(largestNumber);
        }

        public void averageOfScores(){
            for (int index = 0; index < 10; index++){
                totalNumber += scores[index];
            }
            System.out.println(totalNumber);
            int noOfStudents = 10;
            double averageScores = totalNumber/ noOfStudents;
            System.out.println("Average score is " + averageScores);

        }

    public static void main(String[] args) {
        ArraysPractice array = new ArraysPractice();
        array.smallestNumberMethod();
        array.largestNumberMethod();
        array.averageOfScores();
    }
    }