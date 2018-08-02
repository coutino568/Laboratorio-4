package map;

public class coin {
    private int coordinate_x;
    private int coordinate_y;
    private int amount;

    private int getCoordinate_x(){return this.coordinate_x;}

    private int getCoordinate_y(){return this.coordinate_y;}

    private int getAmount(){return this.amount;}

    private void removeOne(){
        this.amount=this.amount-1;
    }
}
