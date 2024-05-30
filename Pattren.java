import java.util.Scanner;

public class Pattren {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter no. Row and Commom /n");
        int row = Integer.parseInt(s1.nextLine());
        int colume = Integer.parseInt(s1.nextLine());
        s1.close();
        for(int i = 0; i<colume; i++){
            for(int j = 0; j<row; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}