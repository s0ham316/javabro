import java.util.*;
public class userinput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name=scanner.nextLine();
        System.out.println("How old are you? ");
        int age=scanner.nextInt();
        //this scanner.nextLine() is needed to move cursor to next line
        //else the enter induces \n and the string input is skipped
        //this is cuz after we press enter after int input \n remains
        scanner.nextLine();
        System.out.println("What is your favourite food?");
        String food=scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Your age is "+age);
        System.out.println("You like to eat "+food);
    }
}
