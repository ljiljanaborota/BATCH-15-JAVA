package class16;

public class Task4 {
    // Create a method that will say Hello in different language based on the country
    // that will be passed when method is executed
  //  return type===> String or void
    // name= sayHello
    //parameter ==> String countryName
      String sayHello(String countryName){
         switch (countryName){
             case "usa":
                 return "hello";
             case "kazakhstan":
                 return "salem";
             case"italy":
                 return "ciao";
             case "china":
                 return "ni hao";
             default:
                 return "country not supported";
         }

    }

    public static void main(String[] args) {
          Task4 task4=new Task4();
        System.out.println(task4.sayHello("china"));
    }


}
