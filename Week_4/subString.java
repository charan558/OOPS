import java.util.*;

public class subString {
    String s;
    int p,q;
    public void setS(String s) {
        this.s = s;
    }
    public void sub(){
        System.out.println(s.substring(p,q));
    }
}
class subString_main{
    public static void main(String[] args)
     {
        int p,q;
        Scanner sc=new Scanner(System.in);
        subString ss=new subString();
        System.out.println("enter the string: ");
        ss.s=sc.next();
        System.out.println("enter the starting and end index");
        ss.p=sc.nextInt();
        ss.q=sc.nextInt();
        ss.sub();
    }
}