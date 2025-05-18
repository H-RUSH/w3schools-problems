
import java.util.Scanner;

public class w3problem7 {
    public static void main(String[] args) {
       try( Scanner scanner=new Scanner(System.in)){
        System.out.print("please inter your money:");
        double P=scanner.nextDouble();
        System.out.print("please inter your year:");
       double n=scanner.nextDouble();
        System.out.print("please inter your interest rate:");
      double r=scanner.nextDouble(); 
     
       double I=P*n*(r/100);
      
        System.out.println("the value of ur interest:"+I);
       
    }
}
}