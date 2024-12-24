public class Rectangle {
        private double length;
        private double width;
    
        
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
    
        
        public double calculateArea() {
            return length * width;
        }
    
    
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    
        
        public static void main(String[] args) {
            Rectangle rect = new Rectangle(5, 3);
            System.out.println("Area: " + rect.calculateArea()); 
            System.out.println("Perimeter: " + rect.calculatePerimeter());
        }
    }
    

