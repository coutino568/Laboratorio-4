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

        Scanner read= new Scanner(System.in);

        System.out.println("ingrese un digito");
        String fileContent="";

       // int value= read.nextInt();
        map thisWorld = new map();
        thisWorld.createWalls(fileContent);
        thisWorld.InstructionsExecuter();

}




}

