// unsolved probelm.exe
import java.util.Stack;

public class w3problem4 {
    public static void main(String[] args) {
        Stack hs =new Stack();
        int a= 10;
        int b=2;
        int c;
        while(a/b==0){
            c=a%b; 
            hs.push(c);
            c=c/2;
        }
        System.out.println(hs.pop());
        System.out.println("hellow");

    }
}
