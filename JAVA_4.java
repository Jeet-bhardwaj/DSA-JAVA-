
class Thisclass{
    
    int x = 2;
    int y  =10;
    
    void fun(int x , int y){
        this.x = x;
        this.y = y ;
    }
}
public class JAVA_4 {
    public static void main(String []args){
        Thisclass h1 = new Thisclass();
        h1.fun(9, 90);
        System.out.println(h1.x);
        System.out.println(h1.y);
    }
}
