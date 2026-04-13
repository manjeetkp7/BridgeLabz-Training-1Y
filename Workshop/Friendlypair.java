package assignment;
import java.util.*;
public class Friendlypair {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number  ");
        int a=sc.nextInt();
        System.out.print("Enter the second number  ");
        int b=sc.nextInt();
        double c=sumfactor(a);
        double d=sumfactor(b);
        if(a/c==b/d) {
            System.out.println("Yes , they are friendly pairs");
        }
        else{
            System.out.println("No , they are not friendly pairs");
        }
    }
    public static int sumfactor(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
