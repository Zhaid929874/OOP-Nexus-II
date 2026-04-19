import java.util.ArrayList;
import java.util.Scanner;

// ---------------- Abstract Class ----------------
abstract class Ticket {
    public String ticket_id;
    public String origin;
    public String destination;
    public String date;

    Ticket(String t_i, String o, String de, String d) {
        this.ticket_id = t_i;
        this.origin = o;
        this.destination = de;
        this.date = d;
    }

    abstract double calculate_price();
    abstract void display_info();
}

// ---------------- Standard Ticket ----------------
class StandardTicket extends Ticket {
    public String seat_number;
    public double base_price;

    public StandardTicket(String t_i, String o, String de, String d, String sn, double bp) {
        super(t_i, o, de, d);
        this.seat_number = sn;
        this.base_price = bp;
    }

    double calculate_price() {
        int distance_fee = Math.abs(origin.length() - destination.length()) * 100;
        return base_price + distance_fee;
    }

    void display_info() {
        System.out.println("Standard Ticket");
        System.out.println("Ticket ID: " + ticket_id);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Date: " + date);
        System.out.println("Seat Number: " + seat_number);
        System.out.println("Price: " + calculate_price());
    }
}

// ---------------- First Class Ticket ----------------
class FirstClassTicket extends Ticket {
    public String seat_number;
    public double base_price;
    public double surcharge;

    public FirstClassTicket(String t_i, String o, String de, String d,
                            String sn, double bp, double sc) {
        super(t_i, o, de, d);
        this.seat_number = sn;
        this.base_price = bp;
        this.surcharge = sc;
    }

    double calculate_price() {
        int distance_fee = Math.abs(origin.length() - destination.length()) * 100;
        return base_price + distance_fee + surcharge;
    }

    void display_info() {
        System.out.println("First Class Ticket");
        System.out.println("Ticket ID: " + ticket_id);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Date: " + date);
        System.out.println("Seat Number: " + seat_number);
        System.out.println("Price: " + calculate_price());
    }
}

// ---------------- Ticket Manager ----------------
class TicketManager {
    private ArrayList<Ticket> tickets;

    public TicketManager() {
        tickets = new ArrayList<>();
    }

    public void add_ticket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Ticket added successfully.");
    }

    public boolean del_ticket(String ticket_id) {
        for (Ticket t : tickets) {
            if (t.ticket_id.equals(ticket_id)) {
                tickets.remove(t);
                System.out.println("Ticket removed.");
                return true;
            }
        }
        System.out.println("Ticket not found.");
        return false;
    }

    public Ticket search_info(String ticket_id) {
        for (Ticket t : tickets) {
            if (t.ticket_id.equals(ticket_id)) {
                return t;
            }
        }
        return null;
    }

    public double total_revenue() {
        double total = 0;
        for (Ticket t : tickets) {
            total += t.calculate_price();
        }
        return total;
    }
}

// ---------------- Main Class ----------------
public class Menu_Driven_Ticket_Management_System_Abstract {

    private static Scanner scanner = new Scanner(System.in);
    private static TicketManager TM = new TicketManager();

    public static void main(String[] args) {

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Create new ticket");
            System.out.println("2. Display ticket information by ID");
            System.out.println("3. Search for ticket by ID");
            System.out.println("4. Calculate total revenue");
            System.out.println("5. Delete ticket by ID");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createTicket();
                    break;
                case 2:
                    displayTicketInfo();
                    break;
                case 3:
                    searchTicket();
                    break;
                case 4:
                    calculateTotalRevenue();
                    break;
                case 5:
                    deleteTicket();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void createTicket() {

        System.out.println("1. Standard Ticket\n2. First Class Ticket");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Ticket ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Origin: ");
        String origin = scanner.nextLine();

        System.out.print("Enter Destination: ");
        String dest = scanner.nextLine();

        System.out.print("Enter Date: ");
        String date = scanner.nextLine();

        System.out.print("Enter Seat Number: ");
        String seat = scanner.nextLine();

        System.out.print("Enter Base Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        if (type == 1) {
            TM.add_ticket(new StandardTicket(id, origin, dest, date, seat, price));
        } else {
            System.out.print("Enter Surcharge: ");
            double sc = Double.parseDouble(scanner.nextLine());
            TM.add_ticket(new FirstClassTicket(id, origin, dest, date, seat, price, sc));
        }
    }

    private static void displayTicketInfo() {
        System.out.print("Enter ID: ");
        Ticket t = TM.search_info(scanner.nextLine());
        if (t != null) t.display_info();
        else System.out.println("Not found.");
    }

    private static void searchTicket() {
        System.out.print("Enter ID: ");
        Ticket t = TM.search_info(scanner.nextLine());
        if (t != null) t.display_info();
        else System.out.println("Not found.");
    }

    private static void calculateTotalRevenue() {
        System.out.println("Total Revenue: " + TM.total_revenue());
    }

    private static void deleteTicket() {
        System.out.print("Enter ID: ");
        TM.del_ticket(scanner.nextLine());
    }
}