import java.util.Scanner;

public class Package {
    private double length;
    private double width;
    private double height;
    //Scanner object as private member
    private Scanner input = new Scanner(System.in);
    //default constructor
    public Package() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }
    //Parameterized constructor
    public Package(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }
    //copy constructor
    public Package(Package p) {
        this.length = p.length;
        this.width = p.width;
        this.height = p.height;
    }
    //function to input length from user
    public void inputLength(){
        System.out.print("Enter length: ");
        length = input.nextDouble();
    }
    //function to input width from user
    public void inputWidth(){
        System.out.print("Enter width: ");
        width = input.nextDouble();
    }
    //function to input height from user
    public void inputHeight(){
        System.out.print("Enter height: ");
        height = input.nextDouble();
    }
    //this function will display the dimensions
    public void displayDimensions(){
        System.out.print(length+ " X " + width+" X "+ height);
    }
    //this function will calculate the volume of the dimensions
    public double calcVolume(){
        return length*width*height;
    }
}
