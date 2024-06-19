import java.util.Scanner;

public class Basic_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res=findFi(num);
        System.out.println("The Fibonacci of this number is " + res);
        sc.close();
    }

    public static int findFi(int n){
        if(n<=1){
            return n;
        }
        else{
            return findFi(n-1)+findFi(n-2);
        }

    }

    
    
}
