import java.util.Scanner;
public class Momentum {

    
    public static void main(String[] args) {
        double momentum,mass,velocity;
        Scanner s=new Scanner(System.in);
        //ask for mass and velocity
        System.out.print("Enter Object Mass >");
        mass=s.nextDouble();
        System.out.println("Enter Object Velocity >");
        velocity=s.nextDouble();
        
        momentum=mass*velocity;
        System.out.println(String.format("The objects momentum is %.2f", momentum));
    }
    
}
