import java.util.Arrays;
import java.util.Objects;

public class CodingChallenge {
    public static void main(String[] args) {
        System.out.println(CodingChallenge.changeTimeFormat("12:00:00AM"));
    }
    public static String changeTimeFormat(String inputTime){
        /*
        Split string by colon
        Gives us a string array of 3 elements: call it array A
        Split last element into singular characters call it array B
        Check if first element in A is "12"
        If it is 12, check last two elements in B, if it is AM,
        Convert A's second element and B's first two elements to integer,
        Concat 00:second element:B's first and second elements
        And so on for PM, this time it is 12
        If not, do the same conversions and concatenate
         */
        String [] arrayA = inputTime.split(":");
        System.out.println("Array A"+ Arrays.toString(arrayA));
        String firstElement = arrayA[0];
        String secondElement = arrayA[1];
        String thirdElement = arrayA[2];
        if ( Objects.equals(firstElement, "12") ){
            if(thirdElement.indexOf(2) == 'A' && thirdElement.indexOf(3)=='M'){
                return "00:".concat(secondElement).concat(":"+thirdElement.indexOf(0)+":"+thirdElement.indexOf(1));
            }
        }
        return "";
    }
}
