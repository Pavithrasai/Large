import java.io.*;
import java.util.*;
import java.lang.*;
public class Number
{
public static void main(String[]args)
{
int a;
int b;
int c;
System.out.println("Enter the Numbers");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a>b)&&(a>c))
{
System.out.println(+a"is Largest Number");
}
else if(b>c)
{
System.out.println(+b"is Largest Number");
}
else
{
System.out.println(+c"is Largest Number");
}
}
}
