import java.util.*;
class toLowerCase
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String s1=sc.next();
    String s2=s1.toUpperCase();
    System.out.println(s2);
    String s3=s2.toLowerCase();
    System.out.println(s3);
    }
}