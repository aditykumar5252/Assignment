class Rectangle {
    
    private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display the details
    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println(); 
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(10.0, 4.0);

        
        rectangle1.displayDetails();
        rectangle2.displayDetails();
    }
}

