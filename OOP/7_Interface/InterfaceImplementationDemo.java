import java.util.Scanner;

interface Calculatable {
    public void add();
    public void sub();
}

class Casio implements Calculatable {
    public void add() {
        int a = 100;
        int b = 50;
        int c = a + b;
        System.out.println(c);
    }

    public void sub() {
        int a = 100;
        int b = 50;
        int c = a - b;
        System.out.println(c);
    }
}

class Orpat implements Calculatable { 
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        int c = a + b;
        System.out.println(c);
    }

    public void sub() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        int c = a - b;
        System.out.println(c);
    }
}

class Citizen implements Calculatable {
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        int c = a - (-b);
        System.out.println(c);
    }

    public void sub() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        int c = a + (-b);
        System.out.println(c);
    }
}

class Math {
    public void permit(Calculatable ref) {
        ref.add();
        ref.sub();
    }
}

public class InterfaceImplementationDemo {
    public static void main(String[] args) {
        Casio cas = new Casio();
        Orpat op = new Orpat();
        Citizen cit = new Citizen();

        // Calculatable calc = new Calculatable(); // Cannot instantiate interface

        Math m = new Math();

        m.permit(cas);
        m.permit(op);
        m.permit(cit);
    }
}