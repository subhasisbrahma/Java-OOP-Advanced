
interface Calculatable {

    void calculate(int a, int b);

    // Default Method: Inherited by all child classes (Optional to override)
    default void welcome() {
        System.out.println("Interface Calculator.");
    }

    // Static Method: Belongs to the Interface...not the object
    static void displayInfo() {
        System.out.println("This interface supports Java 8 features.");
    }
}

class Add implements Calculatable {
    
    public void calculate(int a, int b) {
        System.out.println("Result of Addition: " + (a + b));
    }
}

class Sub implements Calculatable {
  
    public void calculate(int a, int b) {
        System.out.println("Result of Subtraction: " + (a - b));
    }

    
    public void welcome() {
        System.out.println("Subtraction Module.");
    }
}

public class InterfaceDefaultStaticMethod {
    public static void main(String[] args) {
        // Calling Static Method using Interface Name
        Calculatable.displayInfo();

        Add addObj = new Add();
        addObj.welcome();      // Calling inherited default method
        addObj.calculate(10, 5);

        Sub subObj = new Sub();
        subObj.welcome();      // Calling overridden default method
        subObj.calculate(10, 5);
    }
}