package chapter10.Turtle;

import static chapter10.Turtle.PenPosition.UP;

public class Pen {
    PenPosition currentPenPosition = UP;

    public PenPosition getPosition() {
        return currentPenPosition;
    }

    public void setTurtlePositionTo(PenPosition currentPosition) {
        this.currentPenPosition = currentPosition;
    }

    public void setPenPosition(PenPosition currentPenPosition) { this.currentPenPosition = currentPenPosition; }

    public PenPosition getPenPosition() {
        return currentPenPosition;
    }
}