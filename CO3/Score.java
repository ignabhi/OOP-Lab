import java.util.Scanner;
interface Student
{
void Aca_data(String name,int reg,float m1,float m2,float percentage);
}
interface Sports
{
void spo_score(String item,int rank);
} 
class Result implements Student,Sports
{
    String name;
    int reg;
    float m1;
    float m2;
    float percentage;
    String item;
    int rank;
    public void Aca_data(String name,int reg,float m1,float m2,float percentage)
    {
        this.name=name;
        this.reg=reg;
        this.m1=m1;
        this.m2=m2;
        this.percentage=percentage;
    }
    public void spo_score(String item,int rank)
    {
        this.item=item;
        this.rank=rank;

    }
    void display()
    {
        System.out.println("-----------ACADAMIC INFO-----------");
        System.out.println("NAME : "+name);
        System.out.println("REGISTER NUMBER : "+reg);
        System.out.println("MARK IN SUBJECT 1 : "+m1);
        System.out.println("MARK IN SUBJECT 2 : "+m2);
        System.out.println("ACADAMIC PERCENTAGE : "+percentage);
        System.out.println("-----------SPORTS INFO-----------");
        System.out.println("MAIN SPORTS ITEM : "+item);
        System.out.println("RANK : "+rank);
    }
    

}
class Score
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Result R=new Result();
        System.out.println("Enter the name : ");
        String name=sc.next();
        System.out.println("Enter the Reg.number : ");
        int reg=sc.nextInt();
        System.out.println("Enter the mark of subject 1 : ");
        float m1=sc.nextFloat();
        System.out.println("Enter the mark of subject 2 : ");
        float m2=sc.nextInt();
        float percentage=((m1+m2)/200)*100f;
        System.out.println("Enter the main sports item : ");
        String item=sc.next();
        System.out.println("Rank obtain in  main sports item : ");
        int rank=sc.nextInt();

        R.Aca_data(name,reg,m1,m2,percentage);
        R.spo_score(item,rank);
        R.display();
        
    }
}