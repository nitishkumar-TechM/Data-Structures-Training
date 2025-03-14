package bigonotaion;

public class Test2 {

    public static void log(int[] numbers, String[] names) {
        // O(n) => Linear
        for (int i = 0; i < numbers.length; i++) { // O(n)
            System.out.println(numbers[i]);
        }

        for (String string : names) { // O(m)
            System.out.println(string);
        }

    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        String[] names = { "Nitsh", "Shrey", "Rahul" };
        log(numbers, names);
    }

}
