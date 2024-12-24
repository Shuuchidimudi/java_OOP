public class HageInteger {
        private int[] digits = new int[40];
    
        public HageInteger(String number) {
            for (int i = 0; i < number.length(); i++) {
                digits[i] = Character.getNumericValue(number.charAt(i));
            }
        }
    
        public void print() {
            for (int digit : digits) {
                System.out.print(digit);
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            HageInteger hugeInt = new HageInteger("1234567890123456789012345678901234");
            hugeInt.print();
        }
    }
    
    

