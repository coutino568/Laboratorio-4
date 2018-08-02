package map;

public class beeper {
    private int coordinate_X;
    private int coordinate_Y;
    private int amount;

    public beeper(int coordinate_x,int coordinate_y, int amount){
        this.coordinate_Y=coordinate_X;
        this.coordinate_Y=coordinate_y;
        this.amount=amount;
        System.out.println("se creo una pila de monedas con coordenada X:"+ this.coordinate_X + " y coordenada Y:"+this.coordinate_Y+". Tiene "+amount+"monedas");
    }
    private int getCoordinate_x(){return this.coordinate_X;}

    private int getCoordinate_y(){return this.coordinate_Y;}

    private int getAmount(){return this.amount;}

    private void removeOne(){
        this.amount=this.amount-1;
    }
}
