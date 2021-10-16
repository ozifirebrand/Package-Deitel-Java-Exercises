package chapter7.TortoiseAndHareProgram;

public class Field {
    private final Tortoise tortoise = new Tortoise();
    private final Hare hare = new Hare();
    public int getNumberOfSquares() {
        return 400;
    }

    public int getNumberOfRowsInField() {
        return 20;
    }

    public int getNumberOfColumnsInField() {
        return 20;
    }


    public Tortoise getTortoise() {
        return tortoise;
    }

    public Hare getHare() {
        return hare;
    }
}
