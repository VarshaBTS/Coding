import java.util.Scanner;

class Mini_sum_array{

    public static void calculate_min_sum(int n1,int a1[],int n2, int a2[]){
        
    }

    public static void main(String args[]){

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
        for(int i=0;i<n1;i++){
            a2[i]=sc.nextInt();
        }

        calculate_min_sum(n1,a1,n2,a2);

        sc.close();

    }
}