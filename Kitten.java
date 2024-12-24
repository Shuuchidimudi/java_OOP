public class Kitten {
        private String name, owner;
        private int age = 0;
    
        public Kitten(String name, String owner) {
            this.name = name;
            this.owner = owner;
        }
    
        public void haveBirthday() { age++; }
    
        public String toString() { return name + " is " + age + " and belongs to " + owner; }
    
        public static void main(String[] args) {
            Kitten kitten = new Kitten("Bob", "Gregor Samsa");
            System.out.println(kitten);
            kitten.haveBirthday();
            System.out.println(kitten);
        }
    }
    
        
    

