public class Pro {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Series:");
        System.out.print(first + " " + second);
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
