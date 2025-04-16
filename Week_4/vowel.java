
                                import java.util.*;
                                class vowel{
                                    public static void main(String args[])
                                    {
                                        int c=0,cc=0;
                                        String s1,s3;
                                    Scanner sc=new Scanner(System.in);
                                    System.out.println("entrt the string ");
                                    s1=sc.next();
                                    s3=s1.toLowerCase();
                                    int l=s1.length();
                                    for( int i=0;i<l;i++)
                                 {
                                    if(s3.charAt(i)=='a'|| s3.charAt(i)=='e'|| s3.charAt(i)=='i'||s3.charAt(i)=='o'||s3.charAt(i)=='u')
                                        {
                                              c++;
                                             System.out.println("vowel");
                                             System.out.println(s3.charAt(i));
                                        }
                                    else{
                                            if(s3.charAt(i)!='a'|| s3.charAt(i)!='e'|| s3.charAt(i)!='i'||s3.charAt(i)!='o'||s3.charAt(i)!='u')
                                            {
                                                  cc++;
                                                 System.out.println("consonant");
                                                System.out.println(s3.charAt(i));
                                             }
                                        }
                                 }
                                System.out.println("No. of vowels= "+c);
                                System.out.println("No. of consonants= "+cc);
                                    }
                                }