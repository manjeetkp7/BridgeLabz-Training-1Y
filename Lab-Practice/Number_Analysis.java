import java.util.Scanner;
public class Number_Analysis {
    /*2. Write a program to take user input for 5 numbers and check whether a number is positive,
    negative, or zero. Further for positive numbers check if the number is even or odd. Finally
    compare the first and last elements of the array and display if they equal, greater or less
     */
    public static void checkNumber(int[] num1){
        for(int i = 0;i<num1.length;i++){
            if(num1[i]>0){
                System.out.print(""+num1[i]+" is Positive");
                if(num1[i]%2==0){
                    System.out.println(",Even");
                }
                else{
                    System.out.println(",Odd");
                }
            }
            else if(num1[i]==0){
                System.out.println(""+num1[i]+" is Zero");
            }
            else{
                System.out.println(""+num1[i]+" is Negative");
            }
        }
        if(num1[0]==num1[num1.length-1]){
            System.out.println("first and last elements of the array are Equal");
        }
        else if(num1[0]>num1[num1.length-1]){
            System.out.println("first element of the array is greater than last");
        }
        else{
            System.out.println("first element of the array is less than last");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 numbers: ");
        int[] num = new int[5];
        for(int i =0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        checkNumber(num);
    }
}
