abstract class Bird {
    abstract public void fly();
    abstract public void eat();
}

abstract class Eagle extends Bird {
    
    public void fly() {
        System.out.println("Eagle flies at greater height");
    }
}

abstract class Sparrow extends Bird {
    
    public void fly() {
        System.out.println("Sparrow flies at lower height");
    }
}

final class GoldenEagle extends Eagle {

    public void eat() {
        System.out.println("GoldenEagle hunts over the oceans & eats");
    }
}

final class SerpentEagle extends Eagle {
 
    public void eat() {
        System.out.println("Serpent Eagle hunts over the mountains & eats");
    }
}

final class VegSparrow extends Sparrow {
   
    public void eat() {
        System.out.println("Veg Sparrow eats grains");
    }
}

final class NonVegSparrow extends Sparrow {
   
    public void eat() {
        System.out.println("NonVeg Sparrow eats worms");
    }
}

class Sky {
    public void permit(Bird ref) {
        ref.fly();
        ref.eat();
    }
}

public class BirdHierarchyDemo {
    public static void main(String[] args) {
        GoldenEagle ge = new GoldenEagle();
        SerpentEagle se = new SerpentEagle();
        VegSparrow vs = new VegSparrow();
        NonVegSparrow nvs = new NonVegSparrow();

        Sky s = new Sky();

        s.permit(ge);
        s.permit(se);
        s.permit(vs);
        s.permit(nvs);
    }
}

