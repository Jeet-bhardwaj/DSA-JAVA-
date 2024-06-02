import java.util.Scanner;

public class LEET_CODE_SUM2 {
    public static void main(String []args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY ");
        int a = Integer.parseInt(s1.nextLine());
        System.out.println("ENTER THE Target value ");
        int t = Integer.parseInt(s1.nextLine());


        int ar1[]= new int[a];

        for(int i = 0; i<a; i++){

            System.out.println("ENTER THE ARRAY ar1[" + i + "]: \n");
            ar1[i] = Integer.parseInt(s1.nextLine());
        }
        s1.close();

        

        for(int n = 0 ; n < a ; n++){
            for(int m = 0 ; m < a; m++) 
            {
                if(ar1[n] + ar1[m] == t )
                { 
                    System.out.println("("+ ar1[n] + "," + ar1[m] + ")" );
                    break;
                }
            }
        }
        
    }
    
}
