public class Lab_03_package {
    public static void main(String[] args) {

        int m = 80;
        m = m / 10;

        switch (m) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("F");
                break;

            case 6:
                System.out.println("B");
                break;

            case 7:
                System.out.println("A");
                break;

            case 8:
            case 9:
            case 10:
                System.out.println("A+");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}