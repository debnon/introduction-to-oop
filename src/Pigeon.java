public class Pigeon extends Bird
{
    public Pigeon(String name, String colour, Integer maxSpeed)
    {
        super(name, colour, maxSpeed);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + colour + " pigeon.");
    }

    public void eatPizza()
    {
        System.out.println("Delicious pizza!");
    }

    public void sleep()
    {
        System.out.println("I'm a sleeping pigeon");
    }
}
