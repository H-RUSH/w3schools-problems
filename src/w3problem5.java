
import java.util.Scanner;

public class w3problem5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please write any number");
        int a=scanner.nextInt();
        int ans=1;
      
       for(int c=a;c>0;c--){
        ans=ans*c;
       }
       System.out.println(" "+ans);
       
    }
}
