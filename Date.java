public class Date {
        private int month;
        private int day;
        private int year;
        public Date(int month, int day, int year) {
            this.month = (month >= 1 && month <= 12) ? month : 1;  
            this.day = day;
            this.year = year;
        }
        public void displayDate() {
            System.out.println(month + "/" + day + "/" + year);
        }
    
        public static void main(String[] args) {
            Date date1 = new Date(13, 25, 1999);  
            Date date2 = new Date(5, 15, 2024);   
    
            date1.displayDate();  
            date2.displayDate();   
        }
    }
    
    

