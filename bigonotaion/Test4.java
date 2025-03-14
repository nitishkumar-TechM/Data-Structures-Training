package bigonotaion;

// Space complexity

public class Test4 {

    public static void greet(String[] names) {
        // we check the additional space that we allocate relative to the size of input
        // int i => O(1)
        String[] copy = new String[names.length]; // O(n) -> Space

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);
        }
    }

    public static void main(String[] args) {
        String[] names = { "Nitish", "Abhishek", "Rahul" };
        greet(names);
    }
}
