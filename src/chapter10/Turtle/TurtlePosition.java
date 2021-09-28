package chapter10.Turtle;


public class TurtlePosition {
   private int row;
   private int column;
    public TurtlePosition(int row, int column){
        this.row=row;
        this.column=column;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof TurtlePosition comparedTurtlePosition)) return false;
        boolean rowsAreEqual = this.row == comparedTurtlePosition.row;
        boolean columnsAreEqual = this.column == comparedTurtlePosition.column;
        return rowsAreEqual && columnsAreEqual;
    }

    @Override
    public String toString(){
        return String.format("Turtle is at row %d and column %d%n", row, column);
    }

    public int getColumnPosition() { return column; }

    public void setColumnPosition(int numberOfSteps) {
        column += numberOfSteps;
    }

    public int getRowPosition(){
        return row;
    }

    public void setRowPosition(int numberOfRows){
        row += numberOfRows;
    }
}