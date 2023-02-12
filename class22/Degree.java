package class22;

public class Degree {
    void getPrerequisite(){
        System.out.println("to get degree we need a high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("to get a Masters degree we need a Bachelor degree first");
    }
}
class DegreeTester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();

    }
}