import java.util.Scanner;
class Person
{
    String Name;
    String Gender;
    String Address;
    int Age;

    Person()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name : ");
        Name=sc.next();
        System.out.println("Enter the Gender : ");
        Gender=sc.next();
        System.out.println("Enter the Address : ");
        Address=sc.next();
        System.out.println("Enter the Age : ");
        Age=sc.nextInt();
    }
}
class Employee extends Person
{
    int Empid;
    String Company_name;
    String Qualification;
    int Salary;

    Employee()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee Id : ");
        Empid=sc.nextInt();
        System.out.println("Enter the Company name : ");
        Company_name=sc.next();
        System.out.println("Enter the Qualification : ");
        Qualification=sc.next();
        System.out.println("Enter the Salary : ");
        Salary=sc.nextInt();

    }

}
class Teacher extends Employee
{
    String Subject;
    String Department;
    int Teacherid;

    Teacher ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the subject : ");
        Subject=sc.next();
        System.out.println("Enter the Department : ");
        Department=sc.next();
        System.out.println("Enter the Teacher Id : ");
        Teacherid=sc.nextInt();
    }
    void display()
    {
        System.out.println("\t\t\tName of Employee : "+ super.Name);
        System.out.println("\t\t\tGender : "+ super.Gender);
        System.out.println("\t\t\tAddress : "+ super.Address);
        System.out.println("\t\t\tAge : "+ super.Age);
        System.out.println("\t\t\tEmployee id : "+ super.Empid);
        System.out.println("\t\t\tCompany Name : "+ super.Company_name);
        System.out.println("\t\t\tQualification : "+ super.Qualification);
        System.out.println("\t\t\tEmployee Salary : "+ super.Salary);
        System.out.println("\t\t\tTeacher Id : "+ Teacherid);
        System.out.println("\t\t\tDepartment : "+ Department);
        System.out.println("\t\t\tSubject Tought : "+ Subject);
        System.out.println("\t\t___________________________________\n");
    }

}
class multilevel
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Teacher : ");
        int size=sc.nextInt();
        Teacher t[]=new Teacher[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("------------------------------------");
            System.out.println("employee "+(i+1));
            System.out.println("------------------------------------");
            t[i]=new Teacher();
        }
        for(int i=0;i<size;i++)
        {
            t[i].display();
        }
    }
}