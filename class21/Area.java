package class21;

public class Area {
    void calculateArea(double lenght, double width){
        System.out.println("Area of rectangle is "+(lenght*width));
    }

    void calculateArea(double side){
        System.out.println("Area of rectangle is "+(side*side));
    }

    public static void main(String[] args) {

        Area area=new Area();
        area.calculateArea(10);
        area.calculateArea(10,5);
    }
}

