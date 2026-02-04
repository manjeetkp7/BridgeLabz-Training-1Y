import java.util.Scanner;
public class Voting_Eligibility {
    /*1. Write a program to take user input for the age of all 10 students in a class and check
whether the student can vote depending on his/her age is greater or equal to 18.

     */
    public static void adult(int[] age){

       for(int i=0;i<10;i++){
           if(age[i]>=18){

              System.out.println("Student "+(i+1)+" is Eligible.");

           }else{
               System.out.println("Student "+(i+1)+" is not Eligible.");
           }
       }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter students age:");
        for(int i=0;i<10;i++){
            System.out.print(" "+(i+1)+".");
            ages[i] = sc.nextInt();

        }
        adult(ages);
    }
}
