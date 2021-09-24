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
        if ( !(o instanceof TurtlePosition turtlePosition)) return false;
        boolean rowsAreEqual = Integer.compare(row, turtlePosition.row) == 0;
        boolean columnsAreEqual = Integer.compare(column, turtlePosition.column)==0;
        return rowsAreEqual && columnsAreEqual;
    }
}
