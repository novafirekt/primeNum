import java.util.Scanner;

public class primeNum {

    public static void primeCheck(int n){
        int m=n/2;
        if(n>1){
            for(int i=2;i<m;i++){
                if(n%i==0){
                    System.out.println("The Number Is Not A primeNum . ");
                    break;
                }
                else{
                    System.out.println("The Number Is primeNum . ");
                    break;
                }
            }
        }
        else{
            System.out.println("The Number Is Not A primeNum . ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The num to check whether is it prime num : ");
        int num = sc.nextInt();
        primeCheck(num);
    }
}
