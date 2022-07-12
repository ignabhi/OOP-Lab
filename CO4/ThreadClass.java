import java.lang.*;
import java.util.*;
class multiplication extends Thread
{
 public synchronized void run()
{
    try
    {  
    for(int i=1;i<=10;i++)
    {
        System.out.println(i+" * 5 = "+(i*5));
        Thread.sleep(500);
    }
  
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
    
}
class prime extends Thread
{
int num;

public synchronized void run()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("count of first N prime numbers : ");
    int n=sc.nextInt();
    System.out.println("------ PRIME NUMBERS ARE ------");
    for(int i=2;i<100;i++)
    {
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if (i%j==0)
            {
                count=count+1;
            }

        }
        if(count==2)
        {
            System.out.print(i+ "  ");
            num=num+1;

        }
        if (num==n)
        {
        break;
        }
    }
    try{  
        Thread.sleep(500);  
       }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
public class ThreadClass
{
    public static void main(String args[]) {
    multiplication m=new multiplication();
    prime p=new prime();
    m.start();
    p.start();
    }
}