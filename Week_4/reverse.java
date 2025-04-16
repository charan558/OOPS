import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.next();
        int l=s1.length();
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));
        }
    }
}