package bigonotaion;

public class Test3 {

    public static void log(int[] numbers) {
        // O(n * n) => O(n^2) => Quadratic
        // O(n + n^2) = O(n^2)
        for (int num : numbers) { // O(n)
            System.out.println(num);
        }
        for (int first = 0; first < numbers.length; first++) { // O(n)
            for (int second = 0; second < numbers.length; second++) { // O(n)
                System.out.println(numbers[first] + ", " + numbers[second]);
            }
        }

    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        log(numbers);
    }

}
