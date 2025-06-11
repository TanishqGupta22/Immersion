import java.util.Scanner;
public class Volumeofcylinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input radius
            System.out.print("Enter the radius of the cylinder: ");
            double radius = scanner.nextDouble();

            // Input height
            System.out.print("Enter the height of the cylinder: ");
            double height = scanner.nextDouble();

            // Calculate volume
            double volume = Math.PI * radius * radius * height;

            // Output result
            System.out.println("Volume of the cylinder: " + volume);

            scanner.close();
        }
    }

