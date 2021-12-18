public class Parrot extends Bird {

    public Parrot(String name, String colour)
    {
        super(name, colour, 50);
    }

    @Override
    public void speak()
    {
        System.out.println("Ahoy maties! I'm " + name + " the " + colour + " parrot.");
    }
}
