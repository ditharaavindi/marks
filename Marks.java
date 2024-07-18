import java.util.Scanner;

public class Marks {
    public static void main(String[] argv) {
        String StudentName, Command;
        int total, average_s;
        int n = 0;

        Scanner keyboard = new Scanner(System.in);

        int[][] marks = new int[n][4];

        System.out.println("To Add student marks: add [student ID]");
        System.out.println("To Update student marks : update [student ID] [subject ID]");
        System.out.println("To check Average for a subject : average_s [subject ID]");
        System.out.println("To check Average for a student : average [student ID]");
        System.out.println("To calcutlate Total of a student : total [student ID]");
        System.out.println("Exit");

        System.out.print("Enter Command:");
        Command = keyboard.nextLine();

        switch (Command) {

            case Add:

                break;

            case Update:
                break;

            case Average:
                break;

            case Student_Average:
                break;

            case Total:
                break;

            default:

        }

    }
}