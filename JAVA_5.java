abstract class Bank{
    double rateOfinst;
    public abstract void intreastRate();
    
}
class FixedDoposit  extends Bank {
    
    @Override
    public void intreastRate(){
        rateOfinst = 7.5;
    }
}
public class JAVA_5 {
    public static void main(String args[]){
        FixedDoposit fd = new FixedDoposit();
        System.out.println(fd.rateOfinst);
    }
    
}
