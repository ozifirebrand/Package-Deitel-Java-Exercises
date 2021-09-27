package chapter10;


public class TurtlePosition {
   private int row =0 ;
   private int column= 0 ;
    public TurtlePosition(int row, int column){
        this.row=row;
        this.column=column;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof TurtlePosition comparedTurtlePosition)) return false;
        boolean rowsAreEqual = Integer.compare(this.row, comparedTurtlePosition.row) == 0;
        boolean columnsAreEqual = Integer.compare(column, comparedTurtlePosition.column)==0;
        return rowsAreEqual && columnsAreEqual;
    }

    public int increaseNumberOfSteps(int numberOfSteps) {
        return column + numberOfSteps;
    }

    public int getColumnPosition() {
        return column;
    }

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