import java.util.*;
class Logger{
    private static Logger instance; 
    private Logger(){}
    public static Logger getInstance(){ 
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println(message);
    }
}
public class SingletonTest{
    public static void main(String[] args){
        Logger l1 = Logger.getInstance();
        l1.log("First Log Message");

        Logger l2 = Logger.getInstance();
        l2.log("Second Log Message");

        if(l1==l2){
            System.out.println("Both have same instances\nSingleTon  Test Confirmed");
        }
        else{
            System.out.println("Both have different instances\nSingleTon Test failed");
        }
    }
}