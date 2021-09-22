package chapter10.Turtle;

public class Turtle {
    private TurtlePosition turtlePosition= TurtlePosition.RIGHT;
    private Pen newPen = new Pen();

    public Pen getNewPen() {
        return newPen;
    }

    public void penDown() {
        newPen.setTurtlePositionTo(PenPosition.DOWN);

    }

    public void turnTurtleRight(TurtlePosition turtlePosition) {
        this.turtlePosition = turtlePosition;
    }

    public TurtlePosition turtleHasTurnedRight() {
        return turtlePosition;
    }
}