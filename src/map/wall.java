package map;

public class wall {
    private int coordinate_X;
    private int coordinate_Y;

    public wall(int x,int y){
        this.coordinate_X=x;
        this.coordinate_Y=y;
    }
    @Override
    public String toString() {
        return "*";
    }

    public int getCoordinate_X(){
        return this.coordinate_X;
    }

    private int getCoordinate_Y(){
        return this.coordinate_Y;
    }
}
