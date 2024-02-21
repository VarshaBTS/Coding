import java.util.Scanner;

class Mini_sum_array{

    public static void calculate_min_sum(int n1,int a1[],int n2, int a2[]){
        int c1=0;
        int c2=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n1;i++){
            sum1=sum1+a1[i];
            if(a1[i]==0){
                c1++;
            }
        }
        for(int j=0;j<n2;j++){
            sum2=sum2+a2[j];
            if(a2[j]==0){
                c2++;
            }
        }
        if(sum1>sum2){
            for(int i=0;i<n1;i++){
                if(a1[i]==0){
                    a1[i]=1;
                    sum1=sum1+a1[i];
                }
                
            }
            
            System.out.println("Sum: "+sum1);

        }
        else{
            for(int j=0;j<n2;j++){
                if(a2[j]==0){
                    a2[j]=1;
                    sum2=sum2+a2[j];
                }
            }
            System.out.println("Sum: "+sum2);
        }

        //System.out.println("Sum1="+sum1+" sum2="+sum2);
        System.out.println("Count1="+c1+" Count2="+c2);
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
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }

        calculate_min_sum(n1,a1,n2,a2);

        sc.close();

    }
}
