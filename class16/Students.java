package class16;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String Name;
    String id;
    static int  numberOfStudents;

    public static void main(String[] args) {

        Students nezir = new Students();
        nezir.Name = "nezir";
        nezir.id = "1";
        nezir.numberOfStudents++;

        Students ardasher = new Students();
        ardasher.Name = "nezir";
        ardasher.id = "2";
        ardasher.numberOfStudents++;
        System.out.println(Students.numberOfStudents);


    }

}
