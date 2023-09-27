import java.util.Scanner;

public class Circle {

    private double radius;
    private String colour;

    //these constructors are called overload constructor since there are multiple

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Circle(double radius){
        this.radius = radius;
        this.colour = "red";
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double square = radius*radius;
        return 3.5 *square;
    }




    public static void main(String[] args) {

        Circle myCircle1 = new Circle(1.8,"red");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter input you want for radius");
        int i = scanner.nextInt();
        Circle myCircle2 = new Circle(i);

        System.out.println(myCircle2.getRadius());
        System.out.println(myCircle2.getArea());

    }


}
