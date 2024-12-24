public class Complex {
        private double real, imaginary;
    
        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }
    
        public Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imaginary + other.imaginary);
        }
    
        public Complex subtract(Complex other) {
            return new Complex(this.real - other.real, this.imaginary - other.imaginary);
        }
    
        public void printComplex() {
            System.out.println("(" + real + ", " + imaginary + "i)");
        }
    
        public static void main(String[] args) {
            Complex num1 = new Complex(3, 4);
            Complex num2 = new Complex(1, 2);
    
            num1.printComplex();
            num2.printComplex();
    
            Complex sum = num1.add(num2);
            sum.printComplex();
        }
    }
    
    

