public class Odd_Even_Counter_Array {
    public static void main(String[] args) {

        int[] arr = {10, 21, 33, 47, 55, 77, 88, 99};

        int oddCount = 0;
        int evenCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("ODD: " + oddCount);
        System.out.println("EVEN: " + evenCount);
    }
}