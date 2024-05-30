class Constructures{
    int y = 10;
    int x = 20;
     Constructures(){
        y = x = 0;
    }
}
public class JAVA_3 {
    public static void main(String []args){

        Constructures cn1 = new Constructures();
        System.out.println(cn1.y);
    }
    
}
