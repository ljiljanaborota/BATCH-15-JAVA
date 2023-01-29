package class16;

public class SyntaxEmployee {
    String empId;// because we have a lot of employee we used instance
    double salary;// because we have a lot of employee we used instance
    String CEO="Sumair";// one ceo for whole company this one we create static

    /*
    Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */
    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empId="s123";
        emp1.salary=10000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empId="s124";
        emp2.salary=12000;
        System.out.println(emp1.empId);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);

    }


}
