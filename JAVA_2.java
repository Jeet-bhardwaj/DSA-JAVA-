class JAVA_3{
    static void fun4(){
        System.out.println("fun4");
    }
}
public class JAVA_2 {
    static void fun1(){
        System.out.println("fun1");
    }
    static void fun2(){
        System.out.println("fun2");
    }
    public static void main(String args[]){
        fun2();
        fun1();
        JAVA_3.fun4();

    }
    
}
