package entities;

public class Position {
    private int column;
    private int row;
    private Boolean type;

    


    public Position(int column, int row, Boolean type) {
        this.column = column;
        this.row = row;
        this.type = type;
    }

    public int getColumn() {
        return column;
    }
    
    public int getRow() {
        return row;
    }
    
    public Boolean getType() {
        return type;
    }

    @Override
    public String toString() {
        if(type){
            return "X";
        }
        else{
            return "O";
        }
        
    }
    
    

    
}
