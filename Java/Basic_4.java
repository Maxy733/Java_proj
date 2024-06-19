import java.util.Scanner;

public class Basic_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res=findSum(num);
        System.out.println("The sum of the natural numbers is " + res);
        sc.close();
    }

    public static int findSum(int n){
        //n=Math.abs(n);
        if(n<10){
            return n;
        }
        else{
            int l = n % 10;
            int rn = n/10;
            return l+findSum(rn);
        }

    }

    
    
}
