import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.Collections;

// import javax.naming.spi.DirStateFactory.Result;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) throws Exception {
        System.out.println(ANSI_BLUE+"Program started"+ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\neach dice is going to be rolled three times, and the biggest one is going to be highlighted in red for each dice.\n\n");
        System.out.print(ANSI_BLUE+"how many faces is the dice going to have? "+ANSI_RESET);
        int faces = scanner.nextInt();
        System.out.print(ANSI_BLUE+"how many times do you want to roll? "+ANSI_RESET);
        int rolls = scanner.nextInt();
        scanner.close();

        ThrowDice(faces,rolls);
    }
    public static void ThrowDice(int faces, int rolls){
        rolls = rolls + 1; 
        Random generator = new Random();
        int[] intArray = IntStream.rangeClosed(1, faces).toArray();
        List<Integer> results = new ArrayList<Integer>();
        for(int i = 0; i < rolls; ++i){
            int First = generator.nextInt(intArray.length);
            int Second = generator.nextInt(intArray.length);
            int Third = generator.nextInt(intArray.length);
            int bigger = 0;
            if (First > Second && First > Third){
                bigger = First;
                results.add(bigger);
                System.out.print(ANSI_RED+bigger+ANSI_RESET+" "+Second+" "+Third+"\n");
            } 
            if (Second > First && First > Third){
                bigger = Second;
                results.add(bigger);
                System.out.print(First+" "+ANSI_RED+bigger+ANSI_RESET+"\n");
            }
            if (Third > First && Third > Second){
                bigger = Third;
                results.add(bigger);
                System.out.print(Second+" "+Third+" "+ANSI_RED+bigger+ANSI_RESET+"\n");
            }
        }
        int biggestNumber = Collections.max(results);
        System.out.println("The biggest number in the results is: " + ANSI_GREEN+biggestNumber+ANSI_RESET);
        }     
    }
    

        


        // System.out.print(ANSI_GREEN+"qualcosa"+ANSI_RESET+"\n");
        // String bigger = ANSI_RED+            
    