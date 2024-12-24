public class Invoice {
        private String partNumber;
        private String partDescription;
        private int quantity;
        private int pricePerItem;
    
        
        public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem) {
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.quantity = (quantity > 0) ? quantity : 0;
            this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0;
        }
    
        
        public int getInvoiceAmount() {
            return quantity * pricePerItem;
        }
    
        public static void main(String[] args) {
            Invoice invoice = new Invoice("A123", "Hammer", 10, 5);
            System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount()); 
    
            Invoice invalidInvoice = new Invoice("B456", "Drill", -5, -10);
            System.out.println("Invoice Amount: $" + invalidInvoice.getInvoiceAmount()); 
        }
    }
    
    

