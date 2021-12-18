public class Main {
    public static void main(String[] args)
    {
        Pigeon pippa = new Pigeon("Pippa", "grey", 150);
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();

        Parrot jack = new Parrot("Jack", "red");
        jack.speak();
    }
}
