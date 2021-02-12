package circus.animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return toString() + " Quack Quack";
    }

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return "I'm " + name + ". I'm a Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    public Duck(String name) {
        this.name = name;
    }
}
