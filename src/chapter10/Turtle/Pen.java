package chapter10.Turtle;

import static chapter10.Turtle.PenPosition.UP;

public class Pen {
    PenPosition currentPenPosition = UP;

    public PenPosition getPosition() {
        return currentPenPosition;
    }

    public void setPenPositionTo(PenPosition currentPosition) {
        this.currentPenPosition = currentPosition;
    }

    public PenPosition getPenPosition() {
        return currentPenPosition;
    }
}