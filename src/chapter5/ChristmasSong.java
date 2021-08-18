package chapter5;

public class ChristmasSong {

    String christmasActivity = "";
    int dayOfChristmas;


    public static void dayOfChristmasMethod(int dayOfChristmas) {
        switch (dayOfChristmas) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five gold rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French Hens");
            case 2:
                System.out.println("Two turtle doves and");
            case 1:
                System.out.println("A partridge in a pear tree.");
        }
    }

    public static int conditionForDisplay(int dayOfChristmas){
     if ( dayOfChristmas == 1 ) System.out.println("On the first day of " +
             "Christmas, my true love sent to me");
     if ( dayOfChristmas == 2 ) System.out.println("On the second day of " +
                "Christmas, my true love sent to me");
     if ( dayOfChristmas == 3 ) System.out.println("On the third day of " +
                "Christmas, my true love sent to me");
     if ( dayOfChristmas == 4 ) System.out.println("On the fourth day of " +
                "Christmas, my true love sent to me");
     if ( dayOfChristmas == 5 ) System.out.println("On the fifth day of " +
                "Christmas, my true love sent to me");
     if ( dayOfChristmas == 6 ) System.out.println("On the sixth day of " +
                "Christmas, my true love sent to me");
     if ( dayOfChristmas == 7 ) System.out.println("On the seventh day of " +
                "Christmas, my true love sent to me");
    if ( dayOfChristmas == 8 ) System.out.println("On the eighth day of " +
                "Christmas, my true love sent to me");
    if ( dayOfChristmas == 9 ) System.out.println("On the ninth day of " +
                "Christmas, my true love sent to me");
    if ( dayOfChristmas == 10 ) System.out.println("On the tenth day of " +
                "Christmas, my true love sent to me");
    if ( dayOfChristmas == 11 ) System.out.println("On the eleventh day of " +
                "Christmas, my true love sent to me");
    if ( dayOfChristmas == 12 ) System.out.println("On the twelfth day of " +
                "Christmas, my true love sent to me");

    return dayOfChristmas;
    }


    public static void main(String[] args) {
        //conditionForDisplay(5);
        dayOfChristmasMethod(conditionForDisplay(6));
    }
}