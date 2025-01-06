public class Main {
    // standard static main() method -- where the compiler look for to start
    public static void main(String[] args) {
        // ---- OOP ------------------------------------------ //
        Animal anim = new Dog();
        anim.makeNoise(); // output: Woof!

        // swap implementations
        anim = new Cat();
        anim.makeNoise(); // output: Meow!

    }
}
