package chapter10.Turtle;

import static chapter10.Turtle.PenDirection.UP;

public class Pen {
    PenDirection currentPenPosition = UP;

    public PenDirection getPosition() {
        return currentPenPosition;
    }

    public void setTurtlePositionTo(PenDirection currentPosition) {
        this.currentPenPosition = currentPosition;
    }

    public void setPenPosition(PenDirection currentPenPosition) {
        this.currentPenPosition = currentPenPosition;
    }

    public PenDirection getPenPosition() {
        return currentPenPosition;
    }
}