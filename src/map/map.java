package map;
import java.util.ArrayList;
import robot.robot;


public class map {
    private ArrayList<coin> pileOfCoins= new ArrayList<>();
    private ArrayList<wall> groupOfWalls=new ArrayList<>();
    private ArrayList<robot> robotWithinMap=new ArrayList<>();


//    public String readMap(String fileName){
//        String fileContent="";
//        return fileContent;
//    }

    public void createWalls(String fileContent){
        int length_h=10;
        for (int i=0;i<=length_h;i++){
            int j=0;
            wall newWall= new wall(i,j);
            //necesita ser agregado a la lista
        }


    }

    public void createPileOfCoins(String fileContent){}

    public void InstructionsExecuter(){
        System.out.println(this.worldState());
        //for each instruction
            //if move -> array[] check is movement possible , robot object.move
            //if pick->
    }

    public String readFile(String nameOfFile) {
        String fileContent ="";
        return fileContent;
    }

    private boolean isMovementPossible(int destination_X,int destination_Y){

        return true;
    }

    private boolean isPickupPossible (int coordinate_X,int coordinate_Y, int desiredCoins){
        return true;
    }

    public String worldState(){
        String state="";
        return state;

    }
}
