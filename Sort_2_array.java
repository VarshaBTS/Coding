import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_2_array {

    public static void Sort_array(int n1, int[] a1,int n2, int[] a2){
        int a3[]=new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++){
            a3[k]=a1[i];
            k++;
        }
        for(int i=0;i<n1;i++){
            a3[k++]=a2[i];

        }
        Arrays.sort(a3);

        System.out.println("Output: ");
        for(int j=0;j<a3.length;j++){
            System.out.println(a3[j]);
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1 for a1: ");
        int n1=sc.nextInt();
        int[] a1=new int[n1];
        System.out.println("Enter elements of a1: "); 
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }

        System.out.println("Enter n2 for a2: ");
        int n2=sc.nextInt();
        int[] a2=new int[n2]; 
        System.out.println("Enter elements of a2: "); 
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }

        Sort_array(n1,a1,n2,a2);

        
    }
    
}
