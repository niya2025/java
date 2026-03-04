import java.util.Scanner;
class person{
String name;
String gender;
String address;
int age;

         // Parametrized Constructor
public person(String name, String gender, String address, int age) {
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}

public void display() {
System.out.println("Name:"+name);
System.out.println("Gender:"+gender);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
}
}


class Employee extends person{
int empid;
String companyName;
String qualification;
double salary;
                      // Parametrized Constructor
public Employee(String name, String gender, String address, int age,int empid, String companyName, String qualification,double salary) 
{
super(name,gender,address,age);
this.empid=empid;
this.companyName=companyName;
this.qualification=qualification;
this.salary=salary;
}

@Override
public void display() {
super.display();
System.out.println("Empid:"+empid);
System.out.println("CompanyName:"+companyName);
System.out.println("Qualification:"+qualification);
System.out.println("Salary:"+salary);

}
}

class Teacher extends Employee{
String subject;
String department;
int teacherid;

         // Parametrized Constructor
 public Teacher(String name, String gender, String address, int age,
 int empid, String companyName, String qualification,
double salary,
 String subject, String department, int teacherid) {
 super(name,gender,address,age,empid,companyName,qualification,salary);
 this.subject=subject;
 this.department=department;
 this.teacherid=teacherid;
}

@Override
public void display() {
super.display();
System.out.println("Subject:"+subject);
System.out.println("Department:"+department);
System.out.println("Teacherid:"+teacherid);
System.out.println("--------------------------");
}
}
              //main class
public class MultilevelInheritanceDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of teachers (N): ");
 int n = sc.nextInt();

Teacher[] teachers=new Teacher[n];
for (int i = 0; i < n; i++) {
 System.out.println("\n--- Enter Details for Teacher " + (i + 1)
+ " ---");
 sc.nextLine(); // Consume dangling newline

        // --- Boilerplate Input Section (Given) ---
System.out.print("Name: ");
 String name = sc.nextLine();
System.out.print("Gender: ");
String gender = sc.nextLine();
System.out.print("Address: ");
 String address = sc.nextLine();
System.out.print("Age: ");
 int age = sc.nextInt();

 System.out.print("Employee ID: ");
int empid = sc.nextInt();
 sc.nextLine();

 System.out.print("Company Name: ");
String companyName = sc.nextLine();
 System.out.print("Qualification: ");
String qualification = sc.nextLine();
 System.out.print("Salary: ");
double salary = sc.nextDouble();

 sc.nextLine();
 System.out.print("Teacher ID: ");
 int teacherid = sc.nextInt();
 sc.nextLine();

 System.out.print("Subject: ");
 String subject = sc.nextLine();
  System.out.print("Department: ");
 String department = sc.nextLine();

teachers[i] = new Teacher(name, gender, address, age,
                    empid, companyName, qualification, salary,
                    subject, department, teacherid);
        }

System.out.println("\n========================================");
 System.out.println(" TEACHER RECORDS");
System.out.println("========================================");
for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}

