abstract class Ticket {

    public String ticketId;
    public String origin;
    public String destination;
    public String date;

    Ticket(String tId, String o, String d, String dt) {
        this.ticketId = tId;
        this.origin = o;
        this.destination = d;
        this.date = dt;
    }

    abstract double calculatePrice();
    abstract void displayInfo();
}

// ---------------- Standard Ticket ----------------
class StandardTicket extends Ticket {

    public String seatNumber;
    public double basePrice;

    public StandardTicket(String tId, String o, String d, String dt,
                          String sn, double bp) {
        super(tId, o, d, dt);
        this.seatNumber = sn;
        this.basePrice = bp;
    }

    @Override
    double calculatePrice() {
        int distanceFee = Math.abs(origin.length() - destination.length()) * 100;
        return basePrice + distanceFee;
    }

    @Override
    void displayInfo() {
        System.out.println("Standard Ticket");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Date: " + date);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + calculatePrice());
    }
}

// ---------------- First Class Ticket ----------------
class FirstClassTicket extends Ticket {

    public String seatNumber;
    public double basePrice;
    public double surcharge;

    public FirstClassTicket(String tId, String o, String d, String dt,
                            String sn, double bp, double sc) {
        super(tId, o, d, dt);
        this.seatNumber = sn;
        this.basePrice = bp;
        this.surcharge = sc;
    }

    @Override
    double calculatePrice() {
        int distanceFee = Math.abs(origin.length() - destination.length()) * 100;
        return basePrice + distanceFee + surcharge;
    }

    @Override
    void displayInfo() {
        System.out.println("First Class Ticket");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Date: " + date);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + calculatePrice());
    }
}

// ---------------- Main Class ----------------
public class Abstract_Ticket_Pricing_System_Standard_FirstClass {

    public static void main(String[] args) {

        StandardTicket st = new StandardTicket(
                "ST05101056", "Domar", "Dhaka",
                "2025-06-10", "UMA-3", 1271.0
        );

        FirstClassTicket fct = new FirstClassTicket(
                "FCT08102056", "Dhaka", "Cox's Bazar",
                "2025-06-11", "KHA-LO-3", 2333.0, 1062.0
        );

        st.displayInfo();
        System.out.println();
        fct.displayInfo();
    }
}