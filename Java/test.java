public class test {
    // Fields (or instance variables)
    int myNumber;
    String myString;

    // Constructor
    public test(int number, String text) {
        myNumber = number;
        myString = text;
    }

    // Method
    public void display() {
        System.out.println("Number: " + myNumber + ", String: " + myString);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an object of MyClass
        test obj = new test(5, "Hello");

        // Call the method
        obj.display();  // Output: Number: 5, String: Hello
    }
}
