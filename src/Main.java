public class Main {
    public static void main(String[] args)
    {
        Bird myBird = new Bird("Tweety", "Yellow", 25);
        myBird.speak();
        myBird.fly();

        Pigeon pippa = new Pigeon("Pippa", "Grey", 150);
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
    }
}
