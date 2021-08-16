package chapter5;

public class ChristmasSong {

    String christmasActivity = "";
    int dayOfChristmas = 5;

    public void dayOfChristmas(int dayOfChristmas) {
        switch (dayOfChristmas) {
            case 1 -> christmasActivity = """
                    On the first day of Christmas my true love sent to me
                    A partridge in a pear tree.""";
            case 2 -> christmasActivity = """
                    On the second day of Christmas my true love sent to me
                    Two turtle doves,
                    And a partridge in a pear tree.""";
            case 3 -> christmasActivity = """
                    On the third day of Christmas my true love sent to me
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.""";
            case 4 -> christmasActivity = """
                    On the fourth day of Christmas my true love sent to me
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.
                    """;
            case 5 -> christmasActivity = """
                    On the fifth day of Christmas my true love sent to me
                    Five gold rings,
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.
                    """;
            case 6 -> christmasActivity = """
                    On the sixth day of Christmas my true love sent to me
                    Six geese a-laying
                    Five gold rings,
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.""";
            case 7 -> christmasActivity = """
                    On the seventh day of Christmas my true love sent to me
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five gold rings,
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.
                    """;
            case 8 -> christmasActivity = """
                    On the eighth day of Christmas my true love sent to me
                    Eight maids a-milking
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five gold rings,
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.
                    """;
            case 9 -> christmasActivity = """
                    On the ninth day of Christmas my true love sent to me
                    Nine ladies dancing
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five gold rings,
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.
                    """;
            case 10 -> christmasActivity = """
                    On the tenth day of Christmas my true love sent to me
                    Ten lords a-leaping
                    Nine ladies dancing,
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five gold rings,
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.
                    """;
            case 11 -> christmasActivity = """
                    On the eleventh day of Christmas my true love sent to me
                    Eleven pipers piping
                    Ten lords a-leaping,
                    Nine ladies dancing,
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five gold rings,
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.
                    """;
            case 12 -> christmasActivity = """
                    On the twelfth day of Christmas my true love sent to me
                    Twelve drummers drumming
                    Eleven pipers piping,
                    Ten lords a-leaping,
                    Nine ladies dancing,
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five gold rings,
                    Four calling birds,
                    Three French Hens,
                    Two turtle doves,
                    And a partridge in a pear tree.
                    """;
        }
        System.out.println(christmasActivity);
    }


    public static void main(String[] args) {
ChristmasSong happySinging = new ChristmasSong();
happySinging.dayOfChristmas(10);

    }
}