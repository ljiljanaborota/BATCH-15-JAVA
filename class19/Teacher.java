package class19;

public class Teacher {
     String name;
     int teacherId;
     String subject;   // this is instance variable

      // now we are creating constructor and we will initialize 2variable
     Teacher(String name,int teacherId){
         this.name=name;
         this.teacherId=teacherId;

     }
     // now we are creating another constructor and we initialize all 3 variable
      Teacher(String name,int teacherId,String subject){
      //   this.name=name; // already initialize in first constr.
      //   this.teacherId=teacherId;// already initialize in first constr.
          this(name,teacherId);
         this.subject=subject;

      }
}
