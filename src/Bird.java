public class Bird
{

    protected String name;
    protected String colour;
    protected Integer maxSpeed;

    public Bird(String name, String colour, Integer maxSpeed)
    {
        this.name = name;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public void speak()
    {
        System.out.println(name + " wants a cracker!");
    }

    public void fly()
    {
        System.out.println("I'm " + name + " and I can fly at " + maxSpeed + " km/h!");
    }

}
