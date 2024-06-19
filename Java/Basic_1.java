import java.util.Scanner;

public class Basic_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res=findFact(num);
        System.out.println("The factorial of the number is " + res);
        sc.close();
    }

    public static int findFact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*findFact(n-1);
        }

    }

    
    
}
