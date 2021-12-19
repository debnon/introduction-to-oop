public class Main {
    public static void main(String[] args)
    {
        Pigeon pippa = new Pigeon("Pippa", "grey", 150);
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot jack = new Parrot("Jack", "red");
        jack.speak();
        jack.spin();
        jack.doTheCaterpillar();
        jack.jump();
    }
}
