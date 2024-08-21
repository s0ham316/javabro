import java.util.*;
public class hypotenuse {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st side of Right Angled Triangle ");
        double s1=scanner.nextDouble();
        System.out.println("Enter 2nd side of Right Angled Triangle ");
        double s2= scanner.nextDouble();
        s1=Math.pow(s1,2.0);
        s2=Math.pow(s2,2.0);
        double hyp=Math.sqrt(s1+s2);
        System.out.println("The Hypotenuse is "+hyp);
        scanner.close();
    }
}
