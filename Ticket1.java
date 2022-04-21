public class Ticket1 {
    
  
        private int ticketid;
        private int price;
        private static int availableTickets;
        
        
        
        public int getTicketid() {
            return ticketid;
        }
    
    
    
        public void setTicketid(int ticketid) {
            this.ticketid = ticketid;
        }
    
    
    
        public int getPrice() {
            return price;
        }
    
    
    
        public void setPrice(int price) {
            this.price = price;
        }
    
    
    
        public static int getAvailableTickets() {
            return availableTickets;
        }
    
    
    
        public static void setAvailableTickets(int availableTickets) {
            if(availableTickets<0) {
                System.out.println(" ticket not available ");
            }
            else {
                Ticket1.availableTickets = availableTickets;
            }
            
        }
    
    
        public int calculateTicketCost(int nooftickets) {
                if(nooftickets<=getAvailableTickets()) {
                    setAvailableTickets((getAvailableTickets()-nooftickets));
                    return nooftickets*getPrice();
                }
                else {
                    return -1;
                }
                
        }
        
        
        
    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
    
        }
    
    
    
    
    }

