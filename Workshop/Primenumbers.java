package assignment;
public class Primenumbers {
    public static void main(String args[]){
        for(int i=2;i<=97;i++){
            if(numfactor(i)==0){
                System.out.println(i);
            }
        }
    }
    public static int numfactor(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                sum++;
            }
            if(sum==3){
                break;
            }
        }
        if(sum==2){
            return 0;
        }
        return 1;
    }
}
