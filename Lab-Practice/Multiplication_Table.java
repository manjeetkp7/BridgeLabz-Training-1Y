import java.util.Scanner;
public class Multiplication_Table {
    public static void calculate_table(int num){
        int[] table = new int[10];

        for(int i = 0;i<10;i++){
            table[i] = num*(i+1);
        }
        System.out.println("Table of "+num);
        for(int i = 0;i<10;i++){
            System.out.println(table[i]);
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        calculate_table(num);
    }
}
