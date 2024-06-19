import java.util.Scanner;

public class Basic_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res=findSum(num);
        System.out.println("The sum of the natural numbers is " + res);
        sc.close();
    }

    public static int findSum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+findSum(n-1);
        }

    }

    
    
}
