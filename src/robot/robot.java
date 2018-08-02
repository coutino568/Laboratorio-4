package robot;

public class robot {
    private int coordinate_X;
    private int coordinate_Y;
    private int dir;
    private int beepersCollected;
    public final int Representation_Right=1;
    public final int Representation_Up=0;
    public final int Representation_Left=3;
    public final int Representation_Down=2;

    private int getCoordinate_X(){
        return this.coordinate_X;
    }

    private int getCoordinate_Y(){
        return this.coordinate_Y;
    }

    private void rotate(){
        if(this.dir!=3){this.dir=this.dir+1;}else{this.dir=0;}
    }
   private int getDir(){return this.dir;}

    @Override
    public String toString() {
        if (dir==Representation_Down){return "V";}
        if (dir==Representation_Left){return "<";}
        if (dir==Representation_Up){return "^";}
        else {return ">";}
    }

    private void setCoordinate_X(int newCoordinate_X){
        this.coordinate_X= newCoordinate_X;

    }

    private void setCoordinate_Y(int newCoordinate_Y){
        this.coordinate_Y = newCoordinate_Y;
    }
}
