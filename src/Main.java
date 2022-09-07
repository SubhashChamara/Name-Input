import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Please enter a text?:");
        String text = scn.nextLine();


        NewInput newInput = new NewInput(text);
        newInput.wordNew();




    }
}