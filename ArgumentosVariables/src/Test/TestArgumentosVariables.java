package Test;

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        printNumber(3,4,5);
        printNumber(1,2);
        someParameters("Alex", 8, 9, 10);
    }
    
    private static void someParameters(String name, int...numbers){
        System.out.println("Name: " + name);
        printNumber(numbers);
    }
    
    private static void printNumber(int...numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element: " + numbers[i]);
        }
    }
}
