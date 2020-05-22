import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DemoColoring {

    // System.out.println("\u001B[34m"+""+ "\u001B[0m");
    static void printblue(String str) {
        System.out.println("\u001B[34m" + str + "\u001B[0m");
    }

    static void printcyan(String str) {
        System.out.println("\u001B[36m" + str + "\u001B[0m");
    }

    static void printpurple(String str) {
        System.out.println("\u001B[35m" + str + "\u001B[0m");
    }

    static void printyellow(String str) {
        System.out.println("\u001B[33m" + str + "\u001B[0m");
    }

    static void printmagenta(String str) {
        System.out.println("\u001b[35m" + str + "\u001B[0m");
    }

    static void printred_bright(String str) {
        System.out.println("\033[1;31m" + str + "\u001B[0m");
    }

    static void printgreen_bright(String str) {
        System.out.println("\033[1;32m" + str + "\u001B[0m");
    }

    static void printblue_bright(String str) {
        System.out.println("\033[1;34m" + str + "\u001B[0m");
    }
    static void printred(String str){
    System.out.println("\u001B[31m"+str+ "\u001B[0m");
    }
    static void printgreen(String str){
    System.out.println("\u001B[32m"+str+ "\u001B[0m");
    }
    public static void main(String[] args) {

        printred("Hello world ");
        printblue("Hello world ");
        printgreen("Hello world");
        // // printblue("[hello,world,this, is ,demo,text,hoo]");
        // System.out.println("hello world ");

        // printblue("hello world in blue ");

        // List<Integer> list = new Random().ints(50, 0, 100).boxed().collect(Collectors.toList());

        // printpurple(list.toString());

        // List<String> l = Arrays.asList("hello", "world", "hello ", "world");
        // printyellow(l.toString());

        // printred_bright("helo my string ");

        // printmagenta("I love magenta ");
        // System.out.println();
        // printred_bright(list.toString());
        // System.out.println();
        // printgreen_bright(list.toString());
        // System.out.println();

        // printblue_bright(list.toString());
    }
}