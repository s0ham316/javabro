import java.util.*;
public class randomnumbergen {
    public static void main(String[] args){
        Random random=new Random();
        //without bounds this generates random integers including negative
        int x=random.nextInt();
        //because of bound it is limited from 0 to the upperbound int, lower not possible
        int y=random.nextInt(10);
        //any fraction between 0 and 1, works like Math.random
        double z= random.nextDouble();
        System.out.println(z);
        z=Math.random();
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
        boolean a=random.nextBoolean();
        System.out.println(a);
    }
}
