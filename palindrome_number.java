import java.util.Scanner;

public class palindrome_number {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter Number: ");
        int num=sc.nextInt();
        palindrome(num);
        sc.close();
    }

    private static void palindrome(int num) {
        int r,sum=0,temp;
        temp=num;
        while(num>0){    
            r=num%10;  //getting remainder  
            sum=(sum*10)+r;    
            num=num/10;    
           }    
        if(temp==sum)    
           System.out.println("palindrome number ");    
        else    
           System.out.println("not palindrome");    
        
    }
    
}
