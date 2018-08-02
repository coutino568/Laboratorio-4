import java.util.*;
import map.*;

public class main {






    public static void main(String []args){
//        try {
//            Stream<String> lines = Files. lines (
//                    Paths. get ( "/Users/samuel/workspace/uvg/poo2018/tictactoe/src/example.txt" ),
//                    StandardCharsets. UTF_8
//            );
//            lines.forEach(s -> System. out .println(s));
//        } catch (IOException exception) {
//            System. out .println( "Error!" );
//        }
//    }
        map thisWorld = new map();
        Scanner read= new Scanner(System.in);

        System.out.println("Tngrese el nombre del archivo del Mapa (agregue extension el archivo)");
        String fileContent="";
        String userInput=read.nextLine();
        fileContent=thisWorld.readFile(userInput,1);

       // int value= read.nextInt();
        //thisWorld.createWalls(fileContent);
        thisWorld.InstructionsExecuter();


}




}

