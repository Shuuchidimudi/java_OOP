public class Employee {
        private String firstName;
        private String lastName;
        private double monthlySalary;
        public Employee(String firstName, String lastName, double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0;
        }
    
        
        public double yearlySalary() {
            return monthlySalary * 12;
        }
        public void applyRaise(double percentage) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    
        public static void main(String[] args) {
            Employee employee1 = new Employee("John", "Doe", 30000);
            Employee employee2 = new Employee("Jane", "Smith", 35000);
    
            System.out.println("Employee 1 Yearly Salary: $" + employee1.yearlySalary());
            System.out.println("Employee 2 Yearly Salary: $" + employee2.yearlySalary());
            employee1.applyRaise(10);
            employee2.applyRaise(10);
            System.out.println("Employee 1 New Yearly Salary: $" + employee1.yearlySalary());
            System.out.println("Employee 2 New Yearly Salary: $" + employee2.yearlySalary());
        }
    }
    
    

