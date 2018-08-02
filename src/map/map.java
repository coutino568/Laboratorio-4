package map;
import java.util.ArrayList;
import robot.robot;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;


public class map {
    public ArrayList<String> rawMap=new ArrayList<>();
    public ArrayList<String> rawInstructions = new ArrayList<>();


    private ArrayList<beeper> pileOfCoins= new ArrayList<>();
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

    public String readFile(String nameOfFile, int typeOfFile) {
        String fileContent ="";

        try {
            Stream<String> lines = Files. lines (Paths.get("C:/UVG/2018/Laboratorio 4/src/map/"+nameOfFile),StandardCharsets. UTF_8);
            if( typeOfFile==1){
                lines.forEach(s -> rawMap.add(s));
                return rawMap[];}
                else if(typeOfFile==2) {
                lines.forEach(s -> rawInstructions.add(s));
                return rawMap[];
            }
            }
         catch (IOException exception) {
            System. out .println( "Error!" );
        }


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
