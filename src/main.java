import java.util.*;

public class main {
    Scanner read 




    public static void main(String []args){
        try {
            Stream<String> lines = Files. lines (
                    Paths. get ( "/Users/samuel/workspace/uvg/poo2018/tictactoe/src/example.txt" ),
                    StandardCharsets. UTF_8
            );
            lines.forEach(s -> System. out .println(s));
        } catch (IOException exception) {
            System. out .println( "Error!" );
        }
    }

}

