package bigonotaion;

class InnerTest1 {
    public void log(int[] numbers) {
        // O(1) => Linear
        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[0]); // O(1)
    }
}

public class Test1 {

    public static void main(String[] args) {
        InnerTest1 test = new InnerTest1();
        int[] numbers = { 1, 2, 3 };
        test.log(numbers);
    }
}
