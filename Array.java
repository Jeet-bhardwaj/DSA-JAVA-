import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] storage  = new int[3];
        Scanner s1 =  new Scanner(System.in);
        
        for(int i = 0; i < storage.length; i++ ){
            storage[i] = Integer.parseInt(s1.nextLine());
        }
        for(int j = 0; j < storage.length; j++ ){
            System.out.print( storage[j]);
        }
        s1.close();
    }
    
}
